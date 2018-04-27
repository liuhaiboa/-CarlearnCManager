package com.haibo.mapper;

import com.haibo.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/4/12/012
 */
public interface UserMapper {
    //用户登录
    public User loginByUser(
        @Param("s_name") String s_name, @Param("s_password") String s_password );

    //用户注册
    public void addUser(User user);


}
