package com.product01.demo.sesion;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import com.product01.demo.entity.User;

import lombok.Data;

@Component
@SessionScope
@Data
public class LoginUserSession {
	private User user;
}
