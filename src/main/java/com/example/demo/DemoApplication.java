package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		logger.debug(">>>DemoApplication started");


	}

}
