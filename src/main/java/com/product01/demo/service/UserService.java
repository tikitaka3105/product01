package com.product01.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.product01.demo.entity.User;
import com.product01.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void userRegistration(String username, String password) {
		String hashedPassword = passwordEncoder.encode(password);
		repository.saveAndFlush(new User(username, hashedPassword));
	}
}
