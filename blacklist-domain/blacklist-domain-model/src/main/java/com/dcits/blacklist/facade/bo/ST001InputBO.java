package com.dcits.blacklist.facade.bo;

import com.dcits.blacklist.enums.DocClass;
import com.dcits.blacklist.enums.DocumentType;
import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.TranType;
import com.dcits.blacklist.enums.ResBranchRange;

/**
 * ST001 检查黑名单 步骤输入BO。
 * 字段定义来自门禁通过版 SPEC《ST001 检查黑名单》输入表。
 */
public class ST001InputBO {
	/** 凭证种类（非必填） */
	private DocClass docClass;
	/** 交易机构号（必填） */
	private String tranBranch;
	/** 证件类型（必填） */
	private DocumentType documentType;
	/** 证件号码（必填） */
	private String documentId;
	/** 账号（非必填） */
	private String baseAcctNo;
	/** 账户开立行行号（必填） */
	private AcctBranch acctBranch;
	/** 渠道类型（必填） */
	private SourceType sourceType;
	/** 交易代码（必填） */
	private String programId;
	/** 交易类型（必填） */
	private TranType tranType;
	/** 事件类型（必填） */
	private String eventType;
	/** 卡介质（必填） */
	private String cardMedium;
	/** 限制机构范围（必填） */
	private ResBranchRange resBranchRange;
	/** 服务代码（必填） */
	private String serviceCode;
	/** 接口服务类型（必填） */
	private String messageType;
	/** 接口服务代码（必填） */
	private String messageCode;
	/** 黑名单检查标志（必填） */
	private String blacklistCheckFlag;
	/** 服务状态（必填） */
	private String serviceStatus;
	/** 客户号（非必填） */
	private String clientNo;

	public DocClass getDocClass() {
		return docClass;
	}

	public void setDocClass(DocClass docClass) {
		this.docClass = docClass;
	}

	public String getTranBranch() {
		return tranBranch;
	}

	public void setTranBranch(String tranBranch) {
		this.tranBranch = tranBranch;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getBaseAcctNo() {
		return baseAcctNo;
	}

	public void setBaseAcctNo(String baseAcctNo) {
		this.baseAcctNo = baseAcctNo;
	}

	public AcctBranch getAcctBranch() {
		return acctBranch;
	}

	public void setAcctBranch(AcctBranch acctBranch) {
		this.acctBranch = acctBranch;
	}

	public SourceType getSourceType() {
		return sourceType;
	}

	public void setSourceType(SourceType sourceType) {
		this.sourceType = sourceType;
	}

	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public TranType getTranType() {
		return tranType;
	}

	public void setTranType(TranType tranType) {
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

	public ResBranchRange getResBranchRange() {
		return resBranchRange;
	}

	public void setResBranchRange(ResBranchRange resBranchRange) {
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
}
