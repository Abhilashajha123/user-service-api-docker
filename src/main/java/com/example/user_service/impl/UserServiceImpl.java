package com.example.user_service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user_service.entity.User;
import com.example.user_service.repository.UserRepository;
import com.example.user_service.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();	
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

}
