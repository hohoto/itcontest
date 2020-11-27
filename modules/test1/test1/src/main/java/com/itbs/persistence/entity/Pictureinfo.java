package com.itbs.persistence.entity;

import java.util.HashMap;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@ToString
public class Pictureinfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/**
	*
	*/
	@JsonProperty("PICTUREID")
	private Integer pictureid;
	
	
	/**
	*
	*/
	@JsonProperty("RESOURCEID")
	private Integer resourceid;
	
	
	/**
	*
	*/
	@JsonProperty("PICTURESTATUS")
	private Integer picturestatus;
	
	
	/**
	*
	*/
	@JsonProperty("PICTUREURL")
	private String pictureurl;
	
	
	/**
	*
	*/
	@JsonProperty("CREATETIME")
	private java.util.Date createtime;
	
	
	/**
	*
	*/
	@JsonProperty("MODIFYTIME")
	private java.util.Date modifytime;
	
	
	/**
	*
	*/
	@JsonProperty("CREATEPERSON")
	private String createperson;
	
	
	/**
	*
	*/
	@JsonProperty("MODIFYPERSON")
	private String modifyperson;
	
	}