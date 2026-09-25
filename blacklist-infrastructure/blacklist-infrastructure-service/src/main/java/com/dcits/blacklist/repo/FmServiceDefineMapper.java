package com.dcits.blacklist.repo;

import com.dcits.blacklist.entity.FmServiceDefine;
import com.dcits.blacklist.entity.FmServiceDefineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmServiceDefineMapper {
    long countByExample(FmServiceDefineExample example);

    int deleteByExample(FmServiceDefineExample example);

    int deleteByPrimaryKey(@Param("messageCode") String messageCode, @Param("serviceCode") String serviceCode, @Param("messageType") String messageType);

    int insert(FmServiceDefine row);

    int insertSelective(FmServiceDefine row);

    List<FmServiceDefine> selectByExample(FmServiceDefineExample example);

    FmServiceDefine selectByPrimaryKey(@Param("messageCode") String messageCode, @Param("serviceCode") String serviceCode, @Param("messageType") String messageType);

    int updateByExampleSelective(@Param("row") FmServiceDefine row, @Param("example") FmServiceDefineExample example);

    int updateByExample(@Param("row") FmServiceDefine row, @Param("example") FmServiceDefineExample example);

    int updateByPrimaryKeySelective(FmServiceDefine row);

    int updateByPrimaryKey(FmServiceDefine row);
}