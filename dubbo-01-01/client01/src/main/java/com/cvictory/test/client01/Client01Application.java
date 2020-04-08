package com.cvictory.test.client01;

import com.cvictory.test01.HelloService;
import org.springframework.boot.SpringApplication;

import javax.annotation.PostConstruct;
import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Client01Application {

	@Reference(version = "1.0.0")
  	private HelloService demoService;

	public static void main(String[] args) {

		SpringApplication.run(Client01Application.class, args);
	}

    @PostConstruct
    public void init() {
    	String sayHello = demoService.sayHello("world");
    	System.err.println(sayHello);
    }
}
