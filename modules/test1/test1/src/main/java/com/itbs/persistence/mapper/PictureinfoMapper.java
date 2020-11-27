package com.itbs.persistence.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.annotation.MapperScan;

import com.itbs.persistence.entity.Pictureinfo;

@MapperScan
public interface PictureinfoMapper {
	List<Pictureinfo> findPictureinfos(Pictureinfo param);
	List<Pictureinfo> findPictureinfos(Pictureinfo param,RowBounds rowBounds);
	Pictureinfo loadPictureinfo(Pictureinfo entity);
	Pictureinfo getPictureinfoByKey( @Param("pictureid") Integer pictureid);	
	int countPictureinfos(Pictureinfo param);
	int updatePictureinfo(Pictureinfo parameters);
	int insertPictureinfoModel(Pictureinfo entity);
	int insertPictureinfoMap(HashMap<String,Object> paramMap);
	int insertPictureinfoBatch(List<Pictureinfo> entitys);
	int deletePictureinfo(Pictureinfo entity);
	int deletePictureinfoByKey( @Param("pictureid") Integer pictureid);
}
