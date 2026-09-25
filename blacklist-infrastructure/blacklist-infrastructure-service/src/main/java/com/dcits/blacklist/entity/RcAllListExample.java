package com.dcits.blacklist.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class RcAllListExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public RcAllListExample() {
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

        public Criteria andRcBlackStatusEqualTo(String value) {
            addCriterion("RC_BLACK_STATUS =", value, "rcBlackStatus");
            return (Criteria) this;
        }

        public Criteria andOurBankFlagEqualTo(String value) {
            addCriterion("OUR_BANK_FLAG =", value, "ourBankFlag");
            return (Criteria) this;
        }

        public Criteria andEffectDateEqualTo(Date value) {
            addCriterion("EFFECT_DATE =", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("CLIENT_NAME =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andOtherAcctResFlagEqualTo(String value) {
            addCriterion("OTHER_ACCT_RES_FLAG =", value, "otherAcctResFlag");
            return (Criteria) this;
        }

        public Criteria andNarrativeEqualTo(String value) {
            addCriterion("NARRATIVE =", value, "narrative");
            return (Criteria) this;
        }

        public Criteria andListCategoryEqualTo(String value) {
            addCriterion("LIST_CATEGORY =", value, "listCategory");
            return (Criteria) this;
        }

        public Criteria andResSeqNosEqualTo(String value) {
            addCriterion("RES_SEQ_NOS =", value, "resSeqNos");
            return (Criteria) this;
        }

        public Criteria andCurAcctResFlagEqualTo(String value) {
            addCriterion("CUR_ACCT_RES_FLAG =", value, "curAcctResFlag");
            return (Criteria) this;
        }

        public Criteria andDataValueEqualTo(String value) {
            addCriterion("DATA_VALUE =", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andClientNoEqualTo(String value) {
            addCriterion("CLIENT_NO =", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andInputBranchEqualTo(String value) {
            addCriterion("INPUT_BRANCH =", value, "inputBranch");
            return (Criteria) this;
        }

        public Criteria andTranDateEqualTo(Date value) {
            addCriterion("TRAN_DATE =", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andRcSeqNoEqualTo(String value) {
            addCriterion("RC_SEQ_NO =", value, "rcSeqNo");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("DATA_TYPE =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE =", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andListOrgEqualTo(String value) {
            addCriterion("LIST_ORG =", value, "listOrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimestampEqualTo(String value) {
            addCriterion("LAST_UPD_TIMESTAMP =", value, "lastUpdTimestamp");
            return (Criteria) this;
        }

        public Criteria andTranBranchEqualTo(String value) {
            addCriterion("TRAN_BRANCH =", value, "tranBranch");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("SOURCE_TYPE =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andControlNosEqualTo(String value) {
            addCriterion("CONTROL_NOS =", value, "controlNos");
            return (Criteria) this;
        }

        public Criteria andMaturityDateEqualTo(Date value) {
            addCriterion("MATURITY_DATE =", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andRelVerifyFlagEqualTo(String value) {
            addCriterion("REL_VERIFY_FLAG =", value, "relVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andListTypeEqualTo(String value) {
            addCriterion("LIST_TYPE =", value, "listType");
            return (Criteria) this;
        }

        public Criteria andAcctNameEqualTo(String value) {
            addCriterion("ACCT_NAME =", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andIssCountryEqualTo(String value) {
            addCriterion("ISS_COUNTRY =", value, "issCountry");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampEqualTo(String value) {
            addCriterion("CREATE_TIMESTAMP =", value, "createTimestamp");
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