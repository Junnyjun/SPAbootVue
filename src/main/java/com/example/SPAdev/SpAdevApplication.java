package com.example.SPAdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpAdevApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpAdevApplication.class, args);
	}
}
