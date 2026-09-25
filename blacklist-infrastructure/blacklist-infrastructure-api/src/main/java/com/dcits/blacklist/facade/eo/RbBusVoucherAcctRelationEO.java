package com.dcits.blacklist.facade.eo;

import com.dcits.blacklist.enums.AcctCcy;
import com.dcits.blacklist.enums.CanReasonCode;
import com.dcits.blacklist.enums.DocClass;
import com.dcits.blacklist.enums.DocType;
import com.dcits.blacklist.enums.OldStatus;
import jakarta.validation.constraints.NotNull;

public class RbBusVoucherAcctRelationEO {
    /** 卡号 */
    private String cardNo;
    /** 凭证号 */
    @NotNull
    private String voucherNo;
    /** 账户序号 */
    private String acctSeqNo;
    /** 账户币种 */
    private AcctCcy acctCcy;
    /** 交易日期 */
    private java.util.Date tranDate;
    /** 抵质押标志 */
    private String collatInd;
    /** 凭证类型 */
    @NotNull
    private DocType docType;
    /** 摘要 */
    private String narrative;
    /** 凭证种类 */
    private DocClass docClass;
    /** 创建时间戳 */
    @NotNull
    private String createTimestamp;
    /** 最后修改时间戳 */
    @NotNull
    private String lastUpdTimestamp;
    /** 原凭证状态 */
    @NotNull
    private OldStatus oldStatus;
    /** 抵质押编号 */
    private String collatNo;
    /** 产品编号 */
    private String prodNo;
    /** 凭证前缀编码 */
    private String prefix;
    /** 账号 */
    @NotNull
    private String baseAcctNo;
    /** 作废原因代码 */
    private CanReasonCode canReasonCode;
    /** 交易参考号 */
    private String reference;
    /** 凭证状态 */
    @NotNull
    private OldStatus voucherStatus;

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

    public AcctCcy getAcctCcy() {
        return acctCcy;
    }

    public void setAcctCcy(AcctCcy acctCcy) {
        this.acctCcy = acctCcy;
    }

    public java.util.Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(java.util.Date tranDate) {
        this.tranDate = tranDate;
    }

    public String getCollatInd() {
        return collatInd;
    }

    public void setCollatInd(String collatInd) {
        this.collatInd = collatInd;
    }

    public DocType getDocType() {
        return docType;
    }

    public void setDocType(DocType docType) {
        this.docType = docType;
    }

    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    public DocClass getDocClass() {
        return docClass;
    }

    public void setDocClass(DocClass docClass) {
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

    public OldStatus getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(OldStatus oldStatus) {
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

    public CanReasonCode getCanReasonCode() {
        return canReasonCode;
    }

    public void setCanReasonCode(CanReasonCode canReasonCode) {
        this.canReasonCode = canReasonCode;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OldStatus getVoucherStatus() {
        return voucherStatus;
    }

    public void setVoucherStatus(OldStatus voucherStatus) {
        this.voucherStatus = voucherStatus;
    }
}