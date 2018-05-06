package com.haibo.mapper;

import com.haibo.pojo.Coach;
import com.haibo.pojo.Exam;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/6/006
 */
public interface ExamMapper {
    //添加考试信息
    public void addExam(Exam exam);
}
