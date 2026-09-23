package com.dcits.blacklist.task.dto;

/**
 * T1S1 检查黑名单 场景输出DTO。
 * 字段定义来自门禁通过版 SPEC《T1S1 检查黑名单》输出表；
 * 响应状态由传入的 RespHeader 承载，本类不包含头与错误字段。
 */
public class T1S1OutputDTO {
	/** 处理方式（非必填）：ST001 检查结果为“通过”时为 null，否则为 DealFlow 业务值（A-授权/B-拒绝/D-提醒） */
	private String dealFlow;

	public String getDealFlow() {
		return dealFlow;
	}

	public void setDealFlow(String dealFlow) {
		this.dealFlow = dealFlow;
	}
}
