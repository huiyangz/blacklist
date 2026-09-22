package com.dcits.blacklist.service.utils;

import com.dcits.blacklist.entity.FmServiceDefine;
import com.dcits.blacklist.entity.FmServiceDefineExample;
import com.dcits.blacklist.facade.eo.FmServiceDefineEO;
import com.dcits.blacklist.enums.BusiCategory;

public final class FmServiceDefineValueUtil {
    private FmServiceDefineValueUtil() {
    }

    public static FmServiceDefineEO entityToEo(FmServiceDefine entity) {
        if (entity == null) {
            return null;
        }
        FmServiceDefineEO eo = new FmServiceDefineEO();
        eo.setMessageCode(entity.getMessageCode());
        eo.setCompany(entity.getCompany());
        eo.setAcrossBranCheckFlag(entity.getAcrossBranCheckFlag());
        eo.setBusiCategory(BusiCategory.byValue(entity.getBusiCategory()));
        eo.setServiceStatus(entity.getServiceStatus());
        eo.setBlacklistCheckFlag(entity.getBlacklistCheckFlag());
        eo.setServiceCode(entity.getServiceCode());
        eo.setMultiCorpCheckFlag(entity.getMultiCorpCheckFlag());
        eo.setAllowReverseFlag(entity.getAllowReverseFlag());
        eo.setMessageType(entity.getMessageType());
        eo.setWhiteListCheckFlag(entity.getWhiteListCheckFlag());
        eo.setTranTimestamp(entity.getTranTimestamp());
        eo.setBusiSubClass(entity.getBusiSubClass());
        eo.setClientCheckFlag(entity.getClientCheckFlag());
        eo.setUrl(entity.getUrl());
        return eo;
    }

    public static FmServiceDefine eoToEntity(FmServiceDefineEO eo) {
        if (eo == null) {
            return null;
        }
        FmServiceDefine entity = new FmServiceDefine();
        entity.setMessageCode(eo.getMessageCode());
        entity.setCompany(eo.getCompany());
        entity.setAcrossBranCheckFlag(eo.getAcrossBranCheckFlag());
        entity.setBusiCategory(eo.getBusiCategory() == null ? null : eo.getBusiCategory().getValue());
        entity.setServiceStatus(eo.getServiceStatus());
        entity.setBlacklistCheckFlag(eo.getBlacklistCheckFlag());
        entity.setServiceCode(eo.getServiceCode());
        entity.setMultiCorpCheckFlag(eo.getMultiCorpCheckFlag());
        entity.setAllowReverseFlag(eo.getAllowReverseFlag());
        entity.setMessageType(eo.getMessageType());
        entity.setWhiteListCheckFlag(eo.getWhiteListCheckFlag());
        entity.setTranTimestamp(eo.getTranTimestamp());
        entity.setBusiSubClass(eo.getBusiSubClass());
        entity.setClientCheckFlag(eo.getClientCheckFlag());
        entity.setUrl(eo.getUrl());
        return entity;
    }

    public static FmServiceDefineExample eoToEntityExample(FmServiceDefineEO eo) {
        if (eo == null) {
            return null;
        }
        FmServiceDefineExample example = new FmServiceDefineExample();
        FmServiceDefineExample.Criteria criteria = example.createCriteria();
        if (eo.getMessageCode() != null) criteria.andMessageCodeEqualTo(eo.getMessageCode());
        if (eo.getCompany() != null) criteria.andCompanyEqualTo(eo.getCompany());
        if (eo.getAcrossBranCheckFlag() != null) criteria.andAcrossBranCheckFlagEqualTo(eo.getAcrossBranCheckFlag());
        if (eo.getBusiCategory() != null) criteria.andBusiCategoryEqualTo(eo.getBusiCategory().getValue());
        if (eo.getServiceStatus() != null) criteria.andServiceStatusEqualTo(eo.getServiceStatus());
        if (eo.getBlacklistCheckFlag() != null) criteria.andBlacklistCheckFlagEqualTo(eo.getBlacklistCheckFlag());
        if (eo.getServiceCode() != null) criteria.andServiceCodeEqualTo(eo.getServiceCode());
        if (eo.getMultiCorpCheckFlag() != null) criteria.andMultiCorpCheckFlagEqualTo(eo.getMultiCorpCheckFlag());
        if (eo.getAllowReverseFlag() != null) criteria.andAllowReverseFlagEqualTo(eo.getAllowReverseFlag());
        if (eo.getMessageType() != null) criteria.andMessageTypeEqualTo(eo.getMessageType());
        if (eo.getWhiteListCheckFlag() != null) criteria.andWhiteListCheckFlagEqualTo(eo.getWhiteListCheckFlag());
        if (eo.getTranTimestamp() != null) criteria.andTranTimestampEqualTo(eo.getTranTimestamp());
        if (eo.getBusiSubClass() != null) criteria.andBusiSubClassEqualTo(eo.getBusiSubClass());
        if (eo.getClientCheckFlag() != null) criteria.andClientCheckFlagEqualTo(eo.getClientCheckFlag());
        if (eo.getUrl() != null) criteria.andUrlEqualTo(eo.getUrl());
        return example;
    }
}