package com.gr.geias.enums;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
public enum EnableStatusEnums {
    TEACHER(0, "老师"), PREXY(1, "院长"),
    schoolmaster(2, "管理员");
    private int state;
    private String stateInfo;

    EnableStatusEnums(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public static EnableStatusEnums getEnableStatusEnums(int state) {
        for (EnableStatusEnums productSateEnum : values()) {
            if (productSateEnum.getState() == state) {
                return productSateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
