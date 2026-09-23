package com.dcits.blacklist.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class FmClientCopyExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public FmClientCopyExample() {
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

        public Criteria andClientNoEqualTo(String value) {
            addCriterion("CLIENT_NO =", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andTaxResidentFlagEqualTo(String value) {
            addCriterion("TAX_RESIDENT_FLAG =", value, "taxResidentFlag");
            return (Criteria) this;
        }

        public Criteria andClassLevelEqualTo(String value) {
            addCriterion("CLASS_LEVEL =", value, "classLevel");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE =", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimestampEqualTo(String value) {
            addCriterion("LAST_UPD_TIMESTAMP =", value, "lastUpdTimestamp");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("INDUSTRY =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andPrefFlagEqualTo(String value) {
            addCriterion("PREF_FLAG =", value, "prefFlag");
            return (Criteria) this;
        }

        public Criteria andClientVerificationResultEqualTo(String value) {
            addCriterion("CLIENT_VERIFICATION_RESULT =", value, "clientVerificationResult");
            return (Criteria) this;
        }

        public Criteria andCountryLocEqualTo(String value) {
            addCriterion("COUNTRY_LOC =", value, "countryLoc");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeEqualTo(String value) {
            addCriterion("CATEGORY_TYPE =", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andRepDocumentIdEqualTo(String value) {
            addCriterion("REP_DOCUMENT_ID =", value, "repDocumentId");
            return (Criteria) this;
        }

        public Criteria andCorporationFlagEqualTo(String value) {
            addCriterion("CORPORATION_FLAG =", value, "corporationFlag");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(String value) {
            addCriterion("POSTAL_CODE =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("CLIENT_NAME =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andIndustryLevelEqualTo(String value) {
            addCriterion("INDUSTRY_LEVEL =", value, "industryLevel");
            return (Criteria) this;
        }

        public Criteria andGhoCustomerClassEqualTo(String value) {
            addCriterion("GHO_CUSTOMER_CLASS =", value, "ghoCustomerClass");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andClientShortEqualTo(String value) {
            addCriterion("CLIENT_SHORT =", value, "clientShort");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("CONTACT_TEL =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andContactTypeEqualTo(String value) {
            addCriterion("CONTACT_TYPE =", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andLegalRepEqualTo(String value) {
            addCriterion("LEGAL_REP =", value, "legalRep");
            return (Criteria) this;
        }

        public Criteria andInternalIndFlagEqualTo(String value) {
            addCriterion("INTERNAL_IND_FLAG =", value, "internalIndFlag");
            return (Criteria) this;
        }

        public Criteria andIssPlaceEqualTo(String value) {
            addCriterion("ISS_PLACE =", value, "issPlace");
            return (Criteria) this;
        }

        public Criteria andRepExpiryDateEqualTo(Date value) {
            addCriterion("REP_EXPIRY_DATE =", value, "repExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCorpFlagEqualTo(String value) {
            addCriterion("CORP_FLAG =", value, "corpFlag");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeEqualTo(String value) {
            addCriterion("OCCUPATION_CODE =", value, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andWrnFlagEqualTo(String value) {
            addCriterion("WRN_FLAG =", value, "wrnFlag");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampEqualTo(String value) {
            addCriterion("CREATE_TIMESTAMP =", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andIssDateEqualTo(Date value) {
            addCriterion("ISS_DATE =", value, "issDate");
            return (Criteria) this;
        }

        public Criteria andEnClientNameEqualTo(String value) {
            addCriterion("EN_CLIENT_NAME =", value, "enClientName");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andBranchInnerFlagEqualTo(String value) {
            addCriterion("BRANCH_INNER_FLAG =", value, "branchInnerFlag");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("MOBILE_PHONE =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("CLIENT_TYPE =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andMaturityDateEqualTo(Date value) {
            addCriterion("MATURITY_DATE =", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(Date value) {
            addCriterion("BIRTH_DATE =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andTaxFlagEqualTo(String value) {
            addCriterion("TAX_FLAG =", value, "taxFlag");
            return (Criteria) this;
        }

        public Criteria andClientClassEqualTo(String value) {
            addCriterion("CLIENT_CLASS =", value, "clientClass");
            return (Criteria) this;
        }

        public Criteria andDocumentIdEqualTo(String value) {
            addCriterion("DOCUMENT_ID =", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andCrRatingEqualTo(String value) {
            addCriterion("CR_RATING =", value, "crRating");
            return (Criteria) this;
        }

        public Criteria andClientStatusEqualTo(String value) {
            addCriterion("CLIENT_STATUS =", value, "clientStatus");
            return (Criteria) this;
        }

        public Criteria andIsIndividualEqualTo(String value) {
            addCriterion("IS_INDIVIDUAL =", value, "isIndividual");
            return (Criteria) this;
        }

        public Criteria andInlandOffshoreEqualTo(String value) {
            addCriterion("INLAND_OFFSHORE =", value, "inlandOffshore");
            return (Criteria) this;
        }

        public Criteria andClientIndicatorEqualTo(String value) {
            addCriterion("CLIENT_INDICATOR =", value, "clientIndicator");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andCtrlBranchEqualTo(String value) {
            addCriterion("CTRL_BRANCH =", value, "ctrlBranch");
            return (Criteria) this;
        }

        public Criteria andSpokenLanguageEqualTo(String value) {
            addCriterion("SPOKEN_LANGUAGE =", value, "spokenLanguage");
            return (Criteria) this;
        }

        public Criteria andIssCountryEqualTo(String value) {
            addCriterion("ISS_COUNTRY =", value, "issCountry");
            return (Criteria) this;
        }

        public Criteria andRepDocumentTypeEqualTo(String value) {
            addCriterion("REP_DOCUMENT_TYPE =", value, "repDocumentType");
            return (Criteria) this;
        }

        public Criteria andResidentFlagEqualTo(String value) {
            addCriterion("RESIDENT_FLAG =", value, "residentFlag");
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