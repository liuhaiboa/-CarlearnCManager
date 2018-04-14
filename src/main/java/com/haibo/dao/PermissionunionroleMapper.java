package com.haibo.dao;

import com.haibo.daomodel.Permissionunionrole;
import com.haibo.daomodel.PermissionunionroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionunionroleMapper {
    int countByExample(PermissionunionroleExample example);

    int deleteByExample(PermissionunionroleExample example);

    int deleteByPrimaryKey(Long nId);

    int insert(Permissionunionrole record);

    int insertSelective(Permissionunionrole record);

    List<Permissionunionrole> selectByExample(PermissionunionroleExample example);

    Permissionunionrole selectByPrimaryKey(Long nId);

    int updateByExampleSelective(@Param("record") Permissionunionrole record, @Param("example") PermissionunionroleExample example);

    int updateByExample(@Param("record") Permissionunionrole record, @Param("example") PermissionunionroleExample example);

    int updateByPrimaryKeySelective(Permissionunionrole record);

    int updateByPrimaryKey(Permissionunionrole record);
}