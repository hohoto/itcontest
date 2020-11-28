package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.TCenterRole;
import com.itbs.persistence.entity.TCenterRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterRoleMapper {
    long countByExample(TCenterRoleExample example);

    int deleteByExample(TCenterRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterRole record);

    int insertSelective(TCenterRole record);

    List<TCenterRole> selectByExample(TCenterRoleExample example);

    TCenterRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCenterRole record, @Param("example") TCenterRoleExample example);

    int updateByExample(@Param("record") TCenterRole record, @Param("example") TCenterRoleExample example);

    int updateByPrimaryKeySelective(TCenterRole record);

    int updateByPrimaryKey(TCenterRole record);
}