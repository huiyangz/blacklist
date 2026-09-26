package com.dcits.blacklist.task.dto;

import jakarta.validation.constraints.NotNull;

/**
 * T1S1 检查黑名单 输入DTO
 */
public class T1S1InputDTO {

	/** 凭证种类 */
	@NotNull
	private String docClass;

	/** 账号 */
	@NotNull
	private String baseAcctNo;

	/** 交易机构 */
	@NotNull
	private String tranBranch;

	/** 渠道类型 */
	@NotNull
	private String sourceType;

	/** 交易代码 */
	@NotNull
	private String programId;

	/** 交易类型 */
	@NotNull
	private String tranType;

	/** 事件类型 */
	@NotNull
	private String eventType;

	/** 服务代码 */
	@NotNull
	private String serviceCode;

	/** 接口服务类型 */
	@NotNull
	private String messageType;

	/** 接口服务代码 */
	@NotNull
	private String messageCode;

	/** 客户号 */
	@NotNull
	private String clientNo;

	/** 证件号码 */
	@NotNull
	private String documentId;

	/** 证件类型 */
	@NotNull
	private String documentType;

	public String getDocClass() {
		return docClass;
	}

	public void setDocClass(String docClass) {
		this.docClass = docClass;
	}

	public String getBaseAcctNo() {
		return baseAcctNo;
	}

	public void setBaseAcctNo(String baseAcctNo) {
		this.baseAcctNo = baseAcctNo;
	}

	public String getTranBranch() {
		return tranBranch;
	}

	public void setTranBranch(String tranBranch) {
		this.tranBranch = tranBranch;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public String getTranType() {
		return tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getClientNo() {
		return clientNo;
	}

	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
}
