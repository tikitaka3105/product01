package com.product01.demo.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.product01.demo.entity.User;
import com.product01.demo.form.UserForm;
import com.product01.demo.service.LoginService;
import com.product01.demo.sesion.LoginUserSession;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private LoginUserSession session;
	
	@ModelAttribute
	public UserForm setUpUserForm() {
		return new UserForm();
	}
	
	@GetMapping("login")
	public String showLoginPage() {
		return "login";
	}
	
	@PostMapping("login")
	public String login(@Validated UserForm form, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "login";
		}
		User user = loginService.findByUsername(form.getUsername());
		if(user == null) {
			model.addAttribute("loginFailureMsg", messageSource.getMessage("loginFailure", new String[] {}, Locale.getDefault()));
			return "login";
		}
		session.setUser(user);
		return "redirect:/home";
	}
}
