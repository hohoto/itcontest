package com.itbs.controller;


import com.alibaba.fastjson.JSONObject;
import com.itbs.persistence.entity.Resourcemanage;
import com.itbs.persistence.entity.Userinfo;
import com.itbs.persistence.mapper.UselogMapper;
import com.itbs.persistence.mapper.UserinfoMapper;
import com.itbs.persistence.mapper.ResourcemanageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("test1/testData")
public class TestData1Controller{

	@Autowired
	private UserinfoMapper UserinfoMapper;
	@Autowired
	private ResourcemanageMapper ResourcemanageMapper;
	@Autowired
	private UselogMapper UselogMapper;

	@GetMapping("login")
	public Map login(String username, String password){
		int result = 0;//登录成功标识
		Map map = new HashMap();
		Userinfo userinfo = new Userinfo();
		userinfo.setUsername(username);
		List<Userinfo> userinfoList = UserinfoMapper.findUserinfos(userinfo);
		userinfo = userinfoList.get(0);
		if(password.equals(userinfo.getPassword())){
			result = 1;
			map.put("result",result);
			map.put("userinfo",userinfo);//登录成功后返回人员信息
		}
		return map;
	}

	@GetMapping("apply")
	public Map apply(Date datenow,String name, String resourceid,String location,String recipientsmsg){
		Map map = new HashMap();
		Userinfo userinfo = new Userinfo();
		userinfo.setRealname(name);
		List<Userinfo> userinfoList = UserinfoMapper.findUserinfos(userinfo);
		userinfo = userinfoList.get(0);

		Resourcemanage resourcemanage = new Resourcemanage();
		resourcemanage.setResourceid(resourceid);
		List<Resourcemanage> resourcemanageList = ResourcemanageMapper.findResourcemanages(resourcemanage);
		resourcemanage = resourcemanageList.get(0);

		map.put("locationg",location);
		map.put("recipientsmsg",recipientsmsg);
		map.put("datenow",datenow);
		map.put("resourceid",resourcemanage.getResourceid());
		JSONObject json = new JSONObject(map);
		String status ="31";
		resourcemanage.setOtherinfo(json.toJSONString());
		resourcemanage.setResourcestatus(status);

		int result = ResourcemanageMapper.updateResourcemanage(resourcemanage);


		map.put("result",result);
		return map;
	}

	@GetMapping("change")
	public Map change(String name,String resourceid){
		Map map = new HashMap();
		Resourcemanage resourcemanage = new Resourcemanage();
		resourcemanage.setResourceid(resourceid);
		List<Resourcemanage> resourcemanageList = ResourcemanageMapper.findResourcemanages(resourcemanage);
		resourcemanage = resourcemanageList.get(0);
		String jsonstring = resourcemanage.getOtherinfo();
		JSONObject json = JSONObject.parseObject(jsonstring);
		Map<String, Object> mapjson = (Map<String, Object>)json;
		mapjson.put("modifyname",name);
		JSONObject changejson = new JSONObject(mapjson);
		resourcemanage.setOtherinfo(json.toJSONString());
		String status = "34";
		resourcemanage.setResourcestatus(status);
		int result = ResourcemanageMapper.updateResourcemanage(resourcemanage);
		return map;
	}


	@GetMapping("borrow")
	public Map borrow(String name,String resourceid){
		Map map = new HashMap();
		Resourcemanage resourcemanage = new Resourcemanage();
		resourcemanage.setResourceid(resourceid);
		List<Resourcemanage> resourcemanageList = ResourcemanageMapper.findResourcemanages(resourcemanage);
		resourcemanage = resourcemanageList.get(0);
		String jsonstring = resourcemanage.getOtherinfo();
		JSONObject json = JSONObject.parseObject(jsonstring);
		Map<String, Object> mapjson = (Map<String, Object>)json;
		mapjson.put("modifyname",name);
		JSONObject changejson = new JSONObject(mapjson);
		resourcemanage.setOtherinfo(json.toJSONString());
		String status = "32";
		resourcemanage.setResourcestatus(status);
		int result = ResourcemanageMapper.updateResourcemanage(resourcemanage);
		return map;
	}

	@GetMapping("JYreturn")
	public Map JYreturn(String name,String resourceid){
		Map map = new HashMap();
		Resourcemanage resourcemanage = new Resourcemanage();
		resourcemanage.setResourceid(resourceid);
		List<Resourcemanage> resourcemanageList = ResourcemanageMapper.findResourcemanages(resourcemanage);
		resourcemanage = resourcemanageList.get(0);
		String jsonstring = resourcemanage.getOtherinfo();
		JSONObject json = JSONObject.parseObject(jsonstring);
		Map<String, Object> mapjson = (Map<String, Object>)json;
		mapjson.put("modifyname",name);
		JSONObject changejson = new JSONObject(mapjson);
		resourcemanage.setOtherinfo(json.toJSONString());
		String status = "33";
		resourcemanage.setResourcestatus(status);
		int result = ResourcemanageMapper.updateResourcemanage(resourcemanage);
		return map;
	}

	@GetMapping("scrap")
	public Map scrap(String name,String resourceid,String status,String money,String reason){
		Map map = new HashMap();
		Resourcemanage resourcemanage = new Resourcemanage();
		resourcemanage.setResourceid(resourceid);
		List<Resourcemanage> resourcemanageList = ResourcemanageMapper.findResourcemanages(resourcemanage);
		resourcemanage = resourcemanageList.get(0);
		String jsonstring = resourcemanage.getOtherinfo();
		JSONObject json = JSONObject.parseObject(jsonstring);
		Map<String, Object> mapjson = (Map<String, Object>)json;
		mapjson.put("modifyname",name);
		JSONObject changejson = new JSONObject(mapjson);
		resourcemanage.setOtherinfo(json.toJSONString());
		resourcemanage.setResourcestatus(status);
		int result = ResourcemanageMapper.updateResourcemanage(resourcemanage);
		return map;
	}
}