package com.dcits.blacklist.facade.components;

import com.dcits.blacklist.enums.ListCategory;
import java.util.List;

import com.dcits.blacklist.facade.eo.RcListTypeEO;

/*实体表【黑名单类型表(RC_LIST_TYPE)】数据服务接口*/
public interface IRcListTypeBcc {
    /** count数据库表记录根据入参com.dcits.blacklist.facade.eo.RcListTypeEO中的属性字段组合 **/
    long countByEo(RcListTypeEO eo);

    /** remove数据库表记录根据入参com.dcits.blacklist.facade.eo.RcListTypeEO中的属性字段组合 **/
    int removeByEo(RcListTypeEO eo);

    /** remove 根据主键: 名单类型代码 **/
    int removeByPrimaryKey(String listType);

    int create(RcListTypeEO eo);

    /** create数据库表记录，主键和EO对象中不允许为空的字段必填，其它可为空字段可选填，执行时根据com.dcits.blacklist.facade.eo.RcListTypeEO中不为空的属性写入数据库**/
    int createSelective(RcListTypeEO eo);

    /** find数据库表记录根据入参com.dcits.blacklist.facade.eo.RcListTypeEO中的属性字段组合 **/
    List<RcListTypeEO> findByEo(RcListTypeEO eo);

    /** find 根据主键: 名单类型代码 **/
    RcListTypeEO findByPrimaryKey(String listType);

    /**  根据主键: 名单类型代码执行更新记录操作，仅更新入参com.dcits.blacklist.facade.eo.RcListTypeEO中不为空的属性字段 **/
    int modifyByPrimaryKeySelective(RcListTypeEO eo);

    /** modify 根据主键: 名单类型代码 **/
    int modifyByPrimaryKey(RcListTypeEO eo);
}