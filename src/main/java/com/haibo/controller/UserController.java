package com.haibo.controller;

import com.haibo.pojo.User;
import com.haibo.service.UserService;

import org.apache.commons.fileupload.FileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;

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






//注册用户
    @RequestMapping(value = "/adduser")
    public String  addUser( Model model, User user) throws Exception{

        //获取流数据，方便存储
        //FileItem fi=pic.getFileItem();
        //pic.getOriginalFilename()获取文件名
        //上传文件到服务器路径中
//        File fi=new File(request.getRealPath("/")+"/file/"+pic.getOriginalFilename());
//        fi.write();
//        String path = request.getSession().getServletContext().getRealPath("upload");
//        String fileName = pic.getOriginalFilename();
//        File dir = new File(path,fileName);
//        if(!dir.exists()){
//            dir.mkdirs();
//        }
//        //MultipartFile自带的解析方法
//        pic.transferTo(dir);

    user=userService.addUser(user);
       model.addAttribute("user",user);
        return "menu";
    }

    //用户登录
    @RequestMapping(value = "/login")
    public String  login(HttpSession session,Model model,
                      HttpServletResponse response, HttpServletRequest request,
                      String s_name, String s_password,Long n_id,
                         User user){

       user=userService.checkLogin(user.getS_name(),user.getS_password());
        //若有user则添加到model里并且跳转到成功页  2面
        if(user != null){
            if((user.getS_password().equals("admain"))&&(user.getS_name().equals("admain"))){
                model.addAttribute("user",user);
                return "menuadmain";
            }else{
            model.addAttribute("user",user);

                session.setAttribute("user",user);

                Object object=session.getAttribute("user");
                Long currentUserId= user.getN_id();

                session.setAttribute("currentUserId",currentUserId);

                return "menu";
            }

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
