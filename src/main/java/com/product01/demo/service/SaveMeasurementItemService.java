package com.product01.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product01.demo.entity.MeasurementItem;
import com.product01.demo.repository.MeasurementItemCrudRepository;

@Service
public class SaveMeasurementItemService {
	
	@Autowired
	private MeasurementItemCrudRepository repository;
	
	public MeasurementItem saveMeasurementItem(MeasurementItem item) {
		MeasurementItem measurementItem = repository.save(item);
		return measurementItem;
	}
}
