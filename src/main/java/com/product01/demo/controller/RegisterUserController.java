package com.product01.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.product01.demo.entity.User;
import com.product01.demo.form.UserForm;
import com.product01.demo.service.SaveUserService;
import com.product01.demo.service.commons.ConvertClassService;

@Controller
public class RegisterUserController {
	
	@Autowired
	private ConvertClassService convertClassService;
	
	@Autowired
	private SaveUserService saveUserService;
	
	@ModelAttribute
	public UserForm setUpUserForm() {
		return new UserForm();
	}
	
	
	@GetMapping("register")
	public String showRegisterUserPage() {
		return "register";
	}
	
	@PostMapping("register")
	public String saveUser(@Validated UserForm form, BindingResult result) {
		if(result.hasErrors()) {
			return "register";
		}
		
		User user = convertClassService.convertFormToUser(form);
		User savedUser = saveUserService.save(user);
		return "redirect:/login";
	}
}
