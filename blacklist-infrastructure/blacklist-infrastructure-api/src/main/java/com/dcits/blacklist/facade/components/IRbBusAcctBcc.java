package com.dcits.blacklist.facade.components;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.AcctCcy;
import com.dcits.blacklist.enums.AcctNatureNo;
import com.dcits.blacklist.enums.AcctRiskLevel;
import com.dcits.blacklist.enums.AcctStatus;
import com.dcits.blacklist.enums.AcctVerifyFlag;
import com.dcits.blacklist.enums.AcctVerifyResult;
import com.dcits.blacklist.enums.AllDepInd;
import com.dcits.blacklist.enums.AllDraInd;
import com.dcits.blacklist.enums.AllDraRange;
import com.dcits.blacklist.enums.AnnualStatus;
import com.dcits.blacklist.enums.AutoRenewInd;
import com.dcits.blacklist.enums.BalType;
import com.dcits.blacklist.enums.CheckCertificateType;
import com.dcits.blacklist.enums.ClientType;
import com.dcits.blacklist.enums.DepositNature;
import com.dcits.blacklist.enums.FarmerFlag;
import com.dcits.blacklist.enums.FixedCall;
import com.dcits.blacklist.enums.IntIndFlag;
import com.dcits.blacklist.enums.ManageType;
import com.dcits.blacklist.enums.OsaFlag;
import com.dcits.blacklist.enums.RbAcctType;
import com.dcits.blacklist.enums.RbBusAcctPurpose;
import com.dcits.blacklist.enums.RenewMethod;
import com.dcits.blacklist.enums.SimpleAcct;
import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.SpecAcctFlag;
import com.dcits.blacklist.enums.TermType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.dcits.blacklist.facade.eo.RbBusAcctEO;

/*实体表【对公存款账户主表(RB_BUS_ACCT)】数据服务接口*/
public interface IRbBusAcctBcc {
    /** count数据库表记录根据入参com.dcits.blacklist.facade.eo.RbBusAcctEO中的属性字段组合 **/
    long countByEo(RbBusAcctEO eo);

    /** remove数据库表记录根据入参com.dcits.blacklist.facade.eo.RbBusAcctEO中的属性字段组合 **/
    int removeByEo(RbBusAcctEO eo);

    /** remove 根据主键: 账户内部键值 **/
    int removeByPrimaryKey(Integer internalKey);

    int create(RbBusAcctEO eo);

    /** create数据库表记录，主键和EO对象中不允许为空的字段必填，其它可为空字段可选填，执行时根据com.dcits.blacklist.facade.eo.RbBusAcctEO中不为空的属性写入数据库**/
    int createSelective(RbBusAcctEO eo);

    /** find数据库表记录根据入参com.dcits.blacklist.facade.eo.RbBusAcctEO中的属性字段组合 **/
    List<RbBusAcctEO> findByEo(RbBusAcctEO eo);

    /** find 根据主键: 账户内部键值 **/
    RbBusAcctEO findByPrimaryKey(Integer internalKey);

    /**  根据主键: 账户内部键值执行更新记录操作，仅更新入参com.dcits.blacklist.facade.eo.RbBusAcctEO中不为空的属性字段 **/
    int modifyByPrimaryKeySelective(RbBusAcctEO eo);

    /** modify 根据主键: 账户内部键值 **/
    int modifyByPrimaryKey(RbBusAcctEO eo);
}