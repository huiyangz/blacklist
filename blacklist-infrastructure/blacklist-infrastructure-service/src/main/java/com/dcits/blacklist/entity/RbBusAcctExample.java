package com.dcits.blacklist.entity;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.util.Date;

public class RbBusAcctExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public RbBusAcctExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.isEmpty()) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        return new Criteria();
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return !criteria.isEmpty();
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCreateTimestampEqualTo(String value) {
            addCriterion("CREATE_TIMESTAMP =", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andClientNoEqualTo(String value) {
            addCriterion("CLIENT_NO =", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andAcctOpenDateEqualTo(Date value) {
            addCriterion("ACCT_OPEN_DATE =", value, "acctOpenDate");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("TERM =", value, "term");
            return (Criteria) this;
        }

        public Criteria andAcctNameEnEqualTo(String value) {
            addCriterion("ACCT_NAME_EN =", value, "acctNameEn");
            return (Criteria) this;
        }

        public Criteria andFtaAcctFlagEqualTo(String value) {
            addCriterion("FTA_ACCT_FLAG =", value, "ftaAcctFlag");
            return (Criteria) this;
        }

        public Criteria andTermTypeEqualTo(String value) {
            addCriterion("TERM_TYPE =", value, "termType");
            return (Criteria) this;
        }

        public Criteria andAllDraRangeEqualTo(String value) {
            addCriterion("ALL_DRA_RANGE =", value, "allDraRange");
            return (Criteria) this;
        }

        public Criteria andDepositNatureEqualTo(String value) {
            addCriterion("DEPOSIT_NATURE =", value, "depositNature");
            return (Criteria) this;
        }

        public Criteria andAcctVerifyFlagEqualTo(String value) {
            addCriterion("ACCT_VERIFY_FLAG =", value, "acctVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAcctCloseDateEqualTo(Date value) {
            addCriterion("ACCT_CLOSE_DATE =", value, "acctCloseDate");
            return (Criteria) this;
        }

        public Criteria andAcctNatureNoEqualTo(String value) {
            addCriterion("ACCT_NATURE_NO =", value, "acctNatureNo");
            return (Criteria) this;
        }

        public Criteria andFarmerFlagEqualTo(String value) {
            addCriterion("FARMER_FLAG =", value, "farmerFlag");
            return (Criteria) this;
        }

        public Criteria andAnnualDateEqualTo(Date value) {
            addCriterion("ANNUAL_DATE =", value, "annualDate");
            return (Criteria) this;
        }

        public Criteria andLastTranDateEqualTo(Date value) {
            addCriterion("LAST_TRAN_DATE =", value, "lastTranDate");
            return (Criteria) this;
        }

        public Criteria andRolloverNoEqualTo(Integer value) {
            addCriterion("ROLLOVER_NO =", value, "rolloverNo");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("CLIENT_TYPE =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimestampEqualTo(String value) {
            addCriterion("LAST_UPD_TIMESTAMP =", value, "lastUpdTimestamp");
            return (Criteria) this;
        }

        public Criteria andRecoverFlagEqualTo(String value) {
            addCriterion("RECOVER_FLAG =", value, "recoverFlag");
            return (Criteria) this;
        }

        public Criteria andAutoRenewTermEqualTo(String value) {
            addCriterion("AUTO_RENEW_TERM =", value, "autoRenewTerm");
            return (Criteria) this;
        }

        public Criteria andAcctNameEqualTo(String value) {
            addCriterion("ACCT_NAME =", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andLeadAcctFlagEqualTo(String value) {
            addCriterion("LEAD_ACCT_FLAG =", value, "leadAcctFlag");
            return (Criteria) this;
        }

        public Criteria andFtaNoEqualTo(String value) {
            addCriterion("FTA_NO =", value, "ftaNo");
            return (Criteria) this;
        }

        public Criteria andProdNoEqualTo(String value) {
            addCriterion("PROD_NO =", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andIntIndFlagEqualTo(String value) {
            addCriterion("INT_IND_FLAG =", value, "intIndFlag");
            return (Criteria) this;
        }

        public Criteria andCycleIntFlagEqualTo(String value) {
            addCriterion("CYCLE_INT_FLAG =", value, "cycleIntFlag");
            return (Criteria) this;
        }

        public Criteria andAllowSuspendFlagEqualTo(String value) {
            addCriterion("ALLOW_SUSPEND_FLAG =", value, "allowSuspendFlag");
            return (Criteria) this;
        }

        public Criteria andRbBusAcctPurposeEqualTo(String value) {
            addCriterion("RB_BUS_ACCT_PURPOSE =", value, "rbBusAcctPurpose");
            return (Criteria) this;
        }

        public Criteria andCollatIndEqualTo(String value) {
            addCriterion("COLLAT_IND =", value, "collatInd");
            return (Criteria) this;
        }

        public Criteria andFirstDrawDateEqualTo(Date value) {
            addCriterion("FIRST_DRAW_DATE =", value, "firstDrawDate");
            return (Criteria) this;
        }

        public Criteria andAutoDepEqualTo(String value) {
            addCriterion("AUTO_DEP =", value, "autoDep");
            return (Criteria) this;
        }

        public Criteria andSimpleAcctEqualTo(String value) {
            addCriterion("SIMPLE_ACCT =", value, "simpleAcct");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andIntTaxLevyEqualTo(String value) {
            addCriterion("INT_TAX_LEVY =", value, "intTaxLevy");
            return (Criteria) this;
        }

        public Criteria andAcctExecNameEqualTo(String value) {
            addCriterion("ACCT_EXEC_NAME =", value, "acctExecName");
            return (Criteria) this;
        }

        public Criteria andAcctDueDateEqualTo(Date value) {
            addCriterion("ACCT_DUE_DATE =", value, "acctDueDate");
            return (Criteria) this;
        }

        public Criteria andApprLetterNoEqualTo(String value) {
            addCriterion("APPR_LETTER_NO =", value, "apprLetterNo");
            return (Criteria) this;
        }

        public Criteria andAutoRenewIndEqualTo(String value) {
            addCriterion("AUTO_RENEW_IND =", value, "autoRenewInd");
            return (Criteria) this;
        }

        public Criteria andManageContentEqualTo(String value) {
            addCriterion("MANAGE_CONTENT =", value, "manageContent");
            return (Criteria) this;
        }

        public Criteria andAcctStatusEqualTo(String value) {
            addCriterion("ACCT_STATUS =", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andSpecAcctFlagEqualTo(String value) {
            addCriterion("SPEC_ACCT_FLAG =", value, "specAcctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctStatusPrevEqualTo(String value) {
            addCriterion("ACCT_STATUS_PREV =", value, "acctStatusPrev");
            return (Criteria) this;
        }

        public Criteria andAcctBranchEqualTo(String value) {
            addCriterion("ACCT_BRANCH =", value, "acctBranch");
            return (Criteria) this;
        }

        public Criteria andHomeBranchEqualTo(String value) {
            addCriterion("HOME_BRANCH =", value, "homeBranch");
            return (Criteria) this;
        }

        public Criteria andIsAllowCloseEqualTo(String value) {
            addCriterion("IS_ALLOW_CLOSE =", value, "isAllowClose");
            return (Criteria) this;
        }

        public Criteria andTimesRolledoverEqualTo(Integer value) {
            addCriterion("TIMES_ROLLEDOVER =", value, "timesRolledover");
            return (Criteria) this;
        }

        public Criteria andLastResetDateEqualTo(Date value) {
            addCriterion("LAST_RESET_DATE =", value, "lastResetDate");
            return (Criteria) this;
        }

        public Criteria andDormantDateEqualTo(Date value) {
            addCriterion("DORMANT_DATE =", value, "dormantDate");
            return (Criteria) this;
        }

        public Criteria andRenewNoEqualTo(Integer value) {
            addCriterion("RENEW_NO =", value, "renewNo");
            return (Criteria) this;
        }

        public Criteria andAllDepRangeEqualTo(String value) {
            addCriterion("ALL_DEP_RANGE =", value, "allDepRange");
            return (Criteria) this;
        }

        public Criteria andAcctCcyEqualTo(String value) {
            addCriterion("ACCT_CCY =", value, "acctCcy");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andLastStopDateEqualTo(Date value) {
            addCriterion("LAST_STOP_DATE =", value, "lastStopDate");
            return (Criteria) this;
        }

        public Criteria andSecretAcctEqualTo(String value) {
            addCriterion("SECRET_ACCT =", value, "secretAcct");
            return (Criteria) this;
        }

        public Criteria andRenewMethodEqualTo(String value) {
            addCriterion("RENEW_METHOD =", value, "renewMethod");
            return (Criteria) this;
        }

        public Criteria andManageFlagEqualTo(String value) {
            addCriterion("MANAGE_FLAG =", value, "manageFlag");
            return (Criteria) this;
        }

        public Criteria andAcctRiskLevelEqualTo(String value) {
            addCriterion("ACCT_RISK_LEVEL =", value, "acctRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCertificateAmtEqualTo(BigDecimal value) {
            addCriterion("CHECK_CERTIFICATE_AMT =", value, "checkCertificateAmt");
            return (Criteria) this;
        }

        public Criteria andIsSellChequeEqualTo(String value) {
            addCriterion("IS_SELL_CHEQUE =", value, "isSellCheque");
            return (Criteria) this;
        }

        public Criteria andCheckCertificateTypeEqualTo(String value) {
            addCriterion("CHECK_CERTIFICATE_TYPE =", value, "checkCertificateType");
            return (Criteria) this;
        }

        public Criteria andManageTypeEqualTo(String value) {
            addCriterion("MANAGE_TYPE =", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andPromoterNameEqualTo(String value) {
            addCriterion("PROMOTER_NAME =", value, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterCodeEqualTo(String value) {
            addCriterion("PROMOTER_CODE =", value, "promoterCode");
            return (Criteria) this;
        }

        public Criteria andTermLackEqualTo(Integer value) {
            addCriterion("TERM_LACK =", value, "termLack");
            return (Criteria) this;
        }

        public Criteria andAutoRenewTermTypeEqualTo(String value) {
            addCriterion("AUTO_RENEW_TERM_TYPE =", value, "autoRenewTermType");
            return (Criteria) this;
        }

        public Criteria andRbAcctTypeEqualTo(String value) {
            addCriterion("RB_ACCT_TYPE =", value, "rbAcctType");
            return (Criteria) this;
        }

        public Criteria andEffectDateEqualTo(Date value) {
            addCriterion("EFFECT_DATE =", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andTimesRenewedEqualTo(Integer value) {
            addCriterion("TIMES_RENEWED =", value, "timesRenewed");
            return (Criteria) this;
        }

        public Criteria andAnnualFlagEqualTo(String value) {
            addCriterion("ANNUAL_FLAG =", value, "annualFlag");
            return (Criteria) this;
        }

        public Criteria andAcctExecCodeEqualTo(String value) {
            addCriterion("ACCT_EXEC_CODE =", value, "acctExecCode");
            return (Criteria) this;
        }

        public Criteria andAcctRealFlagEqualTo(String value) {
            addCriterion("ACCT_REAL_FLAG =", value, "acctRealFlag");
            return (Criteria) this;
        }

        public Criteria andDepMaturityDateEqualTo(Date value) {
            addCriterion("DEP_MATURITY_DATE =", value, "depMaturityDate");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("SOURCE_TYPE =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andTotalDrawAmtEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DRAW_AMT =", value, "totalDrawAmt");
            return (Criteria) this;
        }

        public Criteria andJointAcctFlagEqualTo(String value) {
            addCriterion("JOINT_ACCT_FLAG =", value, "jointAcctFlag");
            return (Criteria) this;
        }

        public Criteria andBaseAcctNoEqualTo(String value) {
            addCriterion("BASE_ACCT_NO =", value, "baseAcctNo");
            return (Criteria) this;
        }

        public Criteria andAnnualStatusEqualTo(String value) {
            addCriterion("ANNUAL_STATUS =", value, "annualStatus");
            return (Criteria) this;
        }

        public Criteria andBalTypeEqualTo(String value) {
            addCriterion("BAL_TYPE =", value, "balType");
            return (Criteria) this;
        }

        public Criteria andManagementFreeFlagEqualTo(String value) {
            addCriterion("MANAGEMENT_FREE_FLAG =", value, "managementFreeFlag");
            return (Criteria) this;
        }

        public Criteria andAcctLicenseDateEqualTo(Date value) {
            addCriterion("ACCT_LICENSE_DATE =", value, "acctLicenseDate");
            return (Criteria) this;
        }

        public Criteria andAcctStopPayEqualTo(String value) {
            addCriterion("ACCT_STOP_PAY =", value, "acctStopPay");
            return (Criteria) this;
        }

        public Criteria andLoanFundFlagEqualTo(String value) {
            addCriterion("LOAN_FUND_FLAG =", value, "loanFundFlag");
            return (Criteria) this;
        }

        public Criteria andImpoundFadEqualTo(String value) {
            addCriterion("IMPOUND_FAD =", value, "impoundFad");
            return (Criteria) this;
        }

        public Criteria andAcctResStatusEqualTo(String value) {
            addCriterion("ACCT_RES_STATUS =", value, "acctResStatus");
            return (Criteria) this;
        }

        public Criteria andAcctLicenseNoEqualTo(String value) {
            addCriterion("ACCT_LICENSE_NO =", value, "acctLicenseNo");
            return (Criteria) this;
        }

        public Criteria andParentInternalKeyEqualTo(Integer value) {
            addCriterion("PARENT_INTERNAL_KEY =", value, "parentInternalKey");
            return (Criteria) this;
        }

        public Criteria andTaxDiscountMaturityDateEqualTo(Date value) {
            addCriterion("TAX_DISCOUNT_MATURITY_DATE =", value, "taxDiscountMaturityDate");
            return (Criteria) this;
        }

        public Criteria andFixedCallEqualTo(String value) {
            addCriterion("FIXED_CALL =", value, "fixedCall");
            return (Criteria) this;
        }

        public Criteria andAcctVerifyResultEqualTo(String value) {
            addCriterion("ACCT_VERIFY_RESULT =", value, "acctVerifyResult");
            return (Criteria) this;
        }

        public Criteria andAllDepIndEqualTo(String value) {
            addCriterion("ALL_DEP_IND =", value, "allDepInd");
            return (Criteria) this;
        }

        public Criteria andOsaFlagEqualTo(String value) {
            addCriterion("OSA_FLAG =", value, "osaFlag");
            return (Criteria) this;
        }

        public Criteria andCaseInvolvedFlagEqualTo(String value) {
            addCriterion("CASE_INVOLVED_FLAG =", value, "caseInvolvedFlag");
            return (Criteria) this;
        }

        public Criteria andAllDraIntBranchEqualTo(String value) {
            addCriterion("ALL_DRA_INT_BRANCH =", value, "allDraIntBranch");
            return (Criteria) this;
        }

        public Criteria andPartialRenewRollEqualTo(String value) {
            addCriterion("PARTIAL_RENEW_ROLL =", value, "partialRenewRoll");
            return (Criteria) this;
        }

        public Criteria andAutoSettleFlagEqualTo(String value) {
            addCriterion("AUTO_SETTLE_FLAG =", value, "autoSettleFlag");
            return (Criteria) this;
        }

        public Criteria andAllDraIndEqualTo(String value) {
            addCriterion("ALL_DRA_IND =", value, "allDraInd");
            return (Criteria) this;
        }

        public Criteria andLineOwnerShipEqualTo(String value) {
            addCriterion("LINE_OWNER_SHIP =", value, "lineOwnerShip");
            return (Criteria) this;
        }

        public Criteria andInternalKeyEqualTo(Integer value) {
            addCriterion("INTERNAL_KEY =", value, "internalKey");
            return (Criteria) this;
        }

        public Criteria andAcctCloseReasonEqualTo(String value) {
            addCriterion("ACCT_CLOSE_REASON =", value, "acctCloseReason");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        protected Criterion(String condition) {
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}