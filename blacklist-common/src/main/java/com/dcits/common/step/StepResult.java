package com.dcits.common.step;

public abstract class StepResult {
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
}
