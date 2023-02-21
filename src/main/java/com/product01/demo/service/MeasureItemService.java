package com.product01.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.product01.demo.entity.MeasureItem;
import com.product01.demo.form.MeasureItemSettingForm;

@Service
public class MeasureItemService {
	
	public List<MeasureItem> convertFormToEntity(List<MeasureItemSettingForm> formList){
		List<MeasureItem> measureItemList = new ArrayList<MeasureItem>();
		for(MeasureItemSettingForm form : formList) {
			MeasureItem measureItem = new MeasureItem();
			measureItem.setItemName(form.getItemName());
			measureItem.setItemType(form.getItemType());
			measureItemList.add(measureItem);
		}
		return measureItemList;
	}
}
