package com.dcits;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 既定外部系统接口 mock：外部系统无真实服务，按知识《外部接口清单》暴露本地 GET 桩，
 * 调用地址与各组件客户端调用地址一致，目标服务统一按 http://localhost:8980 部署，部署时按环境调整。
 * 只 logger.debug、不抛异常。
 */
@RestController
public class MockExternalTask {

	private static final Logger logger = LoggerFactory.getLogger(MockExternalTask.class);

	/** 生成账号 mock 的自增序号 */
	private final AtomicLong acctNoSeq = new AtomicLong();

	/**
	 * 产品管理 · 查询产品信息：按「产品编号 + 参数KEY值」查产品定义表 MB_PROD_DEFINE 取属性值 ATTR_VALUE。
	 * 本工程无 MB_PROD_DEFINE 表访问组件（Bcc），查询结果为空，按清单约定返回空串。
	 */
	@GetMapping("/productManagement/queryProductInfo")
	public Map<String, Object> queryProductInfo(@RequestParam String prodNo, @RequestParam String attrKey) {
		logger.debug("queryProductInfo mock: prodNo={}, attrKey={}, 本工程无 MB_PROD_DEFINE 表访问组件，查询结果为空", prodNo, attrKey);
		Map<String, Object> result = new LinkedHashMap<>();
		result.put("acctType", "");
		result.put("withdrawalTypeList", List.of());
		result.put("ccyList", List.of());
		result.put("allowSuspendFlag", "");
		result.put("allDepFlag", "");
		result.put("allDraFlag", "");
		result.put("clientType", "");
		result.put("inlandOffshoreFlag", "");
		result.put("branchList", List.of());
		result.put("acctAttr", "");
		return result;
	}

	/**
	 * 产品管理 · 查询产品利率信息：按产品编号查产品利率信息表 MB_PROD_INT 取首条记录。
	 * 本工程无 MB_PROD_INT 表访问组件（Bcc），查询结果为空，按清单约定返回空串。
	 */
	@GetMapping("/productManagement/queryProductInterestRate")
	public Map<String, Object> queryProductInterestRate(@RequestParam String prodNo) {
		logger.debug("queryProductInterestRate mock: prodNo={}, 本工程无 MB_PROD_INT 表访问组件，查询结果为空", prodNo);
		Map<String, Object> result = new LinkedHashMap<>();
		result.put("intTypeList", List.of());
		result.put("prodIntRate", "");
		result.put("maxExecRate", "");
		result.put("minExecRate", "");
		return result;
	}

	/**
	 * 基础公共 · 生成账号：不查表，按三个入参拼装账号返回（固定前缀 + 交易机构 + 序号）。
	 */
	@GetMapping("/basicCommon/genAcctNo")
	public Map<String, Object> genAcctNo(@RequestParam String acctGenRuleType, @RequestParam String branch,
			@RequestParam(required = false) String prodNo) {
		String acctNo = "ACCT" + branch + String.format("%06d", acctNoSeq.incrementAndGet());
		logger.debug("genAcctNo mock: acctGenRuleType={}, branch={}, prodNo={}, acctNo={}", acctGenRuleType, branch, prodNo, acctNo);
		Map<String, Object> result = new LinkedHashMap<>();
		result.put("acctNo", acctNo);
		return result;
	}

	/**
	 * 贷款 · 计算账号当日放款金额合计：不查表，按账号返回固定值 0.00。
	 */
	@GetMapping("/loan/calcAcctDailyLoanAmt")
	public Map<String, Object> calcAcctDailyLoanAmt(@RequestParam String acctNo) {
		logger.debug("calcAcctDailyLoanAmt mock: acctNo={}, dailyOverdraftAmt=0.00", acctNo);
		Map<String, Object> result = new LinkedHashMap<>();
		result.put("dailyOverdraftAmt", "0.00");
		return result;
	}
}
