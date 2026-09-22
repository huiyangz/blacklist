package com.dcits.blacklist.facade.eo;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.CategoryType;
import com.dcits.blacklist.enums.City;
import com.dcits.blacklist.enums.ClassLevel;
import com.dcits.blacklist.enums.ClientClass;
import com.dcits.blacklist.enums.ClientIndicator;
import com.dcits.blacklist.enums.ClientStatus;
import com.dcits.blacklist.enums.ClientType;
import com.dcits.blacklist.enums.ClientVerificationResult;
import com.dcits.blacklist.enums.ContactType;
import com.dcits.blacklist.enums.CountryLoc;
import com.dcits.blacklist.enums.CrRating;
import com.dcits.blacklist.enums.DocumentType;
import com.dcits.blacklist.enums.Education;
import com.dcits.blacklist.enums.Industry;
import com.dcits.blacklist.enums.IndustryLevel;
import com.dcits.blacklist.enums.IssCountry;
import com.dcits.blacklist.enums.Nation;
import com.dcits.blacklist.enums.OccupationCode;
import com.dcits.blacklist.enums.Sex;
import com.dcits.blacklist.enums.SpokenLanguage;
import com.dcits.blacklist.enums.State;
import com.dcits.blacklist.enums.TaxFlag;
import com.dcits.blacklist.enums.TaxResidentFlag;
import jakarta.validation.constraints.NotNull;

public class FmClientCopyEO {
    /** 客户号 */
    @NotNull
    private String clientNo;
    /** 地址 */
    private String address;
    /** 税收居民标识 */
    private TaxResidentFlag taxResidentFlag;
    /** 客户综合评级级别 */
    private ClassLevel classLevel;
    /** 省代码 */
    private State state;
    /** 证件类型 */
    private DocumentType documentType;
    /** 最后修改时间戳 */
    @NotNull
    private String lastUpdTimestamp;
    /** 通用行业代码 */
    private Industry industry;
    /** 首选标志 */
    private String prefFlag;
    /** 客户核实结果 */
    private ClientVerificationResult clientVerificationResult;
    /** 国籍 */
    private CountryLoc countryLoc;
    /** 客户细分类型 */
    private CategoryType categoryType;
    /** 法定代表人身份证件号码 */
    private String repDocumentId;
    /** 企业标志 */
    private String corporationFlag;
    /** 邮政编码 */
    private String postalCode;
    /** 客户名称 */
    private String clientName;
    /** 行业层级 */
    private IndustryLevel industryLevel;
    /** 集团客户分类 */
    private String ghoCustomerClass;
    /** 教育程度编号 */
    private Education education;
    /** 客户简称 */
    private String clientShort;
    /** 城市 */
    private City city;
    /** 联系电话 */
    private String contactTel;
    /** 经营范围 */
    private String businessScope;
    /** 联系类型 */
    private ContactType contactType;
    /** 法定代表人名称 */
    private String legalRep;
    /** 内部客户标志 */
    private String internalIndFlag;
    /** 客户证件签发地 */
    private String issPlace;
    /** 法人代表证件到期日期 */
    private java.util.Date repExpiryDate;
    /** 小微企业标志 */
    private String corpFlag;
    /** 职业编码 */
    private OccupationCode occupationCode;
    /** 贷款核销标志 */
    private String wrnFlag;
    /** 创建时间戳 */
    @NotNull
    private String createTimestamp;
    /** 签发日期 */
    private java.util.Date issDate;
    /** 客户英文名称 */
    private String enClientName;
    /** 性别 */
    private Sex sex;
    /** 机构内客户标志 */
    private String branchInnerFlag;
    /** 手机号码 */
    private String mobilePhone;
    /** 客户类型 */
    private ClientType clientType;
    /** 到期日期 */
    private java.util.Date maturityDate;
    /** 出生日期 */
    private java.util.Date birthDate;
    /** 收税标志 */
    private TaxFlag taxFlag;
    /** 客户类别 */
    private ClientClass clientClass;
    /** 证件号码 */
    private String documentId;
    /** 信用等级 */
    private CrRating crRating;
    /** 客户状态 */
    private ClientStatus clientStatus;
    /** 对私客户标志 */
    private String isIndividual;
    /** 境内境外标志 */
    private String inlandOffshore;
    /** 客户标识 */
    private ClientIndicator clientIndicator;
    /** 民族 */
    private Nation nation;
    /** 客户号归属机构号 */
    private AcctBranch ctrlBranch;
    /** 交流语言 */
    private SpokenLanguage spokenLanguage;
    /** 发证国家 */
    private IssCountry issCountry;
    /** 法定代表人身份证件类型 */
    private DocumentType repDocumentType;
    /** 居民标志 */
    private String residentFlag;

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TaxResidentFlag getTaxResidentFlag() {
        return taxResidentFlag;
    }

    public void setTaxResidentFlag(TaxResidentFlag taxResidentFlag) {
        this.taxResidentFlag = taxResidentFlag;
    }

    public ClassLevel getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(ClassLevel classLevel) {
        this.classLevel = classLevel;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getLastUpdTimestamp() {
        return lastUpdTimestamp;
    }

    public void setLastUpdTimestamp(String lastUpdTimestamp) {
        this.lastUpdTimestamp = lastUpdTimestamp;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public String getPrefFlag() {
        return prefFlag;
    }

    public void setPrefFlag(String prefFlag) {
        this.prefFlag = prefFlag;
    }

    public ClientVerificationResult getClientVerificationResult() {
        return clientVerificationResult;
    }

    public void setClientVerificationResult(ClientVerificationResult clientVerificationResult) {
        this.clientVerificationResult = clientVerificationResult;
    }

    public CountryLoc getCountryLoc() {
        return countryLoc;
    }

    public void setCountryLoc(CountryLoc countryLoc) {
        this.countryLoc = countryLoc;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public String getRepDocumentId() {
        return repDocumentId;
    }

    public void setRepDocumentId(String repDocumentId) {
        this.repDocumentId = repDocumentId;
    }

    public String getCorporationFlag() {
        return corporationFlag;
    }

    public void setCorporationFlag(String corporationFlag) {
        this.corporationFlag = corporationFlag;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public IndustryLevel getIndustryLevel() {
        return industryLevel;
    }

    public void setIndustryLevel(IndustryLevel industryLevel) {
        this.industryLevel = industryLevel;
    }

    public String getGhoCustomerClass() {
        return ghoCustomerClass;
    }

    public void setGhoCustomerClass(String ghoCustomerClass) {
        this.ghoCustomerClass = ghoCustomerClass;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public String getClientShort() {
        return clientShort;
    }

    public void setClientShort(String clientShort) {
        this.clientShort = clientShort;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getLegalRep() {
        return legalRep;
    }

    public void setLegalRep(String legalRep) {
        this.legalRep = legalRep;
    }

    public String getInternalIndFlag() {
        return internalIndFlag;
    }

    public void setInternalIndFlag(String internalIndFlag) {
        this.internalIndFlag = internalIndFlag;
    }

    public String getIssPlace() {
        return issPlace;
    }

    public void setIssPlace(String issPlace) {
        this.issPlace = issPlace;
    }

    public java.util.Date getRepExpiryDate() {
        return repExpiryDate;
    }

    public void setRepExpiryDate(java.util.Date repExpiryDate) {
        this.repExpiryDate = repExpiryDate;
    }

    public String getCorpFlag() {
        return corpFlag;
    }

    public void setCorpFlag(String corpFlag) {
        this.corpFlag = corpFlag;
    }

    public OccupationCode getOccupationCode() {
        return occupationCode;
    }

    public void setOccupationCode(OccupationCode occupationCode) {
        this.occupationCode = occupationCode;
    }

    public String getWrnFlag() {
        return wrnFlag;
    }

    public void setWrnFlag(String wrnFlag) {
        this.wrnFlag = wrnFlag;
    }

    public String getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public java.util.Date getIssDate() {
        return issDate;
    }

    public void setIssDate(java.util.Date issDate) {
        this.issDate = issDate;
    }

    public String getEnClientName() {
        return enClientName;
    }

    public void setEnClientName(String enClientName) {
        this.enClientName = enClientName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getBranchInnerFlag() {
        return branchInnerFlag;
    }

    public void setBranchInnerFlag(String branchInnerFlag) {
        this.branchInnerFlag = branchInnerFlag;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public java.util.Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(java.util.Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public java.util.Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }

    public TaxFlag getTaxFlag() {
        return taxFlag;
    }

    public void setTaxFlag(TaxFlag taxFlag) {
        this.taxFlag = taxFlag;
    }

    public ClientClass getClientClass() {
        return clientClass;
    }

    public void setClientClass(ClientClass clientClass) {
        this.clientClass = clientClass;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public CrRating getCrRating() {
        return crRating;
    }

    public void setCrRating(CrRating crRating) {
        this.crRating = crRating;
    }

    public ClientStatus getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(ClientStatus clientStatus) {
        this.clientStatus = clientStatus;
    }

    public String getIsIndividual() {
        return isIndividual;
    }

    public void setIsIndividual(String isIndividual) {
        this.isIndividual = isIndividual;
    }

    public String getInlandOffshore() {
        return inlandOffshore;
    }

    public void setInlandOffshore(String inlandOffshore) {
        this.inlandOffshore = inlandOffshore;
    }

    public ClientIndicator getClientIndicator() {
        return clientIndicator;
    }

    public void setClientIndicator(ClientIndicator clientIndicator) {
        this.clientIndicator = clientIndicator;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public AcctBranch getCtrlBranch() {
        return ctrlBranch;
    }

    public void setCtrlBranch(AcctBranch ctrlBranch) {
        this.ctrlBranch = ctrlBranch;
    }

    public SpokenLanguage getSpokenLanguage() {
        return spokenLanguage;
    }

    public void setSpokenLanguage(SpokenLanguage spokenLanguage) {
        this.spokenLanguage = spokenLanguage;
    }

    public IssCountry getIssCountry() {
        return issCountry;
    }

    public void setIssCountry(IssCountry issCountry) {
        this.issCountry = issCountry;
    }

    public DocumentType getRepDocumentType() {
        return repDocumentType;
    }

    public void setRepDocumentType(DocumentType repDocumentType) {
        this.repDocumentType = repDocumentType;
    }

    public String getResidentFlag() {
        return residentFlag;
    }

    public void setResidentFlag(String residentFlag) {
        this.residentFlag = residentFlag;
    }
}