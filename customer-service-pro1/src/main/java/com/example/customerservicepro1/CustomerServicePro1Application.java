package com.example.customerservicepro1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class CustomerServicePro1Application {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServicePro1Application.class, args);

	}

}
