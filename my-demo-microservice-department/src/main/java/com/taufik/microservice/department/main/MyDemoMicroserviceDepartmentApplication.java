package com.taufik.microservice.department.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyDemoMicroserviceDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoMicroserviceDepartmentApplication.class, args);
	}

}
