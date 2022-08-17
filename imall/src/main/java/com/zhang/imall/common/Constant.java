package com.zhang.imall.common;

/**
 * constant进行常量的放置
 */
public class Constant {
    //md5加密的盐值,尽量麻烦一点，或者直接将盐值随机生成存放到数据库
    public static final String SALT = "789asd!@#";
    //存放登陆后的用户名,使用session存储
    public static final String IMALL_USER = "IMALL_USER";
}
