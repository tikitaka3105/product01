package com.product01.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.product01.demo.sesion.LoginUserSession;

@Controller
public class LogoutController {
	
	@Autowired
	private LoginUserSession session;
	
	@GetMapping("logout")
	public String logout() {
		session.setUser(null);
		return "redirect:/login";
	}
}
