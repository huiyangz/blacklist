package com.dcits.blacklist.facade.bo;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.DocClass;
import com.dcits.blacklist.enums.DocumentType;
import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.TranType;

/**
 * ST001 检查黑名单 步骤输入BO
 */
public class ST001InputBO {

	/** 凭证种类 */
	private DocClass docClass;

	/** 账号 */
	private String baseAcctNo;

	/** 渠道类型 */
	private SourceType sourceType;

	/** 交易代码 */
	private String programId;

	/** 交易类型 */
	private TranType tranType;

	/** 事件类型 */
	private String eventType;

	/** 服务代码 */
	private String serviceCode;

	/** 接口服务类型 */
	private String messageType;

	/** 接口服务代码 */
	private String messageCode;

	/** 客户号 */
	private String clientNo;

	/** 证件号码 */
	private String documentId;

	/** 证件类型 */
	private DocumentType documentType;

	/** 交易机构 */
	private AcctBranch tranBranch;

	public DocClass getDocClass() {
		return docClass;
	}

	public void setDocClass(DocClass docClass) {
		this.docClass = docClass;
	}

	public String getBaseAcctNo() {
		return baseAcctNo;
	}

	public void setBaseAcctNo(String baseAcctNo) {
		this.baseAcctNo = baseAcctNo;
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

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public AcctBranch getTranBranch() {
		return tranBranch;
	}

	public void setTranBranch(AcctBranch tranBranch) {
		this.tranBranch = tranBranch;
	}
}
