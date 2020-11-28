package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.TBasicSpu;
import com.itbs.persistence.entity.TBasicSpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBasicSpuMapper {
    long countByExample(TBasicSpuExample example);

    int deleteByExample(TBasicSpuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBasicSpu record);

    int insertSelective(TBasicSpu record);

    List<TBasicSpu> selectByExample(TBasicSpuExample example);

    TBasicSpu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBasicSpu record, @Param("example") TBasicSpuExample example);

    int updateByExample(@Param("record") TBasicSpu record, @Param("example") TBasicSpuExample example);

    int updateByPrimaryKeySelective(TBasicSpu record);

    int updateByPrimaryKey(TBasicSpu record);
}