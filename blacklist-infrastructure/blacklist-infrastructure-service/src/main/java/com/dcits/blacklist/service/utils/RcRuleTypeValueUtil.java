package com.dcits.blacklist.service.utils;

import com.dcits.blacklist.entity.RcRuleType;
import com.dcits.blacklist.entity.RcRuleTypeExample;
import com.dcits.blacklist.facade.eo.RcRuleTypeEO;
import com.dcits.blacklist.enums.OthRestraintType;
import com.dcits.blacklist.enums.TermType;
import com.dcits.blacklist.enums.TermType;
import com.dcits.blacklist.enums.OthControlType;
import com.dcits.blacklist.enums.ResBranchRange;
import com.dcits.blacklist.enums.OthRestraintType;
import com.dcits.blacklist.enums.OthControlType;
import com.dcits.blacklist.enums.DealFlow;
import com.dcits.blacklist.enums.ResOperateFlag;
import com.dcits.blacklist.enums.TermType;
import com.dcits.blacklist.enums.TermType;
import com.dcits.blacklist.enums.LimitRef;

public final class RcRuleTypeValueUtil {
    private RcRuleTypeValueUtil() {
    }

    public static RcRuleTypeEO entityToEo(RcRuleType entity) {
        if (entity == null) {
            return null;
        }
        RcRuleTypeEO eo = new RcRuleTypeEO();
        eo.setOthRestraintType(OthRestraintType.byValue(entity.getOthRestraintType()));
        eo.setLastUpdTimestamp(entity.getLastUpdTimestamp());
        eo.setResAllFlag(entity.getResAllFlag());
        eo.setTermType(TermType.byValue(entity.getTermType()));
        eo.setTerm(entity.getTerm());
        eo.setOthDelayTermType(TermType.byValue(entity.getOthDelayTermType()));
        eo.setRelVerifyFlag(entity.getRelVerifyFlag());
        eo.setOthControlType(OthControlType.byValue(entity.getOthControlType()));
        eo.setResBranchRange(ResBranchRange.byValue(entity.getResBranchRange()));
        eo.setRestraintType(OthRestraintType.byValue(entity.getRestraintType()));
        eo.setOthTerm(entity.getOthTerm());
        eo.setCardMedium(entity.getCardMedium());
        eo.setRuleId(entity.getRuleId());
        eo.setControlType(OthControlType.byValue(entity.getControlType()));
        eo.setDealFlow(DealFlow.byValue(entity.getDealFlow()));
        eo.setResOperateFlag(ResOperateFlag.byValue(entity.getResOperateFlag()));
        eo.setOthTermType(TermType.byValue(entity.getOthTermType()));
        eo.setDelayTermType(TermType.byValue(entity.getDelayTermType()));
        eo.setCreateTimestamp(entity.getCreateTimestamp());
        eo.setLimitRef(LimitRef.byValue(entity.getLimitRef()));
        eo.setOthDelayTerm(entity.getOthDelayTerm());
        return eo;
    }

    public static RcRuleType eoToEntity(RcRuleTypeEO eo) {
        if (eo == null) {
            return null;
        }
        RcRuleType entity = new RcRuleType();
        entity.setOthRestraintType(eo.getOthRestraintType() == null ? null : eo.getOthRestraintType().getValue());
        entity.setLastUpdTimestamp(eo.getLastUpdTimestamp());
        entity.setResAllFlag(eo.getResAllFlag());
        entity.setTermType(eo.getTermType() == null ? null : eo.getTermType().getValue());
        entity.setTerm(eo.getTerm());
        entity.setOthDelayTermType(eo.getOthDelayTermType() == null ? null : eo.getOthDelayTermType().getValue());
        entity.setRelVerifyFlag(eo.getRelVerifyFlag());
        entity.setOthControlType(eo.getOthControlType() == null ? null : eo.getOthControlType().getValue());
        entity.setResBranchRange(eo.getResBranchRange() == null ? null : eo.getResBranchRange().getValue());
        entity.setRestraintType(eo.getRestraintType() == null ? null : eo.getRestraintType().getValue());
        entity.setOthTerm(eo.getOthTerm());
        entity.setCardMedium(eo.getCardMedium());
        entity.setRuleId(eo.getRuleId());
        entity.setControlType(eo.getControlType() == null ? null : eo.getControlType().getValue());
        entity.setDealFlow(eo.getDealFlow() == null ? null : eo.getDealFlow().getValue());
        entity.setResOperateFlag(eo.getResOperateFlag() == null ? null : eo.getResOperateFlag().getValue());
        entity.setOthTermType(eo.getOthTermType() == null ? null : eo.getOthTermType().getValue());
        entity.setDelayTermType(eo.getDelayTermType() == null ? null : eo.getDelayTermType().getValue());
        entity.setCreateTimestamp(eo.getCreateTimestamp());
        entity.setLimitRef(eo.getLimitRef() == null ? null : eo.getLimitRef().getValue());
        entity.setOthDelayTerm(eo.getOthDelayTerm());
        return entity;
    }

    public static RcRuleTypeExample eoToEntityExample(RcRuleTypeEO eo) {
        if (eo == null) {
            return null;
        }
        RcRuleTypeExample example = new RcRuleTypeExample();
        RcRuleTypeExample.Criteria criteria = example.createCriteria();
        if (eo.getOthRestraintType() != null) criteria.andOthRestraintTypeEqualTo(eo.getOthRestraintType().getValue());
        if (eo.getLastUpdTimestamp() != null) criteria.andLastUpdTimestampEqualTo(eo.getLastUpdTimestamp());
        if (eo.getResAllFlag() != null) criteria.andResAllFlagEqualTo(eo.getResAllFlag());
        if (eo.getTermType() != null) criteria.andTermTypeEqualTo(eo.getTermType().getValue());
        if (eo.getTerm() != null) criteria.andTermEqualTo(eo.getTerm());
        if (eo.getOthDelayTermType() != null) criteria.andOthDelayTermTypeEqualTo(eo.getOthDelayTermType().getValue());
        if (eo.getRelVerifyFlag() != null) criteria.andRelVerifyFlagEqualTo(eo.getRelVerifyFlag());
        if (eo.getOthControlType() != null) criteria.andOthControlTypeEqualTo(eo.getOthControlType().getValue());
        if (eo.getResBranchRange() != null) criteria.andResBranchRangeEqualTo(eo.getResBranchRange().getValue());
        if (eo.getRestraintType() != null) criteria.andRestraintTypeEqualTo(eo.getRestraintType().getValue());
        if (eo.getOthTerm() != null) criteria.andOthTermEqualTo(eo.getOthTerm());
        if (eo.getCardMedium() != null) criteria.andCardMediumEqualTo(eo.getCardMedium());
        if (eo.getRuleId() != null) criteria.andRuleIdEqualTo(eo.getRuleId());
        if (eo.getControlType() != null) criteria.andControlTypeEqualTo(eo.getControlType().getValue());
        if (eo.getDealFlow() != null) criteria.andDealFlowEqualTo(eo.getDealFlow().getValue());
        if (eo.getResOperateFlag() != null) criteria.andResOperateFlagEqualTo(eo.getResOperateFlag().getValue());
        if (eo.getOthTermType() != null) criteria.andOthTermTypeEqualTo(eo.getOthTermType().getValue());
        if (eo.getDelayTermType() != null) criteria.andDelayTermTypeEqualTo(eo.getDelayTermType().getValue());
        if (eo.getCreateTimestamp() != null) criteria.andCreateTimestampEqualTo(eo.getCreateTimestamp());
        if (eo.getLimitRef() != null) criteria.andLimitRefEqualTo(eo.getLimitRef().getValue());
        if (eo.getOthDelayTerm() != null) criteria.andOthDelayTermEqualTo(eo.getOthDelayTerm());
        return example;
    }
}