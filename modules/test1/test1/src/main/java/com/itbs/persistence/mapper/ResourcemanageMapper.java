package com.itbs.persistence.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.annotation.MapperScan;

import com.itbs.persistence.entity.Resourcemanage;

@MapperScan
public interface ResourcemanageMapper {
	List<Resourcemanage> findResourcemanages(Resourcemanage param);
	List<Resourcemanage> findResourcemanages(Resourcemanage param,RowBounds rowBounds);
	Resourcemanage loadResourcemanage(Resourcemanage entity);
	Resourcemanage getResourcemanageByKey( @Param("id") Integer id);	
	int countResourcemanages(Resourcemanage param);
	int updateResourcemanage(Resourcemanage parameters);
	int insertResourcemanageModel(Resourcemanage entity);
	int insertResourcemanageMap(HashMap<String,Object> paramMap);
	int insertResourcemanageBatch(List<Resourcemanage> entitys);
	int deleteResourcemanage(Resourcemanage entity);
	int deleteResourcemanageByKey( @Param("id") Integer id);
}
