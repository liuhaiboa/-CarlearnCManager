package com.haibo.controller;

import com.haibo.pojo.Coach;
import com.haibo.pojo.User;
import com.haibo.service.CoachService;
import com.haibo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.net.SocketPermission;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/2/002
 */
@Controller
@RequestMapping(value = "/coach")

public class CoachController {

    @Autowired
    private CoachService coachService;
    //遍历教练
    @RequestMapping(value = "/queryCoach")
    @ResponseBody
    public List<Coach>  addUser(Model model,  Coach coach) throws Exception{

        List<Coach> coach1=coachService.selectCoach(coach);
        model.addAttribute("coach",coach1);
        return coach1;
    }


    //选择教练
    @RequestMapping(value = "/chooseCoach")
    @ResponseBody
    public String  chooseCoach(HttpSession session,Model model, HttpServletRequest request, Coach coach) throws Exception{

       Coach coach1=coachService.chooseCoach(coach);
        model.addAttribute("coach",coach1);
         //查出当前用户的id
        Object object= session.getAttribute("currentUserId");

        return "zaixianyueche";
    }




}