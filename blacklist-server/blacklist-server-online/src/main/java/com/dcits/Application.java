package com.dcits;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.properties.SpringDocConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.dcits.common.exception.TransException;
import com.dcits.common.task.*;

@Configuration
@ComponentScan(basePackages={"com.dcits"})
@MapperScan(basePackages="com.dcits.blacklist.repo")
@EnableTransactionManagement(order=Ordered.LOWEST_PRECEDENCE - 10)
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	private static final Logger logger =LoggerFactory.getLogger(Application.class);

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Aspect
	@Component
	public class TaskContractAspect{
		@Around("target(taskContract) && execution(public * execute*(..)) ")
		public Object scenarioMethod(ProceedingJoinPoint pjd, ITaskContract taskContract) throws Throwable {
			Request<?> req=(Request<?>)(pjd.getArgs()[0]);
			ITaskContract.initContext(req);
			Response<?> resp= (Response<?>)(pjd.proceed());
			if (!resp.getHeader().isSucceed())
				throw new TransException(resp.getHeader().getErrorCode(),resp.getHeader().getErrorMessage());
			return resp;
		}
	}

	@RestControllerAdvice
	public static class GlobalExceptionHandler {

		@ResponseStatus(HttpStatus.BAD_REQUEST)
		@ExceptionHandler(MethodArgumentNotValidException.class)
		public Map<String, Object> handleValidationExceptions(MethodArgumentNotValidException ex) {
			RespHeader header = ITaskContract.getContext()!=null?ITaskContract.getContext().getRespHeader():new RespHeader();			 
			header.setSucceed(false);
			header.setErrorCode("RB-999998");
			List<String> messages=new ArrayList<>();
			for (FieldError error : ex.getBindingResult().getFieldErrors()) {
				messages.add(error.getField()+":"+error.getCode());
			}
			String errorMessage=String.join(";", messages);
			header.setErrorMessage(errorMessage);
			logger.error("参数校验错误:{}",errorMessage);
			header.markResponse();
			return Map.of("header",header);
		}
		
		@ExceptionHandler(value = {TransException.class, Exception.class})
		@ResponseBody
		public Map<String, Object> exceptionErrorHandler(HttpServletResponse resp,Exception ex) throws Exception {
			RespHeader header = ITaskContract.getContext()!=null?ITaskContract.getContext().getRespHeader():new RespHeader();			 
			header.setSucceed(false);
			if (ex instanceof TransException tex){
				header.setErrorCode(tex.getErrorCode());
				header.setErrorMessage(tex.getMessage());
			}else{
				header.setErrorCode("RB-999999");
				header.setErrorMessage(ExceptionUtils.getRootCauseMessage(ex));
			}
			
			logger.error("运行错误：{}",String.join(" ", ExceptionUtils.getRootCauseStackTraceList(ex)));
			header.markResponse();
			return Map.of("header",header);
		}
	}
	
	public static class BatchTestFilter implements Filter {
		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {
			ITaskContract.initContext(null);
			MDC.put("batchId", ((HttpServletRequest) request).getHeader("Test-Batch-Id"));
			String caseId=((HttpServletRequest) request).getHeader("Test-Case-Id");
			MDC.put("caseId", caseId);
			logger.info("开始执行{}",caseId);
			chain.doFilter(request, response);		
			logger.info("结束执行{}",caseId);
			MDC.clear();
		}		
	}
	
	@Bean
    FilterRegistrationBean<BatchTestFilter> registerFilter() {
        FilterRegistrationBean<BatchTestFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new BatchTestFilter());
        //url拦截
        registrationBean.addUrlPatterns("/steps/*","/tasks/*"); 
        registrationBean.setOrder(Ordered.LOWEST_PRECEDENCE - 100);
        registrationBean.setAsyncSupported(true);
        return registrationBean;
    }	
	
	@Bean
	public GroupedOpenApi clientGroup() {
		return GroupedOpenApi.builder().group("Application")
				.addOpenApiCustomizer(openApi -> openApi.openapi(SpringDocConfigProperties.ApiDocs.OpenApiVersion.OPENAPI_3_0.getVersion())
						.info(new Info()
								.title("业务建模应用组件微服务接口").version("1.0")
								.description("Application RESTful APIs")
								.contact(new Contact().name("Administartor").url("http://localhost").email("admin@AiCoding")))
						)
				.packagesToScan(this.getClass().getPackageName())
				.build();
	}
	public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class, args);
	}	
}
