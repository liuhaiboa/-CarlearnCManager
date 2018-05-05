package com.haibo.service;

import com.haibo.mapper.CoachMapper;
import com.haibo.pojo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/2/002
 */
@Service("coachService")
public class CoachServiceImpl implements CoachService {

    @Autowired
    private CoachMapper coachMapper;


    @Override
    public List<Coach> selectCoach(Coach coach) {
        List<Coach> c=coachMapper.selectCoach(coach);
        return c;
    }

    @Override
    public Coach chooseCoach(Coach coach) {

        coachMapper.selectCoach(coach);
        return coach;
    }
}