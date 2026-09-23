package com.dcits.blacklist.facade.eo;

import com.dcits.blacklist.enums.DealFlow;
import com.dcits.blacklist.enums.LimitRef;
import com.dcits.blacklist.enums.OthControlType;
import com.dcits.blacklist.enums.OthRestraintType;
import com.dcits.blacklist.enums.ResBranchRange;
import com.dcits.blacklist.enums.ResOperateFlag;
import com.dcits.blacklist.enums.TermType;
import jakarta.validation.constraints.NotNull;

public class RcRuleTypeEO {
    /** 其他账户限制类型 */
    private OthRestraintType othRestraintType;
    /** 最后修改时间戳 */
    @NotNull
    private String lastUpdTimestamp;
    /** 客户所有账户增加限制标志 */
    private String resAllFlag;
    /** 周期类型 */
    private TermType termType;
    /** 存期期限 */
    private String term;
    /** 其他账户顺延期限类型 */
    private TermType othDelayTermType;
    /** 关联账户核实标志 */
    private String relVerifyFlag;
    /** 其他账户控制类型 */
    private OthControlType othControlType;
    /** 限制机构范围 */
    private ResBranchRange resBranchRange;
    /** 账户限制类型 */
    private OthRestraintType restraintType;
    /** 其他账户限制期限 */
    private String othTerm;
    /** 卡介质 */
    private String cardMedium;
    /** 黑名单检查规则编号 */
    @NotNull
    private String ruleId;
    /** 渠道控制类型 */
    private OthControlType controlType;
    /** 处理方式 */
    private DealFlow dealFlow;
    /** 黑名单限制操作标识 */
    private ResOperateFlag resOperateFlag;
    /** 其他账户限制期限类型 */
    private TermType othTermType;
    /** 账户限制顺延期限 */
    private TermType delayTermType;
    /** 创建时间戳 */
    @NotNull
    private String createTimestamp;
    /** 限额编码 */
    private LimitRef limitRef;
    /** 其他账户顺延期限 */
    private String othDelayTerm;

    public OthRestraintType getOthRestraintType() {
        return othRestraintType;
    }

    public void setOthRestraintType(OthRestraintType othRestraintType) {
        this.othRestraintType = othRestraintType;
    }

    public String getLastUpdTimestamp() {
        return lastUpdTimestamp;
    }

    public void setLastUpdTimestamp(String lastUpdTimestamp) {
        this.lastUpdTimestamp = lastUpdTimestamp;
    }

    public String getResAllFlag() {
        return resAllFlag;
    }

    public void setResAllFlag(String resAllFlag) {
        this.resAllFlag = resAllFlag;
    }

    public TermType getTermType() {
        return termType;
    }

    public void setTermType(TermType termType) {
        this.termType = termType;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public TermType getOthDelayTermType() {
        return othDelayTermType;
    }

    public void setOthDelayTermType(TermType othDelayTermType) {
        this.othDelayTermType = othDelayTermType;
    }

    public String getRelVerifyFlag() {
        return relVerifyFlag;
    }

    public void setRelVerifyFlag(String relVerifyFlag) {
        this.relVerifyFlag = relVerifyFlag;
    }

    public OthControlType getOthControlType() {
        return othControlType;
    }

    public void setOthControlType(OthControlType othControlType) {
        this.othControlType = othControlType;
    }

    public ResBranchRange getResBranchRange() {
        return resBranchRange;
    }

    public void setResBranchRange(ResBranchRange resBranchRange) {
        this.resBranchRange = resBranchRange;
    }

    public OthRestraintType getRestraintType() {
        return restraintType;
    }

    public void setRestraintType(OthRestraintType restraintType) {
        this.restraintType = restraintType;
    }

    public String getOthTerm() {
        return othTerm;
    }

    public void setOthTerm(String othTerm) {
        this.othTerm = othTerm;
    }

    public String getCardMedium() {
        return cardMedium;
    }

    public void setCardMedium(String cardMedium) {
        this.cardMedium = cardMedium;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public OthControlType getControlType() {
        return controlType;
    }

    public void setControlType(OthControlType controlType) {
        this.controlType = controlType;
    }

    public DealFlow getDealFlow() {
        return dealFlow;
    }

    public void setDealFlow(DealFlow dealFlow) {
        this.dealFlow = dealFlow;
    }

    public ResOperateFlag getResOperateFlag() {
        return resOperateFlag;
    }

    public void setResOperateFlag(ResOperateFlag resOperateFlag) {
        this.resOperateFlag = resOperateFlag;
    }

    public TermType getOthTermType() {
        return othTermType;
    }

    public void setOthTermType(TermType othTermType) {
        this.othTermType = othTermType;
    }

    public TermType getDelayTermType() {
        return delayTermType;
    }

    public void setDelayTermType(TermType delayTermType) {
        this.delayTermType = delayTermType;
    }

    public String getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public LimitRef getLimitRef() {
        return limitRef;
    }

    public void setLimitRef(LimitRef limitRef) {
        this.limitRef = limitRef;
    }

    public String getOthDelayTerm() {
        return othDelayTerm;
    }

    public void setOthDelayTerm(String othDelayTerm) {
        this.othDelayTerm = othDelayTerm;
    }
}