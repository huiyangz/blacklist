package com.dcits.blacklist.repo;

import com.dcits.blacklist.entity.RcListNotCheckRange;
import com.dcits.blacklist.entity.RcListNotCheckRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RcListNotCheckRangeMapper {
    long countByExample(RcListNotCheckRangeExample example);

    int deleteByExample(RcListNotCheckRangeExample example);

    int deleteByPrimaryKey(@Param("seqNo") String seqNo);

    int insert(RcListNotCheckRange row);

    int insertSelective(RcListNotCheckRange row);

    List<RcListNotCheckRange> selectByExample(RcListNotCheckRangeExample example);

    RcListNotCheckRange selectByPrimaryKey(@Param("seqNo") String seqNo);

    int updateByExampleSelective(@Param("row") RcListNotCheckRange row, @Param("example") RcListNotCheckRangeExample example);

    int updateByExample(@Param("row") RcListNotCheckRange row, @Param("example") RcListNotCheckRangeExample example);

    int updateByPrimaryKeySelective(RcListNotCheckRange row);

    int updateByPrimaryKey(RcListNotCheckRange row);
}