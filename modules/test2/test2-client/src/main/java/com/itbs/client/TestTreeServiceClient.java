package com.itbs.client;

import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(name="itbs-cloud-module-test2", path="TestTreeServiceClient")
public interface TestTreeServiceClient {
	
}
