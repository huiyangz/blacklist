package com.dcits.blacklist.service.components;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.DocumentType;
import com.dcits.blacklist.enums.IssCountry;
import com.dcits.blacklist.enums.ListCategory;
import com.dcits.blacklist.enums.ListOrg;
import com.dcits.blacklist.enums.RcBlackStatus;
import com.dcits.blacklist.enums.SourceType;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.dcits.blacklist.entity.RcAllList;
import com.dcits.blacklist.entity.RcAllListExample;
import com.dcits.blacklist.facade.components.IRcAllListBcc;
import com.dcits.blacklist.facade.eo.RcAllListEO;
import com.dcits.blacklist.repo.RcAllListMapper;
import com.dcits.blacklist.service.utils.RcAllListValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RcAllListBasisCpnt implements IRcAllListBcc {
    @Autowired
    RcAllListMapper rcAllListMapper;

    @Override
    public long countByEo(RcAllListEO eo) {
        RcAllListExample example = RcAllListValueUtil.eoToEntityExample(eo);
        return rcAllListMapper.countByExample(example);
    }

    @Override
    public int removeByEo(RcAllListEO eo) {
        RcAllListExample example = RcAllListValueUtil.eoToEntityExample(eo);
        return rcAllListMapper.deleteByExample(example);
    }

    @Override
    public int removeByPrimaryKey(String rcSeqNo) {
        return rcAllListMapper.deleteByPrimaryKey(rcSeqNo);
    }

    @Override
    public int create(RcAllListEO eo) {
        RcAllList row = RcAllListValueUtil.eoToEntity(eo);
        return rcAllListMapper.insert(row);
    }

    @Override
    public int createSelective(RcAllListEO eo) {
        RcAllList row = RcAllListValueUtil.eoToEntity(eo);
        return rcAllListMapper.insertSelective(row);
    }

    @Override
    public List<RcAllListEO> findByEo(RcAllListEO eo) {
        RcAllListExample example = RcAllListValueUtil.eoToEntityExample(eo);
        List<RcAllListEO> result = new ArrayList<>();
        List<RcAllList> dbResult = rcAllListMapper.selectByExample(example);
        for (RcAllList item : dbResult) {
            result.add(RcAllListValueUtil.entityToEo(item));
        }
        return result;
    }

    @Override
    public RcAllListEO findByPrimaryKey(String rcSeqNo) {
        return RcAllListValueUtil.entityToEo(rcAllListMapper.selectByPrimaryKey(rcSeqNo));
    }

    @Override
    public int modifyByPrimaryKeySelective(RcAllListEO eo) {
        RcAllList row = RcAllListValueUtil.eoToEntity(eo);
        return rcAllListMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int modifyByPrimaryKey(RcAllListEO eo) {
        RcAllList row = RcAllListValueUtil.eoToEntity(eo);
        return rcAllListMapper.updateByPrimaryKey(row);
    }
}