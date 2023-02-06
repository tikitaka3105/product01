package com.product01.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product01.demo.entity.MeasuredValue;
import com.product01.demo.entity.MeasurementItem;
import com.product01.demo.entity.User;
import com.product01.demo.form.MeasuredValueForm;
import com.product01.demo.service.MeasuredValueService;
import com.product01.demo.service.MeasurementItemService;
import com.product01.demo.service.commons.ConvertClassService;
import com.product01.demo.sesion.LoginUserSession;

@Controller
@RequestMapping("/measure/{id}")
public class MeasureController {
	
	@Autowired
	private MeasurementItemService measurementItemService;
	
	@Autowired
	private MeasuredValueService measuredValueService;
	
	@Autowired
	private ConvertClassService convertClassService;
	
	@Autowired
	private LoginUserSession session;
	
	private MeasurementItem measurementItem;
	
	@ModelAttribute
	public MeasuredValueForm setUpMeasuredValueForm(@PathVariable Integer id) {
		measurementItem = measurementItemService.findById(id);
		MeasuredValueForm measuredValueForm = new MeasuredValueForm();
		measuredValueForm.setMeasurementItem(measurementItem);
		return measuredValueForm;
	}
	
	@GetMapping
	public String showMeasurePage(@PathVariable Integer id, Model model) {
		User user = session.getUser();
		if(!user.getId().equals(measurementItem.getUserId())) {
			return "redirect:/home";
		}
		measurementItem.setMeasuredValueList(measuredValueService.findByMeasurementItemId(id));
		model.addAttribute("measurementItem", measurementItem);
		return "measure";
	}
	
	@PostMapping
	public String saveMeasureValue(@PathVariable Integer id, Model model,
			@Validated MeasuredValueForm form, BindingResult error) {
		if(error.hasErrors()) {
			return "measure";
		}
		MeasuredValue measuredValue = convertClassService.convertFormToMeasuredValue(form);
		measuredValue.setMeasurementItemId(id);
		measuredValueService.saveMeasuredValue(measuredValue);
		return "redirect:/home";
	}
}
