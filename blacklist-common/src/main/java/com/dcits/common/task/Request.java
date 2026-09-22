package com.dcits.common.task;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class Request<T> {
	/**请求报文头对象**/
	@NotNull
	@Valid
	private ReqHeader header;
	/**请求报文体对象**/
	@NotNull
	@Valid
	private T body;
	
	public ReqHeader getHeader() {
		return header;
	}
	public void setHeader(ReqHeader header) {
		this.header = header;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
}

