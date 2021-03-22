package com.taufik.microservice.apigateway.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
	
	@GetMapping(value = "/userServiceFallback")
	public String userServiceFallbackMethod() {
		return "User-Service taking longer than expected time. Please try later.";
	}
	
	@GetMapping(value = "/departmentServiceFallback")
	public String departmentServiceFallbackMethod() {
		return "Department-Service taking longer than expected time. Please try later.";
	}

}
