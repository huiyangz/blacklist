package com.dcits.blacklist.service.utils;

import com.dcits.blacklist.entity.RcListType;
import com.dcits.blacklist.entity.RcListTypeExample;
import com.dcits.blacklist.facade.eo.RcListTypeEO;
import com.dcits.blacklist.enums.ListCategory;

public final class RcListTypeValueUtil {
    private RcListTypeValueUtil() {
    }

    public static RcListTypeEO entityToEo(RcListType entity) {
        if (entity == null) {
            return null;
        }
        RcListTypeEO eo = new RcListTypeEO();
        eo.setRuleId(entity.getRuleId());
        eo.setListCategory(ListCategory.byValue(entity.getListCategory()));
        eo.setListTypeDesc(entity.getListTypeDesc());
        eo.setCreateTimestamp(entity.getCreateTimestamp());
        eo.setLastUpdTimestamp(entity.getLastUpdTimestamp());
        eo.setListType(entity.getListType());
        return eo;
    }

    public static RcListType eoToEntity(RcListTypeEO eo) {
        if (eo == null) {
            return null;
        }
        RcListType entity = new RcListType();
        entity.setRuleId(eo.getRuleId());
        entity.setListCategory(eo.getListCategory() == null ? null : eo.getListCategory().getValue());
        entity.setListTypeDesc(eo.getListTypeDesc());
        entity.setCreateTimestamp(eo.getCreateTimestamp());
        entity.setLastUpdTimestamp(eo.getLastUpdTimestamp());
        entity.setListType(eo.getListType());
        return entity;
    }

    public static RcListTypeExample eoToEntityExample(RcListTypeEO eo) {
        if (eo == null) {
            return null;
        }
        RcListTypeExample example = new RcListTypeExample();
        RcListTypeExample.Criteria criteria = example.createCriteria();
        if (eo.getRuleId() != null) criteria.andRuleIdEqualTo(eo.getRuleId());
        if (eo.getListCategory() != null) criteria.andListCategoryEqualTo(eo.getListCategory().getValue());
        if (eo.getListTypeDesc() != null) criteria.andListTypeDescEqualTo(eo.getListTypeDesc());
        if (eo.getCreateTimestamp() != null) criteria.andCreateTimestampEqualTo(eo.getCreateTimestamp());
        if (eo.getLastUpdTimestamp() != null) criteria.andLastUpdTimestampEqualTo(eo.getLastUpdTimestamp());
        if (eo.getListType() != null) criteria.andListTypeEqualTo(eo.getListType());
        return example;
    }
}