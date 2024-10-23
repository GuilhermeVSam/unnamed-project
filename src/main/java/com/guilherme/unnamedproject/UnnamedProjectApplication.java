package com.guilherme.unnamedproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan(basePackages = "com.guilherme.unnamedproject")
@EntityScan(basePackages = "com.guilherme.unnamedproject.entity")
@EnableJpaRepositories(basePackages = "com.guilherme.unnamedproject.repository")
public class UnnamedProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnnamedProjectApplication.class, args);
	}

}
