package com.dcits.blacklist.facade.components;

import com.dcits.blacklist.enums.DealFlow;
import com.dcits.blacklist.enums.LimitRef;
import com.dcits.blacklist.enums.OthControlType;
import com.dcits.blacklist.enums.OthRestraintType;
import com.dcits.blacklist.enums.ResBranchRange;
import com.dcits.blacklist.enums.ResOperateFlag;
import com.dcits.blacklist.enums.TermType;
import java.util.List;

import com.dcits.blacklist.facade.eo.RcRuleTypeEO;

/*实体表【名单限制规则参数表(RC_RULE_TYPE)】数据服务接口*/
public interface IRcRuleTypeBcc {
    /** count数据库表记录根据入参com.dcits.blacklist.facade.eo.RcRuleTypeEO中的属性字段组合 **/
    long countByEo(RcRuleTypeEO eo);

    /** remove数据库表记录根据入参com.dcits.blacklist.facade.eo.RcRuleTypeEO中的属性字段组合 **/
    int removeByEo(RcRuleTypeEO eo);

    /** remove 根据主键: 黑名单检查规则编号 **/
    int removeByPrimaryKey(String ruleId);

    int create(RcRuleTypeEO eo);

    /** create数据库表记录，主键和EO对象中不允许为空的字段必填，其它可为空字段可选填，执行时根据com.dcits.blacklist.facade.eo.RcRuleTypeEO中不为空的属性写入数据库**/
    int createSelective(RcRuleTypeEO eo);

    /** find数据库表记录根据入参com.dcits.blacklist.facade.eo.RcRuleTypeEO中的属性字段组合 **/
    List<RcRuleTypeEO> findByEo(RcRuleTypeEO eo);

    /** find 根据主键: 黑名单检查规则编号 **/
    RcRuleTypeEO findByPrimaryKey(String ruleId);

    /**  根据主键: 黑名单检查规则编号执行更新记录操作，仅更新入参com.dcits.blacklist.facade.eo.RcRuleTypeEO中不为空的属性字段 **/
    int modifyByPrimaryKeySelective(RcRuleTypeEO eo);

    /** modify 根据主键: 黑名单检查规则编号 **/
    int modifyByPrimaryKey(RcRuleTypeEO eo);
}