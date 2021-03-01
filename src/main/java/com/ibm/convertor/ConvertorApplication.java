package com.ibm.convertor;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConvertorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertorApplication.class, args);
	}

}
