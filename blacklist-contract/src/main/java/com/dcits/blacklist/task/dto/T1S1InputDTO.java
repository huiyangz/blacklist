package com.dcits.blacklist.task.dto;

import jakarta.validation.constraints.NotNull;

/**
 * T1S1 检查黑名单 场景输入DTO。
 * 字段定义来自门禁通过版 SPEC《T1S1 检查黑名单》输入表（17 字段，全部必填）。
 */
public class T1S1InputDTO {
	/** 凭证种类（必填） */
	@NotNull
	private String docClass;
	/** 账号（必填） */
	@NotNull
	private String baseAcctNo;
	/** 账户开立行行号（必填） */
	@NotNull
	private String acctBranch;
	/** 渠道类型（必填） */
	@NotNull
	private String sourceType;
	/** 交易代码（必填） */
	@NotNull
	private String programId;
	/** 交易类型（必填） */
	@NotNull
	private String tranType;
	/** 事件类型（必填） */
	@NotNull
	private String eventType;
	/** 卡介质（必填） */
	@NotNull
	private String cardMedium;
	/** 限制机构范围（必填） */
	@NotNull
	private String resBranchRange;
	/** 服务代码（必填） */
	@NotNull
	private String serviceCode;
	/** 接口服务类型（必填） */
	@NotNull
	private String messageType;
	/** 接口服务代码（必填） */
	@NotNull
	private String messageCode;
	/** 黑名单检查标志（必填） */
	@NotNull
	private String blacklistCheckFlag;
	/** 服务状态（必填） */
	@NotNull
	private String serviceStatus;
	/** 客户号（必填） */
	@NotNull
	private String clientNo;
	/** 证件号码（必填） */
	@NotNull
	private String documentId;
	/** 证件类型（必填） */
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

	public String getAcctBranch() {
		return acctBranch;
	}

	public void setAcctBranch(String acctBranch) {
		this.acctBranch = acctBranch;
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

	public String getCardMedium() {
		return cardMedium;
	}

	public void setCardMedium(String cardMedium) {
		this.cardMedium = cardMedium;
	}

	public String getResBranchRange() {
		return resBranchRange;
	}

	public void setResBranchRange(String resBranchRange) {
		this.resBranchRange = resBranchRange;
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

	public String getBlacklistCheckFlag() {
		return blacklistCheckFlag;
	}

	public void setBlacklistCheckFlag(String blacklistCheckFlag) {
		this.blacklistCheckFlag = blacklistCheckFlag;
	}

	public String getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
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
