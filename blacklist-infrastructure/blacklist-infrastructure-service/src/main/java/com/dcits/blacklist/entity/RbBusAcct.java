package com.dcits.blacklist.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RbBusAcct {
    /** 创建时间戳 */
    private String createTimestamp;
    /** 客户号 */
    private String clientNo;
    /** 账户开户日期 */
    private Date acctOpenDate;
    /** 存期期限 */
    private String term;
    /** 账户英文名称 */
    private String acctNameEn;
    /** 自贸区账户标志 */
    private String ftaAcctFlag;
    /** 周期类型 */
    private String termType;
    /** 通兑范围 */
    private String allDraRange;
    /** 存款性质 */
    private String depositNature;
    /** 账户核实标志 */
    private String acctVerifyFlag;
    /** 销户日期 */
    private Date acctCloseDate;
    /** 账户属性 */
    private String acctNatureNo;
    /** 农户标志 */
    private String farmerFlag;
    /** 年检日期 */
    private Date annualDate;
    /** 上一交易日期 */
    private Date lastTranDate;
    /** 本息转存次数 */
    private Integer rolloverNo;
    /** 客户类型 */
    private String clientType;
    /** 最后修改时间戳 */
    private String lastUpdTimestamp;
    /** 实时追缴标志 */
    private String recoverFlag;
    /** 账户转存期限 */
    private String autoRenewTerm;
    /** 账户名称 */
    private String acctName;
    /** 主账户标志 */
    private String leadAcctFlag;
    /** 自贸区编号 */
    private String ftaNo;
    /** 产品编号 */
    private String prodNo;
    /** 计息标志 */
    private String intIndFlag;
    /** 按频率付息标志 */
    private String cycleIntFlag;
    /** 允许账户转久悬标志 */
    private String allowSuspendFlag;
    /** 对公存款账户用途 */
    private String rbBusAcctPurpose;
    /** 抵质押标志 */
    private String collatInd;
    /** 最早支取日期 */
    private Date firstDrawDate;
    /** 自动续存标志 */
    private String autoDep;
    /** 简易账户标志 */
    private String simpleAcct;
    /** 税率 */
    private BigDecimal taxRate;
    /** 利息税征收标志 */
    private String intTaxLevy;
    /** 客户经理名称 */
    private String acctExecName;
    /** 账户到期日期 */
    private Date acctDueDate;
    /** 核准件编号 */
    private String apprLetterNo;
    /** 自动转存标志 */
    private String autoRenewInd;
    /** 监管原因 */
    private String manageContent;
    /** 账户状态 */
    private String acctStatus;
    /** 定制账户标志 */
    private String specAcctFlag;
    /** 查证类型 */
    private String checkCertificateType;
    /** 账户上一状态 */
    private String acctStatusPrev;
    /** 账户开立行行号 */
    private String acctBranch;
    /** 管理机构号 */
    private String homeBranch;
    /** 允许自动销户标志 */
    private String isAllowClose;
    /** 本息已转存次数 */
    private Integer timesRolledover;
    /** 对公账户年检上一重置日期 */
    private Date lastResetDate;
    /** 转不动户日期 */
    private Date dormantDate;
    /** 本金转存次数 */
    private Integer renewNo;
    /** 通存范围 */
    private String allDepRange;
    /** 账户币种 */
    private String acctCcy;
    /** 卡号 */
    private String cardNo;
    /** 上一年检截止日期 */
    private Date lastStopDate;
    /** 账户机密标志 */
    private String secretAcct;
    /** 到期转存方式 */
    private String renewMethod;
    /** 监管账户标志 */
    private String manageFlag;
    /** 账户风险级别 */
    private String acctRiskLevel;
    /** 查证金额 */
    private BigDecimal checkCertificateAmt;
    /** 允许出售支票标志 */
    private String isSellCheque;
    /** 监管账户类型 */
    private String manageType;
    /** 推介人名称 */
    private String promoterName;
    /** 推介人编号 */
    private String promoterCode;
    /** 漏存次数 */
    private Integer termLack;
    /** 账户转存存期类型 */
    private String autoRenewTermType;
    /** 存款账户类型 */
    private String rbAcctType;
    /** 生效日期 */
    private Date effectDate;
    /** 本金已转存次数 */
    private Integer timesRenewed;
    /** 年检标志 */
    private String annualFlag;
    /** 客户经理工号 */
    private String acctExecCode;
    /** 账户虚实标志 */
    private String acctRealFlag;
    /** 存款到期日期 */
    private Date depMaturityDate;
    /** 渠道类型 */
    private String sourceType;
    /** 累计可支取本金 */
    private BigDecimal totalDrawAmt;
    /** 联合账户标志 */
    private String jointAcctFlag;
    /** 账号 */
    private String baseAcctNo;
    /** 年检状态标志 */
    private String annualStatus;
    /** 余额类型 */
    private String balType;
    /** 免收费标志 */
    private String managementFreeFlag;
    /** 账户许可证日期 */
    private Date acctLicenseDate;
    /** 账户余额止付标志 */
    private String acctStopPay;
    /** 贷款资金管控标志 */
    private String loanFundFlag;
    /** 强制扣划违约标志 */
    private String impoundFad;
    /** 账户限制状态标志 */
    private String acctResStatus;
    /** 开户许可证编号 */
    private String acctLicenseNo;
    /** 上级账户内部键 */
    private Integer parentInternalKey;
    /** 优惠利息税率到期日期 */
    private Date taxDiscountMaturityDate;
    /** 定期账户细类 */
    private String fixedCall;
    /** 账户核实结果 */
    private String acctVerifyResult;
    /** 通存标识 */
    private String allDepInd;
    /** 离岸标志 */
    private String osaFlag;
    /** 涉案标识 */
    private String caseInvolvedFlag;
    /** 通兑机构编号 */
    private String allDraIntBranch;
    /** 部分本金转存标志 */
    private String partialRenewRoll;
    /** 自动结清标志 */
    private String autoSettleFlag;
    /** 通兑标识 */
    private String allDraInd;
    /** 归属条线名称 */
    private String lineOwnerShip;
    /** 账户内部键值 */
    private Integer internalKey;
    /** 销户原因 */
    private String acctCloseReason;

    public String getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public Date getAcctOpenDate() {
        return acctOpenDate;
    }

    public void setAcctOpenDate(Date acctOpenDate) {
        this.acctOpenDate = acctOpenDate;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAcctNameEn() {
        return acctNameEn;
    }

    public void setAcctNameEn(String acctNameEn) {
        this.acctNameEn = acctNameEn;
    }

    public String getFtaAcctFlag() {
        return ftaAcctFlag;
    }

    public void setFtaAcctFlag(String ftaAcctFlag) {
        this.ftaAcctFlag = ftaAcctFlag;
    }

    public String getTermType() {
        return termType;
    }

    public void setTermType(String termType) {
        this.termType = termType;
    }

    public String getAllDraRange() {
        return allDraRange;
    }

    public void setAllDraRange(String allDraRange) {
        this.allDraRange = allDraRange;
    }

    public String getDepositNature() {
        return depositNature;
    }

    public void setDepositNature(String depositNature) {
        this.depositNature = depositNature;
    }

    public String getAcctVerifyFlag() {
        return acctVerifyFlag;
    }

    public void setAcctVerifyFlag(String acctVerifyFlag) {
        this.acctVerifyFlag = acctVerifyFlag;
    }

    public Date getAcctCloseDate() {
        return acctCloseDate;
    }

    public void setAcctCloseDate(Date acctCloseDate) {
        this.acctCloseDate = acctCloseDate;
    }

    public String getAcctNatureNo() {
        return acctNatureNo;
    }

    public void setAcctNatureNo(String acctNatureNo) {
        this.acctNatureNo = acctNatureNo;
    }

    public String getFarmerFlag() {
        return farmerFlag;
    }

    public void setFarmerFlag(String farmerFlag) {
        this.farmerFlag = farmerFlag;
    }

    public Date getAnnualDate() {
        return annualDate;
    }

    public void setAnnualDate(Date annualDate) {
        this.annualDate = annualDate;
    }

    public Date getLastTranDate() {
        return lastTranDate;
    }

    public void setLastTranDate(Date lastTranDate) {
        this.lastTranDate = lastTranDate;
    }

    public Integer getRolloverNo() {
        return rolloverNo;
    }

    public void setRolloverNo(Integer rolloverNo) {
        this.rolloverNo = rolloverNo;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getLastUpdTimestamp() {
        return lastUpdTimestamp;
    }

    public void setLastUpdTimestamp(String lastUpdTimestamp) {
        this.lastUpdTimestamp = lastUpdTimestamp;
    }

    public String getRecoverFlag() {
        return recoverFlag;
    }

    public void setRecoverFlag(String recoverFlag) {
        this.recoverFlag = recoverFlag;
    }

    public String getAutoRenewTerm() {
        return autoRenewTerm;
    }

    public void setAutoRenewTerm(String autoRenewTerm) {
        this.autoRenewTerm = autoRenewTerm;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getLeadAcctFlag() {
        return leadAcctFlag;
    }

    public void setLeadAcctFlag(String leadAcctFlag) {
        this.leadAcctFlag = leadAcctFlag;
    }

    public String getFtaNo() {
        return ftaNo;
    }

    public void setFtaNo(String ftaNo) {
        this.ftaNo = ftaNo;
    }

    public String getProdNo() {
        return prodNo;
    }

    public void setProdNo(String prodNo) {
        this.prodNo = prodNo;
    }

    public String getIntIndFlag() {
        return intIndFlag;
    }

    public void setIntIndFlag(String intIndFlag) {
        this.intIndFlag = intIndFlag;
    }

    public String getCycleIntFlag() {
        return cycleIntFlag;
    }

    public void setCycleIntFlag(String cycleIntFlag) {
        this.cycleIntFlag = cycleIntFlag;
    }

    public String getAllowSuspendFlag() {
        return allowSuspendFlag;
    }

    public void setAllowSuspendFlag(String allowSuspendFlag) {
        this.allowSuspendFlag = allowSuspendFlag;
    }

    public String getRbBusAcctPurpose() {
        return rbBusAcctPurpose;
    }

    public void setRbBusAcctPurpose(String rbBusAcctPurpose) {
        this.rbBusAcctPurpose = rbBusAcctPurpose;
    }

    public String getCollatInd() {
        return collatInd;
    }

    public void setCollatInd(String collatInd) {
        this.collatInd = collatInd;
    }

    public Date getFirstDrawDate() {
        return firstDrawDate;
    }

    public void setFirstDrawDate(Date firstDrawDate) {
        this.firstDrawDate = firstDrawDate;
    }

    public String getAutoDep() {
        return autoDep;
    }

    public void setAutoDep(String autoDep) {
        this.autoDep = autoDep;
    }

    public String getSimpleAcct() {
        return simpleAcct;
    }

    public void setSimpleAcct(String simpleAcct) {
        this.simpleAcct = simpleAcct;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getIntTaxLevy() {
        return intTaxLevy;
    }

    public void setIntTaxLevy(String intTaxLevy) {
        this.intTaxLevy = intTaxLevy;
    }

    public String getAcctExecName() {
        return acctExecName;
    }

    public void setAcctExecName(String acctExecName) {
        this.acctExecName = acctExecName;
    }

    public Date getAcctDueDate() {
        return acctDueDate;
    }

    public void setAcctDueDate(Date acctDueDate) {
        this.acctDueDate = acctDueDate;
    }

    public String getApprLetterNo() {
        return apprLetterNo;
    }

    public void setApprLetterNo(String apprLetterNo) {
        this.apprLetterNo = apprLetterNo;
    }

    public String getAutoRenewInd() {
        return autoRenewInd;
    }

    public void setAutoRenewInd(String autoRenewInd) {
        this.autoRenewInd = autoRenewInd;
    }

    public String getManageContent() {
        return manageContent;
    }

    public void setManageContent(String manageContent) {
        this.manageContent = manageContent;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }

    public String getSpecAcctFlag() {
        return specAcctFlag;
    }

    public void setSpecAcctFlag(String specAcctFlag) {
        this.specAcctFlag = specAcctFlag;
    }

    public String getCheckCertificateType() {
        return checkCertificateType;
    }

    public void setCheckCertificateType(String checkCertificateType) {
        this.checkCertificateType = checkCertificateType;
    }

    public String getAcctStatusPrev() {
        return acctStatusPrev;
    }

    public void setAcctStatusPrev(String acctStatusPrev) {
        this.acctStatusPrev = acctStatusPrev;
    }

    public String getAcctBranch() {
        return acctBranch;
    }

    public void setAcctBranch(String acctBranch) {
        this.acctBranch = acctBranch;
    }

    public String getHomeBranch() {
        return homeBranch;
    }

    public void setHomeBranch(String homeBranch) {
        this.homeBranch = homeBranch;
    }

    public String getIsAllowClose() {
        return isAllowClose;
    }

    public void setIsAllowClose(String isAllowClose) {
        this.isAllowClose = isAllowClose;
    }

    public Integer getTimesRolledover() {
        return timesRolledover;
    }

    public void setTimesRolledover(Integer timesRolledover) {
        this.timesRolledover = timesRolledover;
    }

    public Date getLastResetDate() {
        return lastResetDate;
    }

    public void setLastResetDate(Date lastResetDate) {
        this.lastResetDate = lastResetDate;
    }

    public Date getDormantDate() {
        return dormantDate;
    }

    public void setDormantDate(Date dormantDate) {
        this.dormantDate = dormantDate;
    }

    public Integer getRenewNo() {
        return renewNo;
    }

    public void setRenewNo(Integer renewNo) {
        this.renewNo = renewNo;
    }

    public String getAllDepRange() {
        return allDepRange;
    }

    public void setAllDepRange(String allDepRange) {
        this.allDepRange = allDepRange;
    }

    public String getAcctCcy() {
        return acctCcy;
    }

    public void setAcctCcy(String acctCcy) {
        this.acctCcy = acctCcy;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getLastStopDate() {
        return lastStopDate;
    }

    public void setLastStopDate(Date lastStopDate) {
        this.lastStopDate = lastStopDate;
    }

    public String getSecretAcct() {
        return secretAcct;
    }

    public void setSecretAcct(String secretAcct) {
        this.secretAcct = secretAcct;
    }

    public String getRenewMethod() {
        return renewMethod;
    }

    public void setRenewMethod(String renewMethod) {
        this.renewMethod = renewMethod;
    }

    public String getManageFlag() {
        return manageFlag;
    }

    public void setManageFlag(String manageFlag) {
        this.manageFlag = manageFlag;
    }

    public String getAcctRiskLevel() {
        return acctRiskLevel;
    }

    public void setAcctRiskLevel(String acctRiskLevel) {
        this.acctRiskLevel = acctRiskLevel;
    }

    public BigDecimal getCheckCertificateAmt() {
        return checkCertificateAmt;
    }

    public void setCheckCertificateAmt(BigDecimal checkCertificateAmt) {
        this.checkCertificateAmt = checkCertificateAmt;
    }

    public String getIsSellCheque() {
        return isSellCheque;
    }

    public void setIsSellCheque(String isSellCheque) {
        this.isSellCheque = isSellCheque;
    }

    public String getManageType() {
        return manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }

    public String getPromoterName() {
        return promoterName;
    }

    public void setPromoterName(String promoterName) {
        this.promoterName = promoterName;
    }

    public String getPromoterCode() {
        return promoterCode;
    }

    public void setPromoterCode(String promoterCode) {
        this.promoterCode = promoterCode;
    }

    public Integer getTermLack() {
        return termLack;
    }

    public void setTermLack(Integer termLack) {
        this.termLack = termLack;
    }

    public String getAutoRenewTermType() {
        return autoRenewTermType;
    }

    public void setAutoRenewTermType(String autoRenewTermType) {
        this.autoRenewTermType = autoRenewTermType;
    }

    public String getRbAcctType() {
        return rbAcctType;
    }

    public void setRbAcctType(String rbAcctType) {
        this.rbAcctType = rbAcctType;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public Integer getTimesRenewed() {
        return timesRenewed;
    }

    public void setTimesRenewed(Integer timesRenewed) {
        this.timesRenewed = timesRenewed;
    }

    public String getAnnualFlag() {
        return annualFlag;
    }

    public void setAnnualFlag(String annualFlag) {
        this.annualFlag = annualFlag;
    }

    public String getAcctExecCode() {
        return acctExecCode;
    }

    public void setAcctExecCode(String acctExecCode) {
        this.acctExecCode = acctExecCode;
    }

    public String getAcctRealFlag() {
        return acctRealFlag;
    }

    public void setAcctRealFlag(String acctRealFlag) {
        this.acctRealFlag = acctRealFlag;
    }

    public Date getDepMaturityDate() {
        return depMaturityDate;
    }

    public void setDepMaturityDate(Date depMaturityDate) {
        this.depMaturityDate = depMaturityDate;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public BigDecimal getTotalDrawAmt() {
        return totalDrawAmt;
    }

    public void setTotalDrawAmt(BigDecimal totalDrawAmt) {
        this.totalDrawAmt = totalDrawAmt;
    }

    public String getJointAcctFlag() {
        return jointAcctFlag;
    }

    public void setJointAcctFlag(String jointAcctFlag) {
        this.jointAcctFlag = jointAcctFlag;
    }

    public String getBaseAcctNo() {
        return baseAcctNo;
    }

    public void setBaseAcctNo(String baseAcctNo) {
        this.baseAcctNo = baseAcctNo;
    }

    public String getAnnualStatus() {
        return annualStatus;
    }

    public void setAnnualStatus(String annualStatus) {
        this.annualStatus = annualStatus;
    }

    public String getBalType() {
        return balType;
    }

    public void setBalType(String balType) {
        this.balType = balType;
    }

    public String getManagementFreeFlag() {
        return managementFreeFlag;
    }

    public void setManagementFreeFlag(String managementFreeFlag) {
        this.managementFreeFlag = managementFreeFlag;
    }

    public Date getAcctLicenseDate() {
        return acctLicenseDate;
    }

    public void setAcctLicenseDate(Date acctLicenseDate) {
        this.acctLicenseDate = acctLicenseDate;
    }

    public String getAcctStopPay() {
        return acctStopPay;
    }

    public void setAcctStopPay(String acctStopPay) {
        this.acctStopPay = acctStopPay;
    }

    public String getLoanFundFlag() {
        return loanFundFlag;
    }

    public void setLoanFundFlag(String loanFundFlag) {
        this.loanFundFlag = loanFundFlag;
    }

    public String getImpoundFad() {
        return impoundFad;
    }

    public void setImpoundFad(String impoundFad) {
        this.impoundFad = impoundFad;
    }

    public String getAcctResStatus() {
        return acctResStatus;
    }

    public void setAcctResStatus(String acctResStatus) {
        this.acctResStatus = acctResStatus;
    }

    public String getAcctLicenseNo() {
        return acctLicenseNo;
    }

    public void setAcctLicenseNo(String acctLicenseNo) {
        this.acctLicenseNo = acctLicenseNo;
    }

    public Integer getParentInternalKey() {
        return parentInternalKey;
    }

    public void setParentInternalKey(Integer parentInternalKey) {
        this.parentInternalKey = parentInternalKey;
    }

    public Date getTaxDiscountMaturityDate() {
        return taxDiscountMaturityDate;
    }

    public void setTaxDiscountMaturityDate(Date taxDiscountMaturityDate) {
        this.taxDiscountMaturityDate = taxDiscountMaturityDate;
    }

    public String getFixedCall() {
        return fixedCall;
    }

    public void setFixedCall(String fixedCall) {
        this.fixedCall = fixedCall;
    }

    public String getAcctVerifyResult() {
        return acctVerifyResult;
    }

    public void setAcctVerifyResult(String acctVerifyResult) {
        this.acctVerifyResult = acctVerifyResult;
    }

    public String getAllDepInd() {
        return allDepInd;
    }

    public void setAllDepInd(String allDepInd) {
        this.allDepInd = allDepInd;
    }

    public String getOsaFlag() {
        return osaFlag;
    }

    public void setOsaFlag(String osaFlag) {
        this.osaFlag = osaFlag;
    }

    public String getCaseInvolvedFlag() {
        return caseInvolvedFlag;
    }

    public void setCaseInvolvedFlag(String caseInvolvedFlag) {
        this.caseInvolvedFlag = caseInvolvedFlag;
    }

    public String getAllDraIntBranch() {
        return allDraIntBranch;
    }

    public void setAllDraIntBranch(String allDraIntBranch) {
        this.allDraIntBranch = allDraIntBranch;
    }

    public String getPartialRenewRoll() {
        return partialRenewRoll;
    }

    public void setPartialRenewRoll(String partialRenewRoll) {
        this.partialRenewRoll = partialRenewRoll;
    }

    public String getAutoSettleFlag() {
        return autoSettleFlag;
    }

    public void setAutoSettleFlag(String autoSettleFlag) {
        this.autoSettleFlag = autoSettleFlag;
    }

    public String getAllDraInd() {
        return allDraInd;
    }

    public void setAllDraInd(String allDraInd) {
        this.allDraInd = allDraInd;
    }

    public String getLineOwnerShip() {
        return lineOwnerShip;
    }

    public void setLineOwnerShip(String lineOwnerShip) {
        this.lineOwnerShip = lineOwnerShip;
    }

    public Integer getInternalKey() {
        return internalKey;
    }

    public void setInternalKey(Integer internalKey) {
        this.internalKey = internalKey;
    }

    public String getAcctCloseReason() {
        return acctCloseReason;
    }

    public void setAcctCloseReason(String acctCloseReason) {
        this.acctCloseReason = acctCloseReason;
    }
}