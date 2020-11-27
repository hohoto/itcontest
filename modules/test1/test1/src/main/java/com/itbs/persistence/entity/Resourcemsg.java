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
public class Resourcemsg implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/**
	*
	*/
	@JsonProperty("RESOURCEID")
	private Integer resourceid;
	
	
	/**
	*
	*/
	@JsonProperty("RESOURCETYPE")
	private String resourcetype;
	
	
	/**
	*
	*/
	@JsonProperty("RESOURCENAME")
	private String resourcename;
	
	
	/**
	*
	*/
	@JsonProperty("RESOURCEPRICE")
	private java.math.BigDecimal resourceprice;
	
	
	/**
	*
	*/
	@JsonProperty("RESOURCEBUYDATE")
	private java.util.Date resourcebuydate;
	
	
	/**
	*
	*/
	@JsonProperty("RESOURCEUSEYEAR")
	private String resourceuseyear;
	
	
	/**
	*
	*/
	@JsonProperty("RESOURCESTATUS")
	private String resourcestatus;
	
	
	/**
	*
	*/
	@JsonProperty("RESOURCEINFOS")
	private String resourceinfos;
	
	
	/**
	*
	*/
	@JsonProperty("DUTYPERSON")
	private String dutyperson;
	
	}