package com.dcits.common.step;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 步骤类注解，通过candidateSteps属性声明本步骤执行过程中可能跳转到的其它步骤名称。运行时根据步骤返回结果的gotoStepName值来决定是否跳转以及跳转到哪个步骤。
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GotoStepCondition {
	String[] candidateSteps() ;    
}
