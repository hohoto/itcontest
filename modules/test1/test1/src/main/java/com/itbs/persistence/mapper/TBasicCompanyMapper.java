package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.TBasicCompany;
import com.itbs.persistence.entity.TBasicCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBasicCompanyMapper {
    long countByExample(TBasicCompanyExample example);

    int deleteByExample(TBasicCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBasicCompany record);

    int insertSelective(TBasicCompany record);

    List<TBasicCompany> selectByExample(TBasicCompanyExample example);

    TBasicCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBasicCompany record, @Param("example") TBasicCompanyExample example);

    int updateByExample(@Param("record") TBasicCompany record, @Param("example") TBasicCompanyExample example);

    int updateByPrimaryKeySelective(TBasicCompany record);

    int updateByPrimaryKey(TBasicCompany record);
}