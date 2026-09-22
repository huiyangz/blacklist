package com.dcits.blacklist.facade.components;

import com.dcits.blacklist.enums.AcctBranch;
import com.dcits.blacklist.enums.CategoryType;
import com.dcits.blacklist.enums.City;
import com.dcits.blacklist.enums.ClassLevel;
import com.dcits.blacklist.enums.ClientClass;
import com.dcits.blacklist.enums.ClientIndicator;
import com.dcits.blacklist.enums.ClientStatus;
import com.dcits.blacklist.enums.ClientType;
import com.dcits.blacklist.enums.ClientVerificationResult;
import com.dcits.blacklist.enums.ContactType;
import com.dcits.blacklist.enums.CountryLoc;
import com.dcits.blacklist.enums.CrRating;
import com.dcits.blacklist.enums.DocumentType;
import com.dcits.blacklist.enums.Education;
import com.dcits.blacklist.enums.Industry;
import com.dcits.blacklist.enums.IndustryLevel;
import com.dcits.blacklist.enums.IssCountry;
import com.dcits.blacklist.enums.Nation;
import com.dcits.blacklist.enums.OccupationCode;
import com.dcits.blacklist.enums.Sex;
import com.dcits.blacklist.enums.SpokenLanguage;
import com.dcits.blacklist.enums.State;
import com.dcits.blacklist.enums.TaxFlag;
import com.dcits.blacklist.enums.TaxResidentFlag;
import java.util.Date;
import java.util.List;

import com.dcits.blacklist.facade.eo.FmClientCopyEO;

/*实体表【客户副本表(FM_CLIENT_COPY)】数据服务接口*/
public interface IFmClientCopyBcc {
    /** count数据库表记录根据入参com.dcits.blacklist.facade.eo.FmClientCopyEO中的属性字段组合 **/
    long countByEo(FmClientCopyEO eo);

    /** remove数据库表记录根据入参com.dcits.blacklist.facade.eo.FmClientCopyEO中的属性字段组合 **/
    int removeByEo(FmClientCopyEO eo);

    /** remove 根据主键: 客户号 **/
    int removeByPrimaryKey(String clientNo);

    int create(FmClientCopyEO eo);

    /** create数据库表记录，主键和EO对象中不允许为空的字段必填，其它可为空字段可选填，执行时根据com.dcits.blacklist.facade.eo.FmClientCopyEO中不为空的属性写入数据库**/
    int createSelective(FmClientCopyEO eo);

    /** find数据库表记录根据入参com.dcits.blacklist.facade.eo.FmClientCopyEO中的属性字段组合 **/
    List<FmClientCopyEO> findByEo(FmClientCopyEO eo);

    /** find 根据主键: 客户号 **/
    FmClientCopyEO findByPrimaryKey(String clientNo);

    /**  根据主键: 客户号执行更新记录操作，仅更新入参com.dcits.blacklist.facade.eo.FmClientCopyEO中不为空的属性字段 **/
    int modifyByPrimaryKeySelective(FmClientCopyEO eo);

    /** modify 根据主键: 客户号 **/
    int modifyByPrimaryKey(FmClientCopyEO eo);
}