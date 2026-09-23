package com.dcits.blacklist.facade.bo;

import com.dcits.blacklist.enums.DealFlow;
import com.dcits.common.step.StepResult;

/**
 * ST001 检查黑名单 步骤输出BO。
 * 检查结果约定：succeed=true 且 dealFlow=null 表示检查结果“通过”
 * （DealFlow 仅 A-授权处理、B-拒绝处理、D-提醒处理，无“通过”常量）；
 * succeed、errorCode、errorMessage 由基类 StepResult 承载。
 */
public class ST001OutputBO extends StepResult {
	/** 处理方式（非必填） */
	private DealFlow dealFlow;

	public DealFlow getDealFlow() {
		return dealFlow;
	}

	public void setDealFlow(DealFlow dealFlow) {
		this.dealFlow = dealFlow;
	}
}
