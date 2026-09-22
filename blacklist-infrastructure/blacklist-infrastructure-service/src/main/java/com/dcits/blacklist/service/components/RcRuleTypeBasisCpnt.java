package com.dcits.blacklist.service.components;

import com.dcits.blacklist.enums.DealFlow;
import com.dcits.blacklist.enums.LimitRef;
import com.dcits.blacklist.enums.OthControlType;
import com.dcits.blacklist.enums.OthRestraintType;
import com.dcits.blacklist.enums.ResBranchRange;
import com.dcits.blacklist.enums.ResOperateFlag;
import com.dcits.blacklist.enums.TermType;
import java.util.ArrayList;
import java.util.List;

import com.dcits.blacklist.entity.RcRuleType;
import com.dcits.blacklist.entity.RcRuleTypeExample;
import com.dcits.blacklist.facade.components.IRcRuleTypeBcc;
import com.dcits.blacklist.facade.eo.RcRuleTypeEO;
import com.dcits.blacklist.repo.RcRuleTypeMapper;
import com.dcits.blacklist.service.utils.RcRuleTypeValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RcRuleTypeBasisCpnt implements IRcRuleTypeBcc {
    @Autowired
    RcRuleTypeMapper rcRuleTypeMapper;

    @Override
    public long countByEo(RcRuleTypeEO eo) {
        RcRuleTypeExample example = RcRuleTypeValueUtil.eoToEntityExample(eo);
        return rcRuleTypeMapper.countByExample(example);
    }

    @Override
    public int removeByEo(RcRuleTypeEO eo) {
        RcRuleTypeExample example = RcRuleTypeValueUtil.eoToEntityExample(eo);
        return rcRuleTypeMapper.deleteByExample(example);
    }

    @Override
    public int removeByPrimaryKey(String ruleId) {
        return rcRuleTypeMapper.deleteByPrimaryKey(ruleId);
    }

    @Override
    public int create(RcRuleTypeEO eo) {
        RcRuleType row = RcRuleTypeValueUtil.eoToEntity(eo);
        return rcRuleTypeMapper.insert(row);
    }

    @Override
    public int createSelective(RcRuleTypeEO eo) {
        RcRuleType row = RcRuleTypeValueUtil.eoToEntity(eo);
        return rcRuleTypeMapper.insertSelective(row);
    }

    @Override
    public List<RcRuleTypeEO> findByEo(RcRuleTypeEO eo) {
        RcRuleTypeExample example = RcRuleTypeValueUtil.eoToEntityExample(eo);
        List<RcRuleTypeEO> result = new ArrayList<>();
        List<RcRuleType> dbResult = rcRuleTypeMapper.selectByExample(example);
        for (RcRuleType item : dbResult) {
            result.add(RcRuleTypeValueUtil.entityToEo(item));
        }
        return result;
    }

    @Override
    public RcRuleTypeEO findByPrimaryKey(String ruleId) {
        return RcRuleTypeValueUtil.entityToEo(rcRuleTypeMapper.selectByPrimaryKey(ruleId));
    }

    @Override
    public int modifyByPrimaryKeySelective(RcRuleTypeEO eo) {
        RcRuleType row = RcRuleTypeValueUtil.eoToEntity(eo);
        return rcRuleTypeMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int modifyByPrimaryKey(RcRuleTypeEO eo) {
        RcRuleType row = RcRuleTypeValueUtil.eoToEntity(eo);
        return rcRuleTypeMapper.updateByPrimaryKey(row);
    }
}