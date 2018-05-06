package com.haibo.service;

import com.haibo.mapper.ExamMapper;
import com.haibo.pojo.Coach;
import com.haibo.pojo.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/6/006
 */
@Service("examService")
public class ExamServiceImpl implements  ExamService {
    @Autowired
    private ExamMapper examMapper;
    @Override
    public Exam addExam(Exam exam) {
       examMapper.addExam(exam);
        return exam;
    }
}