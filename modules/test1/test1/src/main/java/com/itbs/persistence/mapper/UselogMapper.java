package com.itbs.persistence.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.annotation.MapperScan;

import com.itbs.persistence.entity.Uselog;

@MapperScan
public interface UselogMapper {
	List<Uselog> findUselogs(Uselog param);
	List<Uselog> findUselogs(Uselog param,RowBounds rowBounds);
	Uselog loadUselog(Uselog entity);
	Uselog getUselogByKey( @Param("id") Integer id);	
	int countUselogs(Uselog param);
	int updateUselog(Uselog parameters);
	int insertUselogModel(Uselog entity);
	int insertUselogMap(HashMap<String,Object> paramMap);
	int insertUselogBatch(List<Uselog> entitys);
	int deleteUselog(Uselog entity);
	int deleteUselogByKey( @Param("id") Integer id);
}
