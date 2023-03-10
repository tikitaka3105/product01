package com.product01.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product01.demo.entity.MeasuredValue;
import com.product01.demo.repository.MeasuredValueCrudRepository;

import jakarta.transaction.Transactional;

@Service
public class MeasuredValueService {
	
	@Autowired
	private MeasuredValueCrudRepository repository;
	
	@Transactional
	public void saveMeasuredValue(MeasuredValue measuredValue) {
		repository.save(measuredValue);
	}
	
	public List<MeasuredValue> findByMeasurementItemId(Integer measurementItemId){
		return repository.findByMeasurementItemId(measurementItemId);
	}
}
