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
public class Userinfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/**
	*
	*/
	@JsonProperty("ID")
	private Integer id;
	
	
	/**
	*
	*/
	@JsonProperty("USERNAME")
	private String username;
	
	
	/**
	*
	*/
	@JsonProperty("PASSWORD")
	private String password;
	
	
	/**
	*
	*/
	@JsonProperty("USERSTATUS")
	private Integer userstatus;
	
	
	/**
	*
	*/
	@JsonProperty("COMPANYNAME")
	private String companyname;
	
	
	/**
	*
	*/
	@JsonProperty("DEPARTMENT")
	private String department;
	
	
	/**
	*
	*/
	@JsonProperty("JOBTITLE")
	private String jobtitle;
	
	
	/**
	*
	*/
	@JsonProperty("TELPHONE")
	private String telphone;
	
	
	/**
	*
	*/
	@JsonProperty("REALNAME")
	private String realname;
	
	}