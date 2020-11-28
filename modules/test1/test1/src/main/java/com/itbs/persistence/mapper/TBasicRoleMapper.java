package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.TBasicRole;
import com.itbs.persistence.entity.TBasicRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBasicRoleMapper {
    long countByExample(TBasicRoleExample example);

    int deleteByExample(TBasicRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBasicRole record);

    int insertSelective(TBasicRole record);

    List<TBasicRole> selectByExample(TBasicRoleExample example);

    TBasicRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBasicRole record, @Param("example") TBasicRoleExample example);

    int updateByExample(@Param("record") TBasicRole record, @Param("example") TBasicRoleExample example);

    int updateByPrimaryKeySelective(TBasicRole record);

    int updateByPrimaryKey(TBasicRole record);
}