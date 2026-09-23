package com.dcits.blacklist.facade.components;

import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.TranType;
import java.util.List;

import com.dcits.blacklist.facade.eo.RcListNotCheckRangeEO;

/*实体表【名单不检查范围表(RC_LIST_NOT_CHECK_RANGE)】数据服务接口*/
public interface IRcListNotCheckRangeBcc {
    /** count数据库表记录根据入参com.dcits.blacklist.facade.eo.RcListNotCheckRangeEO中的属性字段组合 **/
    long countByEo(RcListNotCheckRangeEO eo);

    /** remove数据库表记录根据入参com.dcits.blacklist.facade.eo.RcListNotCheckRangeEO中的属性字段组合 **/
    int removeByEo(RcListNotCheckRangeEO eo);

    /** remove 根据主键: 序号 **/
    int removeByPrimaryKey(String seqNo);

    int create(RcListNotCheckRangeEO eo);

    /** create数据库表记录，主键和EO对象中不允许为空的字段必填，其它可为空字段可选填，执行时根据com.dcits.blacklist.facade.eo.RcListNotCheckRangeEO中不为空的属性写入数据库**/
    int createSelective(RcListNotCheckRangeEO eo);

    /** find数据库表记录根据入参com.dcits.blacklist.facade.eo.RcListNotCheckRangeEO中的属性字段组合 **/
    List<RcListNotCheckRangeEO> findByEo(RcListNotCheckRangeEO eo);

    /** find 根据主键: 序号 **/
    RcListNotCheckRangeEO findByPrimaryKey(String seqNo);

    /**  根据主键: 序号执行更新记录操作，仅更新入参com.dcits.blacklist.facade.eo.RcListNotCheckRangeEO中不为空的属性字段 **/
    int modifyByPrimaryKeySelective(RcListNotCheckRangeEO eo);

    /** modify 根据主键: 序号 **/
    int modifyByPrimaryKey(RcListNotCheckRangeEO eo);
}