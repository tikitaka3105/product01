package com.product01.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product01.demo.entity.User;
import com.product01.demo.repository.UserCrudRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	@Autowired
	private UserCrudRepository repository;
	
	public User findById(int id) {
		Optional<User> userOpt = repository.findById(id);
		if(userOpt.isPresent()) {
			return userOpt.get();
		}else {
			return null;
		}
	}
	
	public User findByUsername(String username) {
		User user = repository.findByUsername(username);
		return user;
	}
	
	@Transactional
	public User save(User user) {
		User savedUser = repository.save(user);
		return savedUser;
	}
}
