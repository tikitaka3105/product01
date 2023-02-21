package com.product01.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product01.demo.entity.MeasureTitle;
import com.product01.demo.form.MeasureValueForm;
import com.product01.demo.form.MeasuredValueForm;
import com.product01.demo.service.MeasureTitleService;
import com.product01.demo.service.MeasuredValueService;

import jakarta.validation.Valid;


@Controller
@RequestMapping("/measure/{id}")
public class MeasureController {
	
	@Autowired
	private MeasureTitleService measureTitleService;
	
	@Autowired
	private MeasuredValueService measuredValueService;
	
	@ModelAttribute
	public MeasureValueForm setUpMeasureSettingForm(@PathVariable("id") Integer measureTitleId) {
		MeasureValueForm measureValueForm = new MeasureValueForm();
		
		MeasureTitle measureTitle = measureTitleService.findByIdWithMeasureItem(measureTitleId);
		measureValueForm.setMeasureTitle(measureTitle);
		
		List<MeasuredValueForm> measuredValueFormList = new ArrayList<>();
		for(int i = 0; i < measureTitle.getMeasureItemList().size(); i++) {
			measuredValueFormList.add(new MeasuredValueForm());
		}
		measureValueForm.setMeasuredValueFormList(measuredValueFormList);
		
		return measureValueForm;
	}
	
	@GetMapping
	public String showMesurePage() {
		return "measure/index";
	}
	
	@PostMapping
	public String saveMeasuredValue(@Valid MeasureValueForm form, BindingResult error) {
		if(error.hasErrors()) {
			return "measure/index";
		}
		measuredValueService.saveMeasuredValueList(form);
		return "redirect:/home";
	}
}
