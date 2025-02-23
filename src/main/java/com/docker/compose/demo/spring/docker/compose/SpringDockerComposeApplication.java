package com.docker.compose.demo.spring.docker.compose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.docker.compose.demo.*")
public class SpringDockerComposeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerComposeApplication.class, args);
	}

}
