package com.zhang.imall.exception;

/**
 * 错误的枚举类，使用","进行枚举类型的增加
 */
public enum ImallExceptionEnum {
    //业务错误10000-19999
    NEED_USER_NAME(10001, "用户名不能为空"),
    NEED_USER_PASSWORD(10002, "密码不能为空"),
    NEED_PASSWORD_LENGTH(10003, "密码不能少于8位"),
    NAME_EXISTED(10004, "不允许重名，注册失败"),
    INSERT_FAILED(10005, "插入失败，请重试"),
    NAME_NOT_EXISTED(10006, "用户名不存在，请检查输入或者重新注册"),
    USER_MESSAGE_ERROR(10007, "用户名密码不匹配，请检查后重新输入"),
    USER_NEED_LOGIN(10008, "用户未登录"),
    UPDATE_FAILED(10009, "用户名更新失败"),
    NEED_ADMIN_USER(10010, "您不是管理员账户"),

    //对外统一展示错误代码，不对外展示详细错误信息,
    SYSTEM_ERROR(20000,"系统内部异常");

    //异常码
    Integer code;
    //异常信息
    String msg;

    ImallExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
