package com.book.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories (basePackages = "com.book.demo.repository")
@ComponentScan(basePackages = {"com.book.demo.controller" , "com.book.demo.service", "com.book.demo.errors", "com.book.demo.repository", "com.book.demo.dto", "com.book.demo.entity"})
public class ReginaBookBarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReginaBookBarApplication.class, args);
	}

}
