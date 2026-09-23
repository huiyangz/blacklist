package com.dcits.common.task;

public class Response<T> {
	/**响应报文头对象**/
	private RespHeader header;
	/**响应报文体对象**/
	private T body;
	public RespHeader getHeader() {
		return header;
	}
	public void setHeader(RespHeader header) {
		this.header = header;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	public Response(){};
	public Response(RespHeader header, T body){
		this.header=header;
		this.body=body;
		this.header.markResponse();
	}
}
