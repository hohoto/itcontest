package com.itbs.client;

import com.itbs.entity.TestData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="itbs-cloud-module-test1", contextId="TestDataServiceClient")
public interface TestDataServiceClient{

    @RequestMapping("getById")
    TestData getById(@RequestParam("id") String id);
	
}
