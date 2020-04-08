package com.cvictory.test01.server01;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cvictory.test01.server01"})
public class Server01Application {


	public static void main(String[] args) {

		// start embedded zookeeper server
//		new EmbeddedZooKeeper(2181, false).start();


		SpringApplication.run(Server01Application.class, args);
	}

}
