package com.itbs.persistence.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.annotation.MapperScan;

import com.itbs.persistence.entity.Resourcemsg;

@MapperScan
public interface ResourcemsgMapper {
	List<Resourcemsg> findResourcemsgs(Resourcemsg param);
	List<Resourcemsg> findResourcemsgs(Resourcemsg param,RowBounds rowBounds);
	Resourcemsg loadResourcemsg(Resourcemsg entity);
	Resourcemsg getResourcemsgByKey( @Param("resourceid") Integer resourceid);	
	int countResourcemsgs(Resourcemsg param);
	int updateResourcemsg(Resourcemsg parameters);
	int insertResourcemsgModel(Resourcemsg entity);
	int insertResourcemsgMap(HashMap<String,Object> paramMap);
	int insertResourcemsgBatch(List<Resourcemsg> entitys);
	int deleteResourcemsg(Resourcemsg entity);
	int deleteResourcemsgByKey( @Param("resourceid") Integer resourceid);
}
