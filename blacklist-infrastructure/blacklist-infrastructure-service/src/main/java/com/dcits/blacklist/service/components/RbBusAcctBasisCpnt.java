package com.dcits.blacklist.service.components;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.AcctCcy;
import com.dcits.blacklist.enums.AcctNatureNo;
import com.dcits.blacklist.enums.AcctRiskLevel;
import com.dcits.blacklist.enums.AcctStatus;
import com.dcits.blacklist.enums.AcctVerifyFlag;
import com.dcits.blacklist.enums.AcctVerifyResult;
import com.dcits.blacklist.enums.AllDepInd;
import com.dcits.blacklist.enums.AllDraInd;
import com.dcits.blacklist.enums.AllDraRange;
import com.dcits.blacklist.enums.AnnualStatus;
import com.dcits.blacklist.enums.AutoRenewInd;
import com.dcits.blacklist.enums.BalType;
import com.dcits.blacklist.enums.CheckCertificateType;
import com.dcits.blacklist.enums.ClientType;
import com.dcits.blacklist.enums.DepositNature;
import com.dcits.blacklist.enums.FarmerFlag;
import com.dcits.blacklist.enums.FixedCall;
import com.dcits.blacklist.enums.IntIndFlag;
import com.dcits.blacklist.enums.ManageType;
import com.dcits.blacklist.enums.OsaFlag;
import com.dcits.blacklist.enums.RbAcctType;
import com.dcits.blacklist.enums.RbBusAcctPurpose;
import com.dcits.blacklist.enums.RenewMethod;
import com.dcits.blacklist.enums.SimpleAcct;
import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.SpecAcctFlag;
import com.dcits.blacklist.enums.TermType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.dcits.blacklist.entity.RbBusAcct;
import com.dcits.blacklist.entity.RbBusAcctExample;
import com.dcits.blacklist.facade.components.IRbBusAcctBcc;
import com.dcits.blacklist.facade.eo.RbBusAcctEO;
import com.dcits.blacklist.repo.RbBusAcctMapper;
import com.dcits.blacklist.service.utils.RbBusAcctValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RbBusAcctBasisCpnt implements IRbBusAcctBcc {
    @Autowired
    RbBusAcctMapper rbBusAcctMapper;

    @Override
    public long countByEo(RbBusAcctEO eo) {
        RbBusAcctExample example = RbBusAcctValueUtil.eoToEntityExample(eo);
        return rbBusAcctMapper.countByExample(example);
    }

    @Override
    public int removeByEo(RbBusAcctEO eo) {
        RbBusAcctExample example = RbBusAcctValueUtil.eoToEntityExample(eo);
        return rbBusAcctMapper.deleteByExample(example);
    }

    @Override
    public int removeByPrimaryKey(Integer internalKey) {
        return rbBusAcctMapper.deleteByPrimaryKey(internalKey);
    }

    @Override
    public int create(RbBusAcctEO eo) {
        RbBusAcct row = RbBusAcctValueUtil.eoToEntity(eo);
        return rbBusAcctMapper.insert(row);
    }

    @Override
    public int createSelective(RbBusAcctEO eo) {
        RbBusAcct row = RbBusAcctValueUtil.eoToEntity(eo);
        return rbBusAcctMapper.insertSelective(row);
    }

    @Override
    public List<RbBusAcctEO> findByEo(RbBusAcctEO eo) {
        RbBusAcctExample example = RbBusAcctValueUtil.eoToEntityExample(eo);
        List<RbBusAcctEO> result = new ArrayList<>();
        List<RbBusAcct> dbResult = rbBusAcctMapper.selectByExample(example);
        for (RbBusAcct item : dbResult) {
            result.add(RbBusAcctValueUtil.entityToEo(item));
        }
        return result;
    }

    @Override
    public RbBusAcctEO findByPrimaryKey(Integer internalKey) {
        return RbBusAcctValueUtil.entityToEo(rbBusAcctMapper.selectByPrimaryKey(internalKey));
    }

    @Override
    public int modifyByPrimaryKeySelective(RbBusAcctEO eo) {
        RbBusAcct row = RbBusAcctValueUtil.eoToEntity(eo);
        return rbBusAcctMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int modifyByPrimaryKey(RbBusAcctEO eo) {
        RbBusAcct row = RbBusAcctValueUtil.eoToEntity(eo);
        return rbBusAcctMapper.updateByPrimaryKey(row);
    }
}