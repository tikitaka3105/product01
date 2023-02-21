package com.product01.demo.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product01.demo.entity.MeasureItem;
import com.product01.demo.entity.MeasureTitle;
import com.product01.demo.entity.MeasuredValue;
import com.product01.demo.form.MeasureValueForm;
import com.product01.demo.form.MeasuredValueForm;
import com.product01.demo.repository.MeasuredValueRepository;

import jakarta.transaction.Transactional;

@Service
public class MeasuredValueService {
	
	@Autowired
	private MeasuredValueRepository measuredValueRepository;
	
	@Transactional
	public void saveMeasuredValueList(MeasureValueForm form) {
		MeasureTitle measureTitle = form.getMeasureTitle();
		String measuredAtFormatted = form.getMeasuredAt().replace("T", " ") + ":00";
		List<MeasureItem> measureItemList = measureTitle.getMeasureItemList();
		List<MeasuredValueForm> measuredValueFormList = form.getMeasuredValueFormList();
		for(int i = 0 ; i < measureItemList.size() ; i++) {
			MeasuredValue measuredValue = new MeasuredValue();
			measuredValue.setValue(measuredValueFormList.get(i).getValue());
			measuredValue.setMeasuredAt(Timestamp.valueOf(measuredAtFormatted));
			measuredValue.setMeasureItem(measureItemList.get(i));
			measuredValueRepository.save(measuredValue);
		}
	}
}
