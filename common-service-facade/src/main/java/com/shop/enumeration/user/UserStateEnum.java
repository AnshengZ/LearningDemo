package com.shop.enumeration.user;


import com.shop.enumeration.BaseEnum;

/**
 * @author
 * @date 2017/11/1 下午7:52
 * @description 用户状态的枚举类
 */
public enum UserStateEnum implements BaseEnum {
    ON(1, "启用"),
    OFF(0, "禁用");

    private int code;
    private String msg;

    UserStateEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "UserStateEnum{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
