package com.product01.demo.service.commons;

import org.springframework.stereotype.Service;

import com.product01.demo.entity.MeasuredValue;
import com.product01.demo.entity.MeasurementItem;
import com.product01.demo.entity.User;
import com.product01.demo.form.MeasuredValueForm;
import com.product01.demo.form.MeasurementItemForm;
import com.product01.demo.form.UserForm;

@Service
public class ConvertClassService {

	public User convertFormToUser(UserForm form) {
		User user = new User();
		user.setUsername(form.getUsername());
		user.setPassword(form.getPassword());
		return user;
	}
	
	public MeasurementItem convertFormToMeasurementItem(MeasurementItemForm form) {
		MeasurementItem measurementItem = new MeasurementItem();
		measurementItem.setItemName(form.getItemName());
		measurementItem.setMeasureValue1(form.getMeasureValue1());
		measurementItem.setMeasureValue2(form.getMeasureValue2());
		measurementItem.setMeasureValue3(form.getMeasureValue3());
		measurementItem.setMeasureValue4(form.getMeasureValue4());
		measurementItem.setMeasureValue5(form.getMeasureValue5());
		measurementItem.setMeasureValue6(form.getMeasureValue6());
		measurementItem.setMeasureValue7(form.getMeasureValue7());
		measurementItem.setMeasureValue8(form.getMeasureValue8());
		measurementItem.setMeasureValue9(form.getMeasureValue9());
		measurementItem.setMeasureValue10(form.getMeasureValue10());
		measurementItem.setMeasureValue1Type(form.getMeasureValue1Type());
		measurementItem.setMeasureValue2Type(form.getMeasureValue2Type());
		measurementItem.setMeasureValue3Type(form.getMeasureValue3Type());
		measurementItem.setMeasureValue4Type(form.getMeasureValue4Type());
		measurementItem.setMeasureValue5Type(form.getMeasureValue5Type());
		measurementItem.setMeasureValue6Type(form.getMeasureValue6Type());
		measurementItem.setMeasureValue7Type(form.getMeasureValue7Type());
		measurementItem.setMeasureValue8Type(form.getMeasureValue8Type());
		measurementItem.setMeasureValue9Type(form.getMeasureValue9Type());
		measurementItem.setMeasureValue10Type(form.getMeasureValue10Type());
		return measurementItem;
	}
	
	public MeasuredValue convertFormToMeasuredValue(MeasuredValueForm form) {
		MeasuredValue measuredValue = new MeasuredValue();
		measuredValue.setMeasuredValue1(form.getMeasuredValue1());
		measuredValue.setMeasuredValue2(form.getMeasuredValue2());
		measuredValue.setMeasuredValue3(form.getMeasuredValue3());
		measuredValue.setMeasuredValue4(form.getMeasuredValue4());
		measuredValue.setMeasuredValue5(form.getMeasuredValue5());
		measuredValue.setMeasuredValue6(form.getMeasuredValue6());
		measuredValue.setMeasuredValue7(form.getMeasuredValue7());
		measuredValue.setMeasuredValue8(form.getMeasuredValue8());
		measuredValue.setMeasuredValue9(form.getMeasuredValue9());
		measuredValue.setMeasuredValue10(form.getMeasuredValue10());
		return measuredValue;
	}
	
}
