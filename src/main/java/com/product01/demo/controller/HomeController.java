package com.product01.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.product01.demo.entity.MeasurementItem;
import com.product01.demo.entity.User;
import com.product01.demo.service.MeasurementItemService;
import com.product01.demo.sesion.LoginUserSession;

@Controller
public class HomeController {
	
	@Autowired
	private LoginUserSession session;
	
	@Autowired
	private MeasurementItemService measurementItemService;
	
	@GetMapping("home")
	public String showHome(Model model) {
		User user = session.getUser();
		List<MeasurementItem> measurementItemList = measurementItemService.findByUserId(user.getId());
		model.addAttribute("user", user);
		model.addAttribute("measurementItemList", measurementItemList);
		return "home";
	}
	
}
