package com.dcits.blacklist.repo;

import com.dcits.blacklist.entity.RbBusAcct;
import com.dcits.blacklist.entity.RbBusAcctExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RbBusAcctMapper {
    long countByExample(RbBusAcctExample example);

    int deleteByExample(RbBusAcctExample example);

    int deleteByPrimaryKey(@Param("internalKey") Integer internalKey);

    int insert(RbBusAcct row);

    int insertSelective(RbBusAcct row);

    List<RbBusAcct> selectByExample(RbBusAcctExample example);

    RbBusAcct selectByPrimaryKey(@Param("internalKey") Integer internalKey);

    int updateByExampleSelective(@Param("row") RbBusAcct row, @Param("example") RbBusAcctExample example);

    int updateByExample(@Param("row") RbBusAcct row, @Param("example") RbBusAcctExample example);

    int updateByPrimaryKeySelective(RbBusAcct row);

    int updateByPrimaryKey(RbBusAcct row);
}