package com.dcits.blacklist.repo;

import com.dcits.blacklist.entity.RcListType;
import com.dcits.blacklist.entity.RcListTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RcListTypeMapper {
    long countByExample(RcListTypeExample example);

    int deleteByExample(RcListTypeExample example);

    int deleteByPrimaryKey(@Param("listType") String listType);

    int insert(RcListType row);

    int insertSelective(RcListType row);

    List<RcListType> selectByExample(RcListTypeExample example);

    RcListType selectByPrimaryKey(@Param("listType") String listType);

    int updateByExampleSelective(@Param("row") RcListType row, @Param("example") RcListTypeExample example);

    int updateByExample(@Param("row") RcListType row, @Param("example") RcListTypeExample example);

    int updateByPrimaryKeySelective(RcListType row);

    int updateByPrimaryKey(RcListType row);
}