package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.TBasicDepartment;
import com.itbs.persistence.entity.TBasicDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBasicDepartmentMapper {
    long countByExample(TBasicDepartmentExample example);

    int deleteByExample(TBasicDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBasicDepartment record);

    int insertSelective(TBasicDepartment record);

    List<TBasicDepartment> selectByExample(TBasicDepartmentExample example);

    TBasicDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBasicDepartment record, @Param("example") TBasicDepartmentExample example);

    int updateByExample(@Param("record") TBasicDepartment record, @Param("example") TBasicDepartmentExample example);

    int updateByPrimaryKeySelective(TBasicDepartment record);

    int updateByPrimaryKey(TBasicDepartment record);
}