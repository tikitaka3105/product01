package com.product01.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product01.demo.entity.User;
import com.product01.demo.repository.UserCrudRepository;

import jakarta.transaction.Transactional;

@Service
public class SaveUserService {
	
	@Autowired
	private UserCrudRepository repository;
	
	@Transactional
	public User save(User user) {
		User savedUser = repository.save(user);
		return savedUser;
	}

}
