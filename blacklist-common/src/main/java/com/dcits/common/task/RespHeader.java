package com.dcits.common.task;

import java.util.Date;

public class RespHeader  extends Header{
	/**请求接收时间**/
	private Date receivedTime;
	/**响应返回时间**/
	private Date responseTime;
	/**是否成功**/
	private boolean succeed;
	/**错误码，成功时为null**/
	private String errorCode;
	/**错误信息，成功时为null**/
	private String errorMessage;
	public boolean isSucceed() {
		return succeed;
	}
	public void setSucceed(boolean succeed) {
		this.succeed = succeed;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public RespHeader(){};
	public RespHeader(ReqHeader reqHeader){
		this.setServiceCode(reqHeader.getServiceCode());
		this.setTransSeqNo(reqHeader.getTransSeqNo());
		this.receivedTime= new Date();
	}
	public Date getReceivedTime(){ return receivedTime;}
	public Date getResponseTime(){ return responseTime;}
	public void markResponse(){ this.responseTime=new Date();}
}