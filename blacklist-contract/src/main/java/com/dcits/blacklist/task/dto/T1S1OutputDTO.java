package com.dcits.blacklist.task.dto;

/**
 * T1S1 检查黑名单 输出DTO
 */
public class T1S1OutputDTO {

	/** 处理方式 */
	private String dealFlow;

	/** 检查结果：通过/拒绝/授权/提醒 */
	private String checkResult;

	public String getDealFlow() {
		return dealFlow;
	}

	public void setDealFlow(String dealFlow) {
		this.dealFlow = dealFlow;
	}

	public String getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
}
