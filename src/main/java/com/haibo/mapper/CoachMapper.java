package com.haibo.mapper;

import com.haibo.pojo.Coach;

import java.util.List;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/2/002
 */
public interface CoachMapper {
    //遍历教练
    public List<Coach> selectCoach(Coach coach);
}
