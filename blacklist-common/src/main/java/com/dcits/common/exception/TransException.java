package com.dcits.common.exception;

public class TransException extends RuntimeException {

	private static final long serialVersionUID = -6457696064496371623L;

	private String errorCode;
	
	public String getErrorCode() {
		return errorCode;
	}
	protected void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	

	public TransException(String errorCode, String message){
		super(message);
		this.errorCode=errorCode;
	}

}
