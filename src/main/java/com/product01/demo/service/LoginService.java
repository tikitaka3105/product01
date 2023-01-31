package com.product01.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product01.demo.entity.User;
import com.product01.demo.repository.UserCrudRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserCrudRepository repository;
	
	public User findByUsername(String username) {
		User user = repository.findByUsername(username);
		return user;
	}
}
