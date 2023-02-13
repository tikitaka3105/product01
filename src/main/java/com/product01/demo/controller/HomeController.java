package com.product01.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.product01.demo.entity.MeasurementItem;
import com.product01.demo.service.MeasurementItemService;
import com.product01.demo.userDetails.UserDetailsImpl;

@Controller
public class HomeController {
	
	@Autowired
	private MeasurementItemService measurementItemService;
	
	@GetMapping("/home")
	public String showHome(@AuthenticationPrincipal UserDetailsImpl user, Model model) {
		List<MeasurementItem> measurementItemList = measurementItemService.findByUserId(user.getId());
		model.addAttribute("user", user.getUser());
		model.addAttribute("measurementItemList", measurementItemList);
		return "home";
	}
	
}
