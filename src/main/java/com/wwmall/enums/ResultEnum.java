package com.wwmall.enums;

/**
 * @Auther wangwei
 * @Date 2018/5/14 上午11:15
 */
public enum  ResultEnum {
    SUCCESS(0, "成功"),
    ERROR(1, "ERROR"),
    PARAM_ERROR(11, "参数错误"),
    NEED_LOGIN(10, "需要登录")
    ;

    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
