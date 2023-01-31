package com.product01.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.product01.demo.sesion.LoginUserSession;

@Controller
public class HomeController {
	
	@Autowired
	private LoginUserSession session;
	
	@GetMapping("home")
	public String showHome(Model model) {
		model.addAttribute("user", session.getUser());
		return "home";
	}
	
}
