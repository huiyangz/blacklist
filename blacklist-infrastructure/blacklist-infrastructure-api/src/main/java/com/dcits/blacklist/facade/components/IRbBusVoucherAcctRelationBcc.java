package com.dcits.blacklist.facade.components;

import com.dcits.blacklist.enums.AcctCcy;
import com.dcits.blacklist.enums.CanReasonCode;
import com.dcits.blacklist.enums.DocClass;
import com.dcits.blacklist.enums.DocType;
import com.dcits.blacklist.enums.OldStatus;
import java.util.Date;
import java.util.List;

import com.dcits.blacklist.facade.eo.RbBusVoucherAcctRelationEO;

/*实体表【对公存款凭证账户关系表(RB_BUS_VOUCHER_ACCT_RELATION)】数据服务接口*/
public interface IRbBusVoucherAcctRelationBcc {
    /** count数据库表记录根据入参com.dcits.blacklist.facade.eo.RbBusVoucherAcctRelationEO中的属性字段组合 **/
    long countByEo(RbBusVoucherAcctRelationEO eo);

    /** remove数据库表记录根据入参com.dcits.blacklist.facade.eo.RbBusVoucherAcctRelationEO中的属性字段组合 **/
    int removeByEo(RbBusVoucherAcctRelationEO eo);

    /** remove 根据主键: 凭证号、凭证类型、账号 **/
    int removeByPrimaryKey(String voucherNo, String docType, String baseAcctNo);

    int create(RbBusVoucherAcctRelationEO eo);

    /** create数据库表记录，主键和EO对象中不允许为空的字段必填，其它可为空字段可选填，执行时根据com.dcits.blacklist.facade.eo.RbBusVoucherAcctRelationEO中不为空的属性写入数据库**/
    int createSelective(RbBusVoucherAcctRelationEO eo);

    /** find数据库表记录根据入参com.dcits.blacklist.facade.eo.RbBusVoucherAcctRelationEO中的属性字段组合 **/
    List<RbBusVoucherAcctRelationEO> findByEo(RbBusVoucherAcctRelationEO eo);

    /** find 根据主键: 凭证号、凭证类型、账号 **/
    RbBusVoucherAcctRelationEO findByPrimaryKey(String voucherNo, String docType, String baseAcctNo);

    /**  根据主键: 凭证号、凭证类型、账号执行更新记录操作，仅更新入参com.dcits.blacklist.facade.eo.RbBusVoucherAcctRelationEO中不为空的属性字段 **/
    int modifyByPrimaryKeySelective(RbBusVoucherAcctRelationEO eo);

    /** modify 根据主键: 凭证号、凭证类型、账号 **/
    int modifyByPrimaryKey(RbBusVoucherAcctRelationEO eo);
}