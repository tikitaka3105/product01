package com.product01.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAccountController {
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
}
