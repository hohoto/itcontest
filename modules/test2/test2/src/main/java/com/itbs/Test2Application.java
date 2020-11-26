package com.itbs;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients(basePackages={"com.itbs"})
public class Test2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Test2Application.class, args);
	}
	
}