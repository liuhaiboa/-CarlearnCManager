package com.haibo.controller;

import com.haibo.pojo.Exam;
import com.haibo.pojo.User;
import com.haibo.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/6/006
 */

@Controller
@RequestMapping(value = "/exam")
public class ExamController {

@Autowired
private ExamService examService;
    @RequestMapping(value = "/addExam")
    public String  addExam(HttpSession session,Model model, User user,@RequestBody Exam exam) throws Exception {
      Object object= session.getAttribute("currentUserId");
        exam=examService.addExam(exam);
        model.addAttribute("exam",exam);
         model.addAttribute("exam",object);
        return "yuekaozhuce";
    }
}