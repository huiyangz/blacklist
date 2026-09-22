package com.dcits.blacklist.enums;

/** 业务分类 */
public enum BusiCategory {
    /** 存款 */
    BB("BB"),
    /** 贷款 */
    CL("CL"),
    /** 总账 */
    GL("GL"),
    /** 货币市场 */
    MM("MM");

    private String value;

    private BusiCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static BusiCategory byValue(String value) {
        for (BusiCategory item : values()) {
            if (item.getValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}