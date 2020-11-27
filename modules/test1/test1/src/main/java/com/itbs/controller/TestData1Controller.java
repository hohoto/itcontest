package com.itbs.controller;


import com.itbs.persistence.entity.Userinfo;
import com.itbs.persistence.mapper.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("test1/testData")
public class TestData1Controller{

	@Autowired
	private UserinfoMapper UserinfoMapper;

	@GetMapping("login")
	public Map login(String username, String password){
		int result = 0;
		Map map = new HashMap();

		Userinfo userinfo = new Userinfo();
		userinfo.setUsername(username);

		List<Userinfo> userinfoList = UserinfoMapper.findUserinfos(userinfo);
		userinfo = userinfoList.get(0);
		if(password.equals(userinfo.getPassword())){
			result = 1;
			map.put("result",result);
			map.put("userinfo",userinfo);
		}
		return map;
	}


}