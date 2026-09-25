package com.dcits.blacklist.facade.eo;

import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.TranType;
import jakarta.validation.constraints.NotNull;

public class RcListCheckRangeEO {
    /** 名单类型代码 */
    private String listType;
    /** 黑名单检查规则编号 */
    private String ruleId;
    /** 序号 */
    @NotNull
    private String seqNo;
    /** 交易代码 */
    private String programId;
    /** 创建时间戳 */
    @NotNull
    private String createTimestamp;
    /** 最后修改时间戳 */
    @NotNull
    private String lastUpdTimestamp;
    /** 渠道类型 */
    private SourceType sourceType;
    /** 事件类型 */
    private String eventType;
    /** 交易类型 */
    private TranType tranType;
    /** 服务代码 */
    private String serviceCode;
    /** 接口服务类型 */
    private String messageType;
    /** 接口服务代码 */
    private String messageCode;

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
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

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public TranType getTranType() {
        return tranType;
    }

    public void setTranType(TranType tranType) {
        this.tranType = tranType;
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
}