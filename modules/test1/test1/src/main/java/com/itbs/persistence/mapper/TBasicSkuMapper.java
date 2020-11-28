package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.TBasicSku;
import com.itbs.persistence.entity.TBasicSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBasicSkuMapper {
    long countByExample(TBasicSkuExample example);

    int deleteByExample(TBasicSkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBasicSku record);

    int insertSelective(TBasicSku record);

    List<TBasicSku> selectByExample(TBasicSkuExample example);

    TBasicSku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBasicSku record, @Param("example") TBasicSkuExample example);

    int updateByExample(@Param("record") TBasicSku record, @Param("example") TBasicSkuExample example);

    int updateByPrimaryKeySelective(TBasicSku record);

    int updateByPrimaryKey(TBasicSku record);
}