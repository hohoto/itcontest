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
public class Resourcemanage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/**
	*序号
	*/
	@JsonProperty("ID")
	private Integer id;
	
	
	/**
	*资产编号
	*/
	@JsonProperty("RESOURCEID")
	private String resourceid;
	
	
	/**
	*资产名称
	*/
	@JsonProperty("RESOURCENAME")
	private String resourcename;
	
	
	/**
	*入账时间
	*/
	@JsonProperty("INACCOUNTDATE")
	private java.util.Date inaccountdate;
	
	
	/**
	*账面原值
	*/
	@JsonProperty("ORIVALUE")
	private java.math.BigDecimal orivalue;
	
	
	/**
	*净值
	*/
	@JsonProperty("NETVALUE")
	private java.math.BigDecimal netvalue;
	
	
	/**
	*计提折旧标记
	*/
	@JsonProperty("ACCRUALOFDEPRECIATION")
	private String accrualofdepreciation;
	
	
	/**
	*剩余年限
	*/
	@JsonProperty("LIMITYEAR")
	private Integer limityear;
	
	
	/**
	*保管人
	*/
	@JsonProperty("KEEPER")
	private String keeper;
	
	
	/**
	*保管人姓名
	*/
	@JsonProperty("KEEPERNAME")
	private String keepername;
	
	
	/**
	*责任中心
	*/
	@JsonProperty("RESPONSIBILITYCENTER")
	private String responsibilitycenter;
	
	
	/**
	*规格型号
	*/
	@JsonProperty("SPEC")
	private String spec;
	
	
	/**
	*存放地点
	*/
	@JsonProperty("LSTOREOCATION")
	private String lstoreocation;
	
	
	/**
	*盘点情况
	*/
	@JsonProperty("INVENTORYSITUATION")
	private String inventorysituation;
	
	
	/**
	*
	*/
	@JsonProperty("OTHERINFO")
	private String otherinfo;
	
	
	/**
	*资源状态标识
	*/
	@JsonProperty("RESOURCESTATUS")
	private String resourcestatus;
	
	
	/**
	*资源类型
	*/
	@JsonProperty("RESOURCETYPE")
	private String resourcetype;
	
	}