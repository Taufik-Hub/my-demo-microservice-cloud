package com.taufik.microservice.registry.service.mydemomicroserviceserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MyDemoMicroserviceServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoMicroserviceServiceRegistryApplication.class, args);
	}

}
