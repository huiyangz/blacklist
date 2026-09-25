package com.dcits.blacklist.service.utils;

import com.dcits.blacklist.entity.RcListCheckRange;
import com.dcits.blacklist.entity.RcListCheckRangeExample;
import com.dcits.blacklist.facade.eo.RcListCheckRangeEO;
import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.TranType;

public final class RcListCheckRangeValueUtil {
    private RcListCheckRangeValueUtil() {
    }

    public static RcListCheckRangeEO entityToEo(RcListCheckRange entity) {
        if (entity == null) {
            return null;
        }
        RcListCheckRangeEO eo = new RcListCheckRangeEO();
        eo.setListType(entity.getListType());
        eo.setRuleId(entity.getRuleId());
        eo.setSeqNo(entity.getSeqNo());
        eo.setProgramId(entity.getProgramId());
        eo.setCreateTimestamp(entity.getCreateTimestamp());
        eo.setLastUpdTimestamp(entity.getLastUpdTimestamp());
        eo.setSourceType(SourceType.byValue(entity.getSourceType()));
        eo.setEventType(entity.getEventType());
        eo.setTranType(TranType.byValue(entity.getTranType()));
        eo.setServiceCode(entity.getServiceCode());
        eo.setMessageType(entity.getMessageType());
        eo.setMessageCode(entity.getMessageCode());
        return eo;
    }

    public static RcListCheckRange eoToEntity(RcListCheckRangeEO eo) {
        if (eo == null) {
            return null;
        }
        RcListCheckRange entity = new RcListCheckRange();
        entity.setListType(eo.getListType());
        entity.setRuleId(eo.getRuleId());
        entity.setSeqNo(eo.getSeqNo());
        entity.setProgramId(eo.getProgramId());
        entity.setCreateTimestamp(eo.getCreateTimestamp());
        entity.setLastUpdTimestamp(eo.getLastUpdTimestamp());
        entity.setSourceType(eo.getSourceType() == null ? null : eo.getSourceType().getValue());
        entity.setEventType(eo.getEventType());
        entity.setTranType(eo.getTranType() == null ? null : eo.getTranType().getValue());
        entity.setServiceCode(eo.getServiceCode());
        entity.setMessageType(eo.getMessageType());
        entity.setMessageCode(eo.getMessageCode());
        return entity;
    }

    public static RcListCheckRangeExample eoToEntityExample(RcListCheckRangeEO eo) {
        if (eo == null) {
            return null;
        }
        RcListCheckRangeExample example = new RcListCheckRangeExample();
        RcListCheckRangeExample.Criteria criteria = example.createCriteria();
        if (eo.getListType() != null) criteria.andListTypeEqualTo(eo.getListType());
        if (eo.getRuleId() != null) criteria.andRuleIdEqualTo(eo.getRuleId());
        if (eo.getSeqNo() != null) criteria.andSeqNoEqualTo(eo.getSeqNo());
        if (eo.getProgramId() != null) criteria.andProgramIdEqualTo(eo.getProgramId());
        if (eo.getCreateTimestamp() != null) criteria.andCreateTimestampEqualTo(eo.getCreateTimestamp());
        if (eo.getLastUpdTimestamp() != null) criteria.andLastUpdTimestampEqualTo(eo.getLastUpdTimestamp());
        if (eo.getSourceType() != null) criteria.andSourceTypeEqualTo(eo.getSourceType().getValue());
        if (eo.getEventType() != null) criteria.andEventTypeEqualTo(eo.getEventType());
        if (eo.getTranType() != null) criteria.andTranTypeEqualTo(eo.getTranType().getValue());
        if (eo.getServiceCode() != null) criteria.andServiceCodeEqualTo(eo.getServiceCode());
        if (eo.getMessageType() != null) criteria.andMessageTypeEqualTo(eo.getMessageType());
        if (eo.getMessageCode() != null) criteria.andMessageCodeEqualTo(eo.getMessageCode());
        return example;
    }
}