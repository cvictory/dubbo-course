package com.cvictory.test.client01.springcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
public class SpringcloudclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudclientApplication.class, args);
	}

}
