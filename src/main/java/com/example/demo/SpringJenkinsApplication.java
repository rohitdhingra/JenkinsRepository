package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	public static void main(String[] args) {
		logger.info("Application Started");
		SpringApplication.run(SpringJenkinsApplication.class, args);
		logger.info("Application Completed!!!!");
	}

}
