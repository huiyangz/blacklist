package com.dcits.blacklist.entity;

import java.util.Date;

public class RbBusVoucherAcctRelation {
    /** 卡号 */
    private String cardNo;
    /** 凭证号 */
    private String voucherNo;
    /** 账户序号 */
    private String acctSeqNo;
    /** 账户币种 */
    private String acctCcy;
    /** 交易日期 */
    private Date tranDate;
    /** 抵质押标志 */
    private String collatInd;
    /** 凭证类型 */
    private String docType;
    /** 摘要 */
    private String narrative;
    /** 凭证种类 */
    private String docClass;
    /** 创建时间戳 */
    private String createTimestamp;
    /** 最后修改时间戳 */
    private String lastUpdTimestamp;
    /** 原凭证状态 */
    private String oldStatus;
    /** 抵质押编号 */
    private String collatNo;
    /** 产品编号 */
    private String prodNo;
    /** 凭证前缀编码 */
    private String prefix;
    /** 账号 */
    private String baseAcctNo;
    /** 作废原因代码 */
    private String canReasonCode;
    /** 交易参考号 */
    private String reference;
    /** 凭证状态 */
    private String voucherStatus;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getVoucherNo() {
        return voucherNo;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }

    public String getAcctSeqNo() {
        return acctSeqNo;
    }

    public void setAcctSeqNo(String acctSeqNo) {
        this.acctSeqNo = acctSeqNo;
    }

    public String getAcctCcy() {
        return acctCcy;
    }

    public void setAcctCcy(String acctCcy) {
        this.acctCcy = acctCcy;
    }

    public Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }

    public String getCollatInd() {
        return collatInd;
    }

    public void setCollatInd(String collatInd) {
        this.collatInd = collatInd;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    public String getDocClass() {
        return docClass;
    }

    public void setDocClass(String docClass) {
        this.docClass = docClass;
    }

    public String getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getLastUpdTimestamp() {
        return lastUpdTimestamp;
    }

    public void setLastUpdTimestamp(String lastUpdTimestamp) {
        this.lastUpdTimestamp = lastUpdTimestamp;
    }

    public String getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
    }

    public String getCollatNo() {
        return collatNo;
    }

    public void setCollatNo(String collatNo) {
        this.collatNo = collatNo;
    }

    public String getProdNo() {
        return prodNo;
    }

    public void setProdNo(String prodNo) {
        this.prodNo = prodNo;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getBaseAcctNo() {
        return baseAcctNo;
    }

    public void setBaseAcctNo(String baseAcctNo) {
        this.baseAcctNo = baseAcctNo;
    }

    public String getCanReasonCode() {
        return canReasonCode;
    }

    public void setCanReasonCode(String canReasonCode) {
        this.canReasonCode = canReasonCode;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getVoucherStatus() {
        return voucherStatus;
    }

    public void setVoucherStatus(String voucherStatus) {
        this.voucherStatus = voucherStatus;
    }
}