package com.haibo.service;
import com.haibo.mapper.UserMapper;
import com.haibo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/4/12/012
 */
@Service("userService")
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkLogin(String s_name, String s_password) {
        User user= userMapper.loginByUser(s_name,s_password);
        if(user!=null&&user.getS_password().equals(s_password)){
            return user;
        }
        return null;
    }

    @Override
    public User addUser(User user) {
        userMapper.addUser(user);
        return user;
    }
}