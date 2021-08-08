package com.example.SPAdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpAdevApplication{

	public static final String APPLICATION_LOCATIONS = "spring.config.location="
			+ "classpath:application.yml,"
			+ "/app/config/springboot-webservice/real-application.yml";

	public static void main(String[] args) {
		SpringApplication.run(SpAdevApplication.class, args);
	}
}
