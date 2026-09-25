package com.dcits.blacklist.facade.components;

import com.dcits.blacklist.enums.BusiCategory;
import java.util.List;

import com.dcits.blacklist.facade.eo.FmServiceDefineEO;

/*实体表【核心服务定义表(FM_SERVICE_DEFINE)】数据服务接口*/
public interface IFmServiceDefineBcc {
    /** count数据库表记录根据入参com.dcits.blacklist.facade.eo.FmServiceDefineEO中的属性字段组合 **/
    long countByEo(FmServiceDefineEO eo);

    /** remove数据库表记录根据入参com.dcits.blacklist.facade.eo.FmServiceDefineEO中的属性字段组合 **/
    int removeByEo(FmServiceDefineEO eo);

    /** remove 根据主键: 接口服务代码、服务代码、接口服务类型 **/
    int removeByPrimaryKey(String messageCode, String serviceCode, String messageType);

    int create(FmServiceDefineEO eo);

    /** create数据库表记录，主键和EO对象中不允许为空的字段必填，其它可为空字段可选填，执行时根据com.dcits.blacklist.facade.eo.FmServiceDefineEO中不为空的属性写入数据库**/
    int createSelective(FmServiceDefineEO eo);

    /** find数据库表记录根据入参com.dcits.blacklist.facade.eo.FmServiceDefineEO中的属性字段组合 **/
    List<FmServiceDefineEO> findByEo(FmServiceDefineEO eo);

    /** find 根据主键: 接口服务代码、服务代码、接口服务类型 **/
    FmServiceDefineEO findByPrimaryKey(String messageCode, String serviceCode, String messageType);

    /**  根据主键: 接口服务代码、服务代码、接口服务类型执行更新记录操作，仅更新入参com.dcits.blacklist.facade.eo.FmServiceDefineEO中不为空的属性字段 **/
    int modifyByPrimaryKeySelective(FmServiceDefineEO eo);

    /** modify 根据主键: 接口服务代码、服务代码、接口服务类型 **/
    int modifyByPrimaryKey(FmServiceDefineEO eo);
}