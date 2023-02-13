package com.product01.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.product01.demo.form.UserForm;
import com.product01.demo.service.UserService;

import jakarta.validation.Valid;

@Controller
public class RegisterUserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/registration")
	public String showRegisterUserPage(@ModelAttribute("userForm") UserForm form) {
		return "registration";
	}
	
	@PostMapping("/registration")
	public String saveUser(@Valid @ModelAttribute("userForm") UserForm form, BindingResult result) {
		if(result.hasErrors()) {
			return "registration";
		}
		userService.userRegistration(form.getUsername(), form.getPassword());
		return "redirect:/login";
	}
}
