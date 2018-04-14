package com.haibo.controller;

import com.haibo.pojo.User;
import com.haibo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/4/12/012
 */
@Controller
@RequestMapping(value = "/user",method = {RequestMethod.POST})

public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login")
    public String  login(HttpSession session,Model model,
                      HttpServletResponse response, HttpServletRequest request,
                      String s_name, String s_password,
                         User user){

       user=userService.checkLogin(user.getS_name(),user.getS_password());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            return "main";
        }
        return "index";
    }
//        if(user!=null){
//            //登录成功，将user对象设置到HttpSession作用范围域中
//            session.setAttribute("s_name",sName);
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/user/login");
//
//
//        }else {
//            //登录失败，并调转到登录页面
//
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/user/login");
//
//
//        }







}
