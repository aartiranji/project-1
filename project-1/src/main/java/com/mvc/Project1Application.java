package com.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.mvc.controller.LoginController;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaAuditing

public class Project1Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	public static void main(String[] args) {
		LOGGER.info("inside main method");
		SpringApplication.run(Project1Application.class, args);
	}

}
