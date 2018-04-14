package com.haibo.dao;

import com.haibo.daomodel.Userunionrole;
import com.haibo.daomodel.UserunionroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserunionroleMapper {
    int countByExample(UserunionroleExample example);

    int deleteByExample(UserunionroleExample example);

    int deleteByPrimaryKey(Long nId);

    int insert(Userunionrole record);

    int insertSelective(Userunionrole record);

    List<Userunionrole> selectByExample(UserunionroleExample example);

    Userunionrole selectByPrimaryKey(Long nId);

    int updateByExampleSelective(@Param("record") Userunionrole record, @Param("example") UserunionroleExample example);

    int updateByExample(@Param("record") Userunionrole record, @Param("example") UserunionroleExample example);

    int updateByPrimaryKeySelective(Userunionrole record);

    int updateByPrimaryKey(Userunionrole record);
}