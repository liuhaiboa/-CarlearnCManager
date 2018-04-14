package com.haibo.service;

import com.haibo.pojo.User;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/4/12/012
 */
public interface UserService {

    //用户登录
    public User checkLogin(String s_name, String s_password );

    //用户注册
    public User addUser(User user);


}
