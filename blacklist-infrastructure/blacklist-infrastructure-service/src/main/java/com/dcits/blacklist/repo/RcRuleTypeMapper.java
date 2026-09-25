package com.dcits.blacklist.repo;

import com.dcits.blacklist.entity.RcRuleType;
import com.dcits.blacklist.entity.RcRuleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RcRuleTypeMapper {
    long countByExample(RcRuleTypeExample example);

    int deleteByExample(RcRuleTypeExample example);

    int deleteByPrimaryKey(@Param("ruleId") String ruleId);

    int insert(RcRuleType row);

    int insertSelective(RcRuleType row);

    List<RcRuleType> selectByExample(RcRuleTypeExample example);

    RcRuleType selectByPrimaryKey(@Param("ruleId") String ruleId);

    int updateByExampleSelective(@Param("row") RcRuleType row, @Param("example") RcRuleTypeExample example);

    int updateByExample(@Param("row") RcRuleType row, @Param("example") RcRuleTypeExample example);

    int updateByPrimaryKeySelective(RcRuleType row);

    int updateByPrimaryKey(RcRuleType row);
}