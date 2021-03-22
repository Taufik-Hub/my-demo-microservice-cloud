package com.taufik.microservice.user.main.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taufik.microservice.user.main.entity.User;
import com.taufik.microservice.user.main.service.IUserService;
import com.taufik.microservice.user.main.vo.UserDetailsVO;

@RestController
@RequestMapping(value = "/users")
@CrossOrigin("*")
public class UserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;
	
	
	@PostMapping(value = "/")
	public User saveUser(@RequestBody User user) {
		LOGGER.info("UserController saveUser user : {} ",user);
		return userService.saveUser(user);
	}
	
	@GetMapping(value = "/{id}")
	public UserDetailsVO getUserByUserId(@PathVariable ("id") Long userId) {
		LOGGER.info("UserController getUserByUserId userId : {} ",userId);
		return userService.getUserByUserId(userId);
	}
	
	@GetMapping(value = "/")
	public List<UserDetailsVO> getAllUsers() {
		LOGGER.info("UserController getAllUsers");
		return userService.getAllUsers();
	}
	
	@GetMapping(value = "**")
	public String fallBackMethod() {
		return "User-service is up and running";
	}

}
