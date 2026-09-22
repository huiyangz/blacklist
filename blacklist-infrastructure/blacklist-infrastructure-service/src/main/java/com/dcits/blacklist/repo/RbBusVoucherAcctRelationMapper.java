package com.dcits.blacklist.repo;

import com.dcits.blacklist.entity.RbBusVoucherAcctRelation;
import com.dcits.blacklist.entity.RbBusVoucherAcctRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RbBusVoucherAcctRelationMapper {
    long countByExample(RbBusVoucherAcctRelationExample example);

    int deleteByExample(RbBusVoucherAcctRelationExample example);

    int deleteByPrimaryKey(@Param("voucherNo") String voucherNo, @Param("docType") String docType, @Param("baseAcctNo") String baseAcctNo);

    int insert(RbBusVoucherAcctRelation row);

    int insertSelective(RbBusVoucherAcctRelation row);

    List<RbBusVoucherAcctRelation> selectByExample(RbBusVoucherAcctRelationExample example);

    RbBusVoucherAcctRelation selectByPrimaryKey(@Param("voucherNo") String voucherNo, @Param("docType") String docType, @Param("baseAcctNo") String baseAcctNo);

    int updateByExampleSelective(@Param("row") RbBusVoucherAcctRelation row, @Param("example") RbBusVoucherAcctRelationExample example);

    int updateByExample(@Param("row") RbBusVoucherAcctRelation row, @Param("example") RbBusVoucherAcctRelationExample example);

    int updateByPrimaryKeySelective(RbBusVoucherAcctRelation row);

    int updateByPrimaryKey(RbBusVoucherAcctRelation row);
}