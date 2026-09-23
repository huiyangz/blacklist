package com.dcits.blacklist.facade.eo;

import com.dcits.blacklist.enums.BusiCategory;
import jakarta.validation.constraints.NotNull;

public class FmServiceDefineEO {
    /** 接口服务代码 */
    @NotNull
    private String messageCode;
    /** 法人 */
    private String company;
    /** 跨机构检查标志 */
    @NotNull
    private String acrossBranCheckFlag;
    /** 业务分类 */
    @NotNull
    private BusiCategory busiCategory;
    /** 服务状态 */
    @NotNull
    private String serviceStatus;
    /** 黑名单检查标志 */
    @NotNull
    private String blacklistCheckFlag;
    /** 服务代码 */
    @NotNull
    private String serviceCode;
    /** 多法人检查标志 */
    @NotNull
    private String multiCorpCheckFlag;
    /** 允许冲正标志 */
    @NotNull
    private String allowReverseFlag;
    /** 接口服务类型 */
    @NotNull
    private String messageType;
    /** 白名单检查标志 */
    @NotNull
    private String whiteListCheckFlag;
    /** 交易时间戳 */
    private String tranTimestamp;
    /** 业务细类 */
    private String busiSubClass;
    /** 客户检查标志 */
    @NotNull
    private String clientCheckFlag;
    /** 统一资源定位符 */
    @NotNull
    private String url;

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAcrossBranCheckFlag() {
        return acrossBranCheckFlag;
    }

    public void setAcrossBranCheckFlag(String acrossBranCheckFlag) {
        this.acrossBranCheckFlag = acrossBranCheckFlag;
    }

    public BusiCategory getBusiCategory() {
        return busiCategory;
    }

    public void setBusiCategory(BusiCategory busiCategory) {
        this.busiCategory = busiCategory;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getBlacklistCheckFlag() {
        return blacklistCheckFlag;
    }

    public void setBlacklistCheckFlag(String blacklistCheckFlag) {
        this.blacklistCheckFlag = blacklistCheckFlag;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getMultiCorpCheckFlag() {
        return multiCorpCheckFlag;
    }

    public void setMultiCorpCheckFlag(String multiCorpCheckFlag) {
        this.multiCorpCheckFlag = multiCorpCheckFlag;
    }

    public String getAllowReverseFlag() {
        return allowReverseFlag;
    }

    public void setAllowReverseFlag(String allowReverseFlag) {
        this.allowReverseFlag = allowReverseFlag;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getWhiteListCheckFlag() {
        return whiteListCheckFlag;
    }

    public void setWhiteListCheckFlag(String whiteListCheckFlag) {
        this.whiteListCheckFlag = whiteListCheckFlag;
    }

    public String getTranTimestamp() {
        return tranTimestamp;
    }

    public void setTranTimestamp(String tranTimestamp) {
        this.tranTimestamp = tranTimestamp;
    }

    public String getBusiSubClass() {
        return busiSubClass;
    }

    public void setBusiSubClass(String busiSubClass) {
        this.busiSubClass = busiSubClass;
    }

    public String getClientCheckFlag() {
        return clientCheckFlag;
    }

    public void setClientCheckFlag(String clientCheckFlag) {
        this.clientCheckFlag = clientCheckFlag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}