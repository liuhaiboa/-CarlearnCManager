package com.haibo.dao;

import com.haibo.daomodel.Choosecoach;
import com.haibo.daomodel.ChoosecoachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChoosecoachMapper {
    int countByExample(ChoosecoachExample example);

    int deleteByExample(ChoosecoachExample example);

    int deleteByPrimaryKey(Long nId);

    int insert(Choosecoach record);

    int insertSelective(Choosecoach record);

    List<Choosecoach> selectByExample(ChoosecoachExample example);

    Choosecoach selectByPrimaryKey(Long nId);

    int updateByExampleSelective(@Param("record") Choosecoach record, @Param("example") ChoosecoachExample example);

    int updateByExample(@Param("record") Choosecoach record, @Param("example") ChoosecoachExample example);

    int updateByPrimaryKeySelective(Choosecoach record);

    int updateByPrimaryKey(Choosecoach record);
}