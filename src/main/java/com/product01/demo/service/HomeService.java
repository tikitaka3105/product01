package com.product01.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product01.demo.entity.User;
import com.product01.demo.repository.UserCrudRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class HomeService {
	
	@Autowired
	private UserCrudRepository repository;
	
	public User findUserById(int id) {
		Optional<User> userOpt = repository.findById(id);
		if(userOpt.isPresent()) {
			return userOpt.get();
		}else {
			return null;
		}
	}
}
