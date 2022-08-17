package com.zhang.imall.service;

import com.zhang.imall.exception.ImallException;
import com.zhang.imall.model.pojo.User;


/**
 * service的接口层,在接口实现层 加上@Service（接口名称）
 */

public interface UserService {
    /**
     * 测试用户的方法接口
     *
     * @return User实体类
     */
    public User getUser();

    /**
     * 用户注册的用户名，密码
     */
    public void register(String username, String password) throws ImallException;

    /**
     * 用户的登录、校验、和session的保存
     */
    public User login(String username, String password) throws ImallException;

    /***
     * 更新用户的签名信息,
     * 参数：当前登录的用户信息
     */
    public void updateInformation(User user) throws ImallException;

    /**
     * 管理员登录验证
     */
    public boolean checkAdminRole(User user);

}
