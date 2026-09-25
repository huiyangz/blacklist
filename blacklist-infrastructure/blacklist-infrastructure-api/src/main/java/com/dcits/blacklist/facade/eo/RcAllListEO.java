package com.dcits.blacklist.facade.eo;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.DocumentType;
import com.dcits.blacklist.enums.IssCountry;
import com.dcits.blacklist.enums.ListCategory;
import com.dcits.blacklist.enums.ListOrg;
import com.dcits.blacklist.enums.RcBlackStatus;
import com.dcits.blacklist.enums.SourceType;
import jakarta.validation.constraints.NotNull;

public class RcAllListEO {
    /** 黑名单状态 */
    private RcBlackStatus rcBlackStatus;
    /** 我行黑名单标志 */
    private String ourBankFlag;
    /** 生效日期 */
    private java.util.Date effectDate;
    /** 客户名称 */
    private String clientName;
    /** 其它账户限制标志 */
    private String otherAcctResFlag;
    /** 摘要 */
    private String narrative;
    /** 名单种类 */
    private ListCategory listCategory;
    /** 限制编号范围 */
    private String resSeqNos;
    /** 当前账户限制标志 */
    private String curAcctResFlag;
    /** 数据值 */
    @NotNull
    private String dataValue;
    /** 客户号 */
    private String clientNo;
    /** 登记机构号 */
    private AcctBranch inputBranch;
    /** 交易日期 */
    private java.util.Date tranDate;
    /** 黑名单序号 */
    @NotNull
    private String rcSeqNo;
    /** 黑名单数据类型 */
    @NotNull
    private String dataType;
    /** 证件类型 */
    private DocumentType documentType;
    /** 名单送审机构号 */
    private ListOrg listOrg;
    /** 最后修改时间戳 */
    @NotNull
    private String lastUpdTimestamp;
    /** 交易机构号 */
    private AcctBranch tranBranch;
    /** 渠道类型 */
    private SourceType sourceType;
    /** 交易柜员号 */
    private String userId;
    /** 渠道控制编号集合 */
    private String controlNos;
    /** 到期日期 */
    private java.util.Date maturityDate;
    /** 关联账户核实标志 */
    private String relVerifyFlag;
    /** 名单类型代码 */
    @NotNull
    private String listType;
    /** 账户名称 */
    private String acctName;
    /** 发证国家 */
    private IssCountry issCountry;
    /** 创建时间戳 */
    @NotNull
    private String createTimestamp;

    public RcBlackStatus getRcBlackStatus() {
        return rcBlackStatus;
    }

    public void setRcBlackStatus(RcBlackStatus rcBlackStatus) {
        this.rcBlackStatus = rcBlackStatus;
    }

    public String getOurBankFlag() {
        return ourBankFlag;
    }

    public void setOurBankFlag(String ourBankFlag) {
        this.ourBankFlag = ourBankFlag;
    }

    public java.util.Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(java.util.Date effectDate) {
        this.effectDate = effectDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getOtherAcctResFlag() {
        return otherAcctResFlag;
    }

    public void setOtherAcctResFlag(String otherAcctResFlag) {
        this.otherAcctResFlag = otherAcctResFlag;
    }

    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    public ListCategory getListCategory() {
        return listCategory;
    }

    public void setListCategory(ListCategory listCategory) {
        this.listCategory = listCategory;
    }

    public String getResSeqNos() {
        return resSeqNos;
    }

    public void setResSeqNos(String resSeqNos) {
        this.resSeqNos = resSeqNos;
    }

    public String getCurAcctResFlag() {
        return curAcctResFlag;
    }

    public void setCurAcctResFlag(String curAcctResFlag) {
        this.curAcctResFlag = curAcctResFlag;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public AcctBranch getInputBranch() {
        return inputBranch;
    }

    public void setInputBranch(AcctBranch inputBranch) {
        this.inputBranch = inputBranch;
    }

    public java.util.Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(java.util.Date tranDate) {
        this.tranDate = tranDate;
    }

    public String getRcSeqNo() {
        return rcSeqNo;
    }

    public void setRcSeqNo(String rcSeqNo) {
        this.rcSeqNo = rcSeqNo;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public ListOrg getListOrg() {
        return listOrg;
    }

    public void setListOrg(ListOrg listOrg) {
        this.listOrg = listOrg;
    }

    public String getLastUpdTimestamp() {
        return lastUpdTimestamp;
    }

    public void setLastUpdTimestamp(String lastUpdTimestamp) {
        this.lastUpdTimestamp = lastUpdTimestamp;
    }

    public AcctBranch getTranBranch() {
        return tranBranch;
    }

    public void setTranBranch(AcctBranch tranBranch) {
        this.tranBranch = tranBranch;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getControlNos() {
        return controlNos;
    }

    public void setControlNos(String controlNos) {
        this.controlNos = controlNos;
    }

    public java.util.Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(java.util.Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getRelVerifyFlag() {
        return relVerifyFlag;
    }

    public void setRelVerifyFlag(String relVerifyFlag) {
        this.relVerifyFlag = relVerifyFlag;
    }

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public IssCountry getIssCountry() {
        return issCountry;
    }

    public void setIssCountry(IssCountry issCountry) {
        this.issCountry = issCountry;
    }

    public String getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}