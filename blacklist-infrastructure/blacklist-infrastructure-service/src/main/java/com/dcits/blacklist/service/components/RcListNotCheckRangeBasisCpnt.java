package com.dcits.blacklist.service.components;

import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.TranType;
import java.util.ArrayList;
import java.util.List;

import com.dcits.blacklist.entity.RcListNotCheckRange;
import com.dcits.blacklist.entity.RcListNotCheckRangeExample;
import com.dcits.blacklist.facade.components.IRcListNotCheckRangeBcc;
import com.dcits.blacklist.facade.eo.RcListNotCheckRangeEO;
import com.dcits.blacklist.repo.RcListNotCheckRangeMapper;
import com.dcits.blacklist.service.utils.RcListNotCheckRangeValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RcListNotCheckRangeBasisCpnt implements IRcListNotCheckRangeBcc {
    @Autowired
    RcListNotCheckRangeMapper rcListNotCheckRangeMapper;

    @Override
    public long countByEo(RcListNotCheckRangeEO eo) {
        RcListNotCheckRangeExample example = RcListNotCheckRangeValueUtil.eoToEntityExample(eo);
        return rcListNotCheckRangeMapper.countByExample(example);
    }

    @Override
    public int removeByEo(RcListNotCheckRangeEO eo) {
        RcListNotCheckRangeExample example = RcListNotCheckRangeValueUtil.eoToEntityExample(eo);
        return rcListNotCheckRangeMapper.deleteByExample(example);
    }

    @Override
    public int removeByPrimaryKey(String seqNo) {
        return rcListNotCheckRangeMapper.deleteByPrimaryKey(seqNo);
    }

    @Override
    public int create(RcListNotCheckRangeEO eo) {
        RcListNotCheckRange row = RcListNotCheckRangeValueUtil.eoToEntity(eo);
        return rcListNotCheckRangeMapper.insert(row);
    }

    @Override
    public int createSelective(RcListNotCheckRangeEO eo) {
        RcListNotCheckRange row = RcListNotCheckRangeValueUtil.eoToEntity(eo);
        return rcListNotCheckRangeMapper.insertSelective(row);
    }

    @Override
    public List<RcListNotCheckRangeEO> findByEo(RcListNotCheckRangeEO eo) {
        RcListNotCheckRangeExample example = RcListNotCheckRangeValueUtil.eoToEntityExample(eo);
        List<RcListNotCheckRangeEO> result = new ArrayList<>();
        List<RcListNotCheckRange> dbResult = rcListNotCheckRangeMapper.selectByExample(example);
        for (RcListNotCheckRange item : dbResult) {
            result.add(RcListNotCheckRangeValueUtil.entityToEo(item));
        }
        return result;
    }

    @Override
    public RcListNotCheckRangeEO findByPrimaryKey(String seqNo) {
        return RcListNotCheckRangeValueUtil.entityToEo(rcListNotCheckRangeMapper.selectByPrimaryKey(seqNo));
    }

    @Override
    public int modifyByPrimaryKeySelective(RcListNotCheckRangeEO eo) {
        RcListNotCheckRange row = RcListNotCheckRangeValueUtil.eoToEntity(eo);
        return rcListNotCheckRangeMapper.updateByPrimaryKeySelective(row);
    }

    @Override
    public int modifyByPrimaryKey(RcListNotCheckRangeEO eo) {
        RcListNotCheckRange row = RcListNotCheckRangeValueUtil.eoToEntity(eo);
        return rcListNotCheckRangeMapper.updateByPrimaryKey(row);
    }
}