package com.example.user_service.services;

import java.util.List;

import com.example.user_service.entity.User;


public interface UserService {

	List<User> getAllUser();
	User createUser(User user);
}
