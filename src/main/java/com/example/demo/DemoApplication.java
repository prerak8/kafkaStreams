package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import repo.Userrepo;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.demo","config","consumer","model","resource","repo","streamprocessor"})
@EnableMongoRepositories(basePackages = {"repo","model"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
