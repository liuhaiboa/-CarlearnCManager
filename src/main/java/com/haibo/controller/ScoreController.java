package com.haibo.controller;

import com.haibo.pojo.Score;
import com.haibo.pojo.User;
import com.haibo.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/4/25/025
 */
@Controller
@RequestMapping(value = "/score",method = {RequestMethod.POST})
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    //用户成绩查询
    @RequestMapping(value = "/querychengji")
    public String queryChengji(Model model, Score score,
                               String s_useridcard, String s_score,
                               HttpServletRequest request) throws Exception{
//       s_score=(scoreService.queryChengji(s_useridcard)).getsScore();

        s_score=scoreService.queryChengji(s_useridcard);

     // request.setAttribute("score",s_useridcard);

       model.addAttribute("score1",s_useridcard);
       // model.addAttribute("score",s_score);
        model.addAttribute("score",s_score);
        return "chengji";

    }
}