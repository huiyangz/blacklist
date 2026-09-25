package com.dcits.blacklist.service.utils;

import com.dcits.blacklist.entity.RcAllList;
import com.dcits.blacklist.entity.RcAllListExample;
import com.dcits.blacklist.facade.eo.RcAllListEO;
import com.dcits.blacklist.enums.RcBlackStatus;
import com.dcits.blacklist.enums.ListCategory;
import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.DocumentType;
import com.dcits.blacklist.enums.ListOrg;
import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.IssCountry;

public final class RcAllListValueUtil {
    private RcAllListValueUtil() {
    }

    public static RcAllListEO entityToEo(RcAllList entity) {
        if (entity == null) {
            return null;
        }
        RcAllListEO eo = new RcAllListEO();
        eo.setRcBlackStatus(RcBlackStatus.byValue(entity.getRcBlackStatus()));
        eo.setOurBankFlag(entity.getOurBankFlag());
        eo.setEffectDate(entity.getEffectDate());
        eo.setClientName(entity.getClientName());
        eo.setOtherAcctResFlag(entity.getOtherAcctResFlag());
        eo.setNarrative(entity.getNarrative());
        eo.setListCategory(ListCategory.byValue(entity.getListCategory()));
        eo.setResSeqNos(entity.getResSeqNos());
        eo.setCurAcctResFlag(entity.getCurAcctResFlag());
        eo.setDataValue(entity.getDataValue());
        eo.setClientNo(entity.getClientNo());
        eo.setInputBranch(AcctBranch.byValue(entity.getInputBranch()));
        eo.setTranDate(entity.getTranDate());
        eo.setRcSeqNo(entity.getRcSeqNo());
        eo.setDataType(entity.getDataType());
        eo.setDocumentType(DocumentType.byValue(entity.getDocumentType()));
        eo.setListOrg(ListOrg.byValue(entity.getListOrg()));
        eo.setLastUpdTimestamp(entity.getLastUpdTimestamp());
        eo.setTranBranch(AcctBranch.byValue(entity.getTranBranch()));
        eo.setSourceType(SourceType.byValue(entity.getSourceType()));
        eo.setUserId(entity.getUserId());
        eo.setControlNos(entity.getControlNos());
        eo.setMaturityDate(entity.getMaturityDate());
        eo.setRelVerifyFlag(entity.getRelVerifyFlag());
        eo.setListType(entity.getListType());
        eo.setAcctName(entity.getAcctName());
        eo.setIssCountry(IssCountry.byValue(entity.getIssCountry()));
        eo.setCreateTimestamp(entity.getCreateTimestamp());
        return eo;
    }

    public static RcAllList eoToEntity(RcAllListEO eo) {
        if (eo == null) {
            return null;
        }
        RcAllList entity = new RcAllList();
        entity.setRcBlackStatus(eo.getRcBlackStatus() == null ? null : eo.getRcBlackStatus().getValue());
        entity.setOurBankFlag(eo.getOurBankFlag());
        entity.setEffectDate(eo.getEffectDate());
        entity.setClientName(eo.getClientName());
        entity.setOtherAcctResFlag(eo.getOtherAcctResFlag());
        entity.setNarrative(eo.getNarrative());
        entity.setListCategory(eo.getListCategory() == null ? null : eo.getListCategory().getValue());
        entity.setResSeqNos(eo.getResSeqNos());
        entity.setCurAcctResFlag(eo.getCurAcctResFlag());
        entity.setDataValue(eo.getDataValue());
        entity.setClientNo(eo.getClientNo());
        entity.setInputBranch(eo.getInputBranch() == null ? null : eo.getInputBranch().getValue());
        entity.setTranDate(eo.getTranDate());
        entity.setRcSeqNo(eo.getRcSeqNo());
        entity.setDataType(eo.getDataType());
        entity.setDocumentType(eo.getDocumentType() == null ? null : eo.getDocumentType().getValue());
        entity.setListOrg(eo.getListOrg() == null ? null : eo.getListOrg().getValue());
        entity.setLastUpdTimestamp(eo.getLastUpdTimestamp());
        entity.setTranBranch(eo.getTranBranch() == null ? null : eo.getTranBranch().getValue());
        entity.setSourceType(eo.getSourceType() == null ? null : eo.getSourceType().getValue());
        entity.setUserId(eo.getUserId());
        entity.setControlNos(eo.getControlNos());
        entity.setMaturityDate(eo.getMaturityDate());
        entity.setRelVerifyFlag(eo.getRelVerifyFlag());
        entity.setListType(eo.getListType());
        entity.setAcctName(eo.getAcctName());
        entity.setIssCountry(eo.getIssCountry() == null ? null : eo.getIssCountry().getValue());
        entity.setCreateTimestamp(eo.getCreateTimestamp());
        return entity;
    }

    public static RcAllListExample eoToEntityExample(RcAllListEO eo) {
        if (eo == null) {
            return null;
        }
        RcAllListExample example = new RcAllListExample();
        RcAllListExample.Criteria criteria = example.createCriteria();
        if (eo.getRcBlackStatus() != null) criteria.andRcBlackStatusEqualTo(eo.getRcBlackStatus().getValue());
        if (eo.getOurBankFlag() != null) criteria.andOurBankFlagEqualTo(eo.getOurBankFlag());
        if (eo.getEffectDate() != null) criteria.andEffectDateEqualTo(eo.getEffectDate());
        if (eo.getClientName() != null) criteria.andClientNameEqualTo(eo.getClientName());
        if (eo.getOtherAcctResFlag() != null) criteria.andOtherAcctResFlagEqualTo(eo.getOtherAcctResFlag());
        if (eo.getNarrative() != null) criteria.andNarrativeEqualTo(eo.getNarrative());
        if (eo.getListCategory() != null) criteria.andListCategoryEqualTo(eo.getListCategory().getValue());
        if (eo.getResSeqNos() != null) criteria.andResSeqNosEqualTo(eo.getResSeqNos());
        if (eo.getCurAcctResFlag() != null) criteria.andCurAcctResFlagEqualTo(eo.getCurAcctResFlag());
        if (eo.getDataValue() != null) criteria.andDataValueEqualTo(eo.getDataValue());
        if (eo.getClientNo() != null) criteria.andClientNoEqualTo(eo.getClientNo());
        if (eo.getInputBranch() != null) criteria.andInputBranchEqualTo(eo.getInputBranch().getValue());
        if (eo.getTranDate() != null) criteria.andTranDateEqualTo(eo.getTranDate());
        if (eo.getRcSeqNo() != null) criteria.andRcSeqNoEqualTo(eo.getRcSeqNo());
        if (eo.getDataType() != null) criteria.andDataTypeEqualTo(eo.getDataType());
        if (eo.getDocumentType() != null) criteria.andDocumentTypeEqualTo(eo.getDocumentType().getValue());
        if (eo.getListOrg() != null) criteria.andListOrgEqualTo(eo.getListOrg().getValue());
        if (eo.getLastUpdTimestamp() != null) criteria.andLastUpdTimestampEqualTo(eo.getLastUpdTimestamp());
        if (eo.getTranBranch() != null) criteria.andTranBranchEqualTo(eo.getTranBranch().getValue());
        if (eo.getSourceType() != null) criteria.andSourceTypeEqualTo(eo.getSourceType().getValue());
        if (eo.getUserId() != null) criteria.andUserIdEqualTo(eo.getUserId());
        if (eo.getControlNos() != null) criteria.andControlNosEqualTo(eo.getControlNos());
        if (eo.getMaturityDate() != null) criteria.andMaturityDateEqualTo(eo.getMaturityDate());
        if (eo.getRelVerifyFlag() != null) criteria.andRelVerifyFlagEqualTo(eo.getRelVerifyFlag());
        if (eo.getListType() != null) criteria.andListTypeEqualTo(eo.getListType());
        if (eo.getAcctName() != null) criteria.andAcctNameEqualTo(eo.getAcctName());
        if (eo.getIssCountry() != null) criteria.andIssCountryEqualTo(eo.getIssCountry().getValue());
        if (eo.getCreateTimestamp() != null) criteria.andCreateTimestampEqualTo(eo.getCreateTimestamp());
        return example;
    }
}