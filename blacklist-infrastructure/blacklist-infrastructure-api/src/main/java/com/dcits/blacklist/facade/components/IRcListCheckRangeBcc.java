package com.dcits.blacklist.facade.components;

import com.dcits.blacklist.enums.SourceType;
import com.dcits.blacklist.enums.TranType;
import java.util.List;

import com.dcits.blacklist.facade.eo.RcListCheckRangeEO;

/*实体表【名单检查范围表(RC_LIST_CHECK_RANGE)】数据服务接口*/
public interface IRcListCheckRangeBcc {
    /** count数据库表记录根据入参com.dcits.blacklist.facade.eo.RcListCheckRangeEO中的属性字段组合 **/
    long countByEo(RcListCheckRangeEO eo);

    /** remove数据库表记录根据入参com.dcits.blacklist.facade.eo.RcListCheckRangeEO中的属性字段组合 **/
    int removeByEo(RcListCheckRangeEO eo);

    /** remove 根据主键: 序号 **/
    int removeByPrimaryKey(String seqNo);

    int create(RcListCheckRangeEO eo);

    /** create数据库表记录，主键和EO对象中不允许为空的字段必填，其它可为空字段可选填，执行时根据com.dcits.blacklist.facade.eo.RcListCheckRangeEO中不为空的属性写入数据库**/
    int createSelective(RcListCheckRangeEO eo);

    /** find数据库表记录根据入参com.dcits.blacklist.facade.eo.RcListCheckRangeEO中的属性字段组合 **/
    List<RcListCheckRangeEO> findByEo(RcListCheckRangeEO eo);

    /** find 根据主键: 序号 **/
    RcListCheckRangeEO findByPrimaryKey(String seqNo);

    /**  根据主键: 序号执行更新记录操作，仅更新入参com.dcits.blacklist.facade.eo.RcListCheckRangeEO中不为空的属性字段 **/
    int modifyByPrimaryKeySelective(RcListCheckRangeEO eo);

    /** modify 根据主键: 序号 **/
    int modifyByPrimaryKey(RcListCheckRangeEO eo);
}