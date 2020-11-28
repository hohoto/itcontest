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
public class Uselog implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/**
	*
	*/
	@JsonProperty("ID")
	private Integer id;
	
	
	/**
	*
	*/
	@JsonProperty("RESOURCEID")
	private String resourceid;
	
	
	/**
	*
	*/
	@JsonProperty("USEDATE")
	private java.util.Date usedate;
	
	
	/**
	*
	*/
	@JsonProperty("STATUSCHANGE")
	private String statuschange;
	
	
	/**
	*
	*/
	@JsonProperty("CHANGEMSG")
	private String changemsg;
	
	}