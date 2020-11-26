package com.itbs.controller;

import com.itbs.client.TestDataServiceClient;
import com.itbs.entity.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("test2/testData")
public class Test2DataController {

    @Autowired(required = false)
    private TestDataServiceClient testDataServiceClient;

    @RequestMapping("getTestDataFromTest1")
    public TestData getTestDataFromTest1(String id){
        final TestData testData = testDataServiceClient.getById(id);
        return testData;
    }

}
