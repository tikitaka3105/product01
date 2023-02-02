package com.product01.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product01.demo.entity.MeasurementItem;
import com.product01.demo.repository.MeasurementItemCrudRepository;

import jakarta.transaction.Transactional;

@Service
public class MeasurementItemService {
	
	@Autowired
	private MeasurementItemCrudRepository repository;
	
	public List<MeasurementItem> findByUserId(Integer userId){
		return repository.findByUserId(userId);
	}
	
	@Transactional
	public MeasurementItem saveMeasurementItem(MeasurementItem item) {
		MeasurementItem measurementItem = repository.save(item);
		return measurementItem;
	}
}
