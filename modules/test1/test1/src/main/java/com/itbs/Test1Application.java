package com.itbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@MapperScan("com.itbs.persistence.mapper")
@SpringCloudApplication
@EnableFeignClients(basePackages={"com.itbs"})
public class Test1Application {
	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

}