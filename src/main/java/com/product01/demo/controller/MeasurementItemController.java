package com.product01.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.product01.demo.entity.MeasurementItem;
import com.product01.demo.form.MeasurementItemForm;
import com.product01.demo.service.SaveMeasurementItemService;
import com.product01.demo.service.commons.ConvertClassService;
import com.product01.demo.sesion.LoginUserSession;

@Controller
public class MeasurementItemController {
	
	@Autowired
	private ConvertClassService convertClassService;
	@Autowired
	private LoginUserSession session;
	@Autowired
	private SaveMeasurementItemService saveMeasurementItemService;
	
	@ModelAttribute
	public MeasurementItemForm setUpForm() {
		return new MeasurementItemForm();
	}
	
	@GetMapping("new")
	public String createNewMeasurementItem(){
		return "newMeasurementItem";
	}
	
	@PostMapping("new")
	public String registerNewMeasurementItem(@Validated MeasurementItemForm form, BindingResult error, Model model) {
		if(error.hasErrors()) {
			return "newMeasurementItem";
		}
		MeasurementItem measurementItem = convertClassService.convertFormToMeasurementItem(form);
		measurementItem.setUser(session.getUser());
		saveMeasurementItemService.saveMeasurementItem(measurementItem);
		return "redirect:/home";
	}
}
