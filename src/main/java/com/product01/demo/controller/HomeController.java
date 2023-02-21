package com.product01.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.product01.demo.entity.MeasureTitle;
import com.product01.demo.service.MeasureTitleService;
import com.product01.demo.userDetails.UserDetailsImpl;

@Controller
public class HomeController {
	
	@Autowired
	private MeasureTitleService measureTitleService;
	
	
	@GetMapping("/home")
	public String showHome(@AuthenticationPrincipal UserDetailsImpl loginUser, Model model) {
		List<MeasureTitle> measureTitleList = measureTitleService.findByUserId(loginUser.getUser());
		model.addAttribute("measureTitleList", measureTitleList);
		return "home";
	}
	
}
