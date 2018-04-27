package com.haibo.service;

import com.haibo.mapper.ScoreMapper;
import com.haibo.pojo.Score;
import com.haibo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/4/25/025
 */
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public String queryChengji(String s_useridcard) {
      String score=scoreMapper.queryChengji(s_useridcard);
        return score;
    }
}