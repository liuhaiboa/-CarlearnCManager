package com.haibo.mapper;

import com.haibo.pojo.Score;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/4/25/025
 */
public interface ScoreMapper {
    //用户成绩查询根据idcard查询
    public String queryChengji(
             @Param("s_useridcard") String s_useridcard);
//          @Param("s_score") String s_score);
}
