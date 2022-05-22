package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.config")
public class SpringStompApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStompApplication.class, args);
	}

}
