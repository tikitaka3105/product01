package com.product01.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product01.demo.entity.MeasurementItem;
import com.product01.demo.entity.User;
import com.product01.demo.repository.MeasurementItemCrudRepository;
import com.product01.demo.repository.UserCrudRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class HomeService {
	
	@Autowired
	private UserCrudRepository userRepository;
	
	@Autowired
	private MeasurementItemCrudRepository miRepository;
	
	public User findById(int id) {
		Optional<User> userOpt = userRepository.findById(id);
		if(userOpt.isPresent()) {
			return userOpt.get();
		}else {
			return null;
		}
	}
	
	public List<MeasurementItem> findByUserId(Integer userId){
		return miRepository.findByUserId(userId);
	}
}
