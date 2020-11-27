package com.itbs.persistence.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.annotation.MapperScan;

import com.itbs.persistence.entity.Userinfo;

@MapperScan
public interface UserinfoMapper {
	List<Userinfo> findUserinfos(Userinfo param);
	List<Userinfo> findUserinfos(Userinfo param,RowBounds rowBounds);
	Userinfo loadUserinfo(Userinfo entity);
	Userinfo getUserinfoByKey( @Param("id") Integer id);	
	int countUserinfos(Userinfo param);
	int updateUserinfo(Userinfo parameters);
	int insertUserinfoModel(Userinfo entity);
	int insertUserinfoMap(HashMap<String,Object> paramMap);
	int insertUserinfoBatch(List<Userinfo> entitys);
	int deleteUserinfo(Userinfo entity);
	int deleteUserinfoByKey( @Param("id") Integer id);
}
