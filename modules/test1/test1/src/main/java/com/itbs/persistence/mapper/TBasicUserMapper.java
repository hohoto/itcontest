package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.TBasicUser;
import com.itbs.persistence.entity.TBasicUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBasicUserMapper {
    long countByExample(TBasicUserExample example);

    int deleteByExample(TBasicUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBasicUser record);

    int insertSelective(TBasicUser record);

    List<TBasicUser> selectByExample(TBasicUserExample example);

    TBasicUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBasicUser record, @Param("example") TBasicUserExample example);

    int updateByExample(@Param("record") TBasicUser record, @Param("example") TBasicUserExample example);

    int updateByPrimaryKeySelective(TBasicUser record);

    int updateByPrimaryKey(TBasicUser record);
}