package com.dcits.blacklist.service.components;

import com.dcits.blacklist.enums.ListCategory;
import java.util.ArrayList;
import java.util.List;

import com.dcits.blacklist.entity.RcListType;
import com.dcits.blacklist.entity.RcListTypeExample;
import com.dcits.blacklist.facade.components.IRcListTypeBcc;
import com.dcits.blacklist.facade.eo.RcListTypeEO;
import com.dcits.blacklist.repo.RcListTypeMapper;
import com.dcits.blacklist.service.utils.RcListTypeValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RcListTypeBasisCpnt implements IRcListTypeBcc {
    @Autowired
    RcListTypeMapper rcListTypeMapper;

    @Override
    public long countByEo(RcListTypeEO eo) {
        RcListTypeExample example = RcListTypeValueUtil.eoToEntityExample(eo);
        return rcListTypeMapper.countByExample(example);
    }

    @Override
    public int removeByEo(RcListTypeEO eo) {
        RcListTypeExample example = RcListTypeValueUtil.eoToEntityExample(eo);
        return rcListTypeMapper.deleteByExample(example);
    }

    @Override
    public int removeByPrimaryKey(String listType) {
        return rcListTypeMapper.deleteByPrimaryKey(listType);
    }

    @Override
    public int create(RcListTypeEO eo) {
        RcListType row = RcListTypeValueUtil.eoToEntity(eo);
        return rcListTypeMapper.insert(row);
    }

    @Override
    public int createSelective(RcListTypeEO eo) {
        RcListType row = RcListTypeValueUtil.eoToEntity(eo);
        return rcListTypeMapper.insertSelective(row);
    }

    @Override
    public List<RcListTypeEO> findByEo(RcListTypeEO eo) {
        RcListTypeExample example = RcListTypeValueUtil.eoToEntityExample(eo);
        List<RcListTypeEO> result = new ArrayList<>();
        List<RcListType> dbResult = rcListTypeMapper.selectByExample(example);
        for (RcListType item : dbResult) {
            result.add(RcListTypeValueUtil.entityToEo(item));
        }
        return result;
    }

    @Override
    public RcListTypeEO findByPrimaryKey(String listType) {
        return RcListTypeValueUtil.entityToEo(rcListTypeMapper.selectByPrimaryKey(listType));
    }

    @Override
    public int modifyByPrimaryKeySelective(RcListTypeEO eo) {
        RcListType row = RcListTypeValueUtil.eoToEntity(eo);
        return rcListTypeMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int modifyByPrimaryKey(RcListTypeEO eo) {
        RcListType row = RcListTypeValueUtil.eoToEntity(eo);
        return rcListTypeMapper.updateByPrimaryKey(row);
    }
}