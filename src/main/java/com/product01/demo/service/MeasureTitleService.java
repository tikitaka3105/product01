package com.product01.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product01.demo.entity.MeasureItem;
import com.product01.demo.entity.MeasureTitle;
import com.product01.demo.entity.User;
import com.product01.demo.form.MeasureSettingForm;
import com.product01.demo.repository.MeasureTitleRepository;

import jakarta.transaction.Transactional;

@Service
public class MeasureTitleService {
	
	@Autowired
	private MeasureTitleRepository measureTitleRepository;
	
	@Autowired
	private MeasureItemService measureItemService;
	
	public List<MeasureTitle> findByUserId(User loginUser){
		return measureTitleRepository.findByUserId(loginUser);
	}
	
	public MeasureTitle findByIdWithMeasureItem(Integer id) {
		MeasureTitle measureTitle = measureTitleRepository.findByIdWithMeasureItem(id);
		return measureTitle;
	}
	
	@Transactional
	public void save(MeasureSettingForm form, User loginUser) {
		MeasureTitle measureTitle = new MeasureTitle();
		List<MeasureItem> measureItemList = measureItemService.convertFormToEntity(form.getMeasureItemSettingFormList());
		for(MeasureItem measureItem : measureItemList) {
			measureItem.setMeasureTitle(measureTitle);
		}
		measureTitle.setTitle(form.getTitle());
		measureTitle.setMeasureItemList(measureItemList);
		measureTitle.setUser(loginUser);
		measureTitleRepository.saveAndFlush(measureTitle);
	}
}
