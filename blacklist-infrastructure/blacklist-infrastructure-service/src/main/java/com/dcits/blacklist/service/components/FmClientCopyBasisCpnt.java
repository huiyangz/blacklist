package com.dcits.blacklist.service.components;

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
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.dcits.blacklist.entity.FmClientCopy;
import com.dcits.blacklist.entity.FmClientCopyExample;
import com.dcits.blacklist.facade.components.IFmClientCopyBcc;
import com.dcits.blacklist.facade.eo.FmClientCopyEO;
import com.dcits.blacklist.repo.FmClientCopyMapper;
import com.dcits.blacklist.service.utils.FmClientCopyValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FmClientCopyBasisCpnt implements IFmClientCopyBcc {
    @Autowired
    FmClientCopyMapper fmClientCopyMapper;

    @Override
    public long countByEo(FmClientCopyEO eo) {
        FmClientCopyExample example = FmClientCopyValueUtil.eoToEntityExample(eo);
        return fmClientCopyMapper.countByExample(example);
    }

    @Override
    public int removeByEo(FmClientCopyEO eo) {
        FmClientCopyExample example = FmClientCopyValueUtil.eoToEntityExample(eo);
        return fmClientCopyMapper.deleteByExample(example);
    }

    @Override
    public int removeByPrimaryKey(String clientNo) {
        return fmClientCopyMapper.deleteByPrimaryKey(clientNo);
    }

    @Override
    public int create(FmClientCopyEO eo) {
        FmClientCopy row = FmClientCopyValueUtil.eoToEntity(eo);
        return fmClientCopyMapper.insert(row);
    }

    @Override
    public int createSelective(FmClientCopyEO eo) {
        FmClientCopy row = FmClientCopyValueUtil.eoToEntity(eo);
        return fmClientCopyMapper.insertSelective(row);
    }

    @Override
    public List<FmClientCopyEO> findByEo(FmClientCopyEO eo) {
        FmClientCopyExample example = FmClientCopyValueUtil.eoToEntityExample(eo);
        List<FmClientCopyEO> result = new ArrayList<>();
        List<FmClientCopy> dbResult = fmClientCopyMapper.selectByExample(example);
        for (FmClientCopy item : dbResult) {
            result.add(FmClientCopyValueUtil.entityToEo(item));
        }
        return result;
    }

    @Override
    public FmClientCopyEO findByPrimaryKey(String clientNo) {
        return FmClientCopyValueUtil.entityToEo(fmClientCopyMapper.selectByPrimaryKey(clientNo));
    }

    @Override
    public int modifyByPrimaryKeySelective(FmClientCopyEO eo) {
        FmClientCopy row = FmClientCopyValueUtil.eoToEntity(eo);
        return fmClientCopyMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int modifyByPrimaryKey(FmClientCopyEO eo) {
        FmClientCopy row = FmClientCopyValueUtil.eoToEntity(eo);
        return fmClientCopyMapper.updateByPrimaryKey(row);
    }
}