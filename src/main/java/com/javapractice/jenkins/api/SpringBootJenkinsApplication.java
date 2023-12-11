package com.javapractice.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started.....");
	}

	public static void main(String[] args) {
		logger.info("Application Executed....");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
