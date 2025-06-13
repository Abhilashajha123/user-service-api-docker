package com.example.user_service.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

import com.example.user_service.entity.User;
import com.example.user_service.services.UserService;


@RestController
@RequestMapping("/api")
public class UserController {
 
	 private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		
		System.out.println(user);
		 logger.info("Received request to create user: {}", user);
	        User createdUser = userService.createUser(user);
	        //logger.info("User created successfully with ID: {}", createdUser.getId());
	        return createdUser;
	}
	

	
	@GetMapping("/user")
	public List<User> getUsers(){
		
		return userService.getAllUser();
	}
}
