package com.ikaustubh.mispayrollsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MISPayrollSystemApplication { 

	private static final Logger logger = LoggerFactory.getLogger(MISPayrollSystemApplication.class);
			
	public static void main(String[] args) {
		logger.info("Application is starting...");
		SpringApplication.run(MISPayrollSystemApplication.class, args);
		logger.info("Application has been started successfully");
	}
}
