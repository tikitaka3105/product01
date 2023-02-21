package com.product01.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product01.demo.form.MeasureItemSettingForm;
import com.product01.demo.form.MeasureSettingForm;
import com.product01.demo.service.MeasureTitleService;
import com.product01.demo.userDetails.UserDetailsImpl;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/measure_items")
public class MeasureItemController {
	
	@Autowired
	private MeasureTitleService measureTitleService;
	
	@ModelAttribute
	public MeasureSettingForm setuUpMeasureForm() {
		MeasureSettingForm measureSettingForm = new MeasureSettingForm();
		measureSettingForm.setMeasureItemSettingFormList(new ArrayList<MeasureItemSettingForm>());
		measureSettingForm.getMeasureItemSettingFormList().add(new MeasureItemSettingForm());
		return measureSettingForm;
	}
	
	@GetMapping("/new")
	public String showMeasureItemNew() {
		return "measure_items/new";
	}
	
	@PostMapping("/new")
	public String createMeasureItem(@Valid MeasureSettingForm form, BindingResult error, @AuthenticationPrincipal UserDetailsImpl loginUser) {
		if(error.hasErrors()) {
			return "measure_items/new";
		}
		measureTitleService.save(form, loginUser.getUser());
		return "redirect:/home";
	}
}
