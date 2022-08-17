package com.zhang.imall.model.dao;

import com.zhang.imall.model.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//在mapper接口上使用@Respository注解，这样idea就认为Mapper接口是个资源，在service impl注入资源时就不会报错
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //通过用户名查询数据，不允许出现重复的用户名
    User selectByUsername(String username);

    //登录用户名和密码的验证,两个参数，需要使用@Param（）指定
    User loginCheck(@Param("username") String username, @Param("password") String md5Password);
}