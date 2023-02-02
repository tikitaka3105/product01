package com.product01.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MeasureController {
	
	@GetMapping("/measure/{id}")
	public String showMeasurePage(@PathVariable Integer id, Model model) {
		
		return "";
	}
}
