package com.dcits.common.task;

import jakarta.validation.constraints.NotBlank;

public abstract class Header {
	/**交易码/服务代码**/
	@NotBlank
	private String serviceCode;
	/**交易流水号**/
	@NotBlank
	private String transSeqNo;
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getTransSeqNo() {
		return transSeqNo;
	}
	public void setTransSeqNo(String transSeqNo) {
		this.transSeqNo = transSeqNo;
	}
	
}
