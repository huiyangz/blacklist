package com.dcits.blacklist.facade.eo;

import com.dcits.blacklist.enums.ListCategory;
import jakarta.validation.constraints.NotNull;

public class RcListTypeEO {
    /** 黑名单检查规则编号 */
    private String ruleId;
    /** 名单种类 */
    private ListCategory listCategory;
    /** 名单类型描述 */
    @NotNull
    private String listTypeDesc;
    /** 创建时间戳 */
    @NotNull
    private String createTimestamp;
    /** 最后修改时间戳 */
    @NotNull
    private String lastUpdTimestamp;
    /** 名单类型代码 */
    @NotNull
    private String listType;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public ListCategory getListCategory() {
        return listCategory;
    }

    public void setListCategory(ListCategory listCategory) {
        this.listCategory = listCategory;
    }

    public String getListTypeDesc() {
        return listTypeDesc;
    }

    public void setListTypeDesc(String listTypeDesc) {
        this.listTypeDesc = listTypeDesc;
    }

    public String getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getLastUpdTimestamp() {
        return lastUpdTimestamp;
    }

    public void setLastUpdTimestamp(String lastUpdTimestamp) {
        this.lastUpdTimestamp = lastUpdTimestamp;
    }

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }
}