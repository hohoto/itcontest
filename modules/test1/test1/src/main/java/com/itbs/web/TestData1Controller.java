package com.itbs.web;

import com.itbs.entity.TestData;
import com.itbs.service.TestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test1/testData")
public class TestData1Controller{

	@Autowired
	private TestDataService testDataService;

	@GetMapping("getById")
	public TestData getById(String id){
		TestData testData = testDataService.getById(id);
		return testData;
	}

}