package com.dcits.blacklist.facade.bo;

import com.dcits.blacklist.enums.DealFlow;
import com.dcits.common.step.StepResult;

/**
 * ST001 检查黑名单 步骤输出BO
 */
public class ST001OutputBO extends StepResult {

	/** 处理方式 */
	private DealFlow dealFlow;

	/** 检查结果：通过/拒绝/授权/提醒 */
	private String checkResult;

	public DealFlow getDealFlow() {
		return dealFlow;
	}

	public void setDealFlow(DealFlow dealFlow) {
		this.dealFlow = dealFlow;
	}

	public String getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
}
