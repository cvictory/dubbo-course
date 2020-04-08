package com.cvictory.test01.service;

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;
import com.cvictory.test01.HelloService;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

	@Override
    public String sayHello(String name) {
        return "Hello, " + name + ", " + new Date();
    }

}
