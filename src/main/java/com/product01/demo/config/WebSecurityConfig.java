package com.product01.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.formLogin(login ->
				login.loginPage("/login")
					.loginProcessingUrl("/login")
					.usernameParameter("username")
					.passwordParameter("password")
					.defaultSuccessUrl("/home")
					.failureUrl("/login?error")
					.permitAll()
			).authorizeHttpRequests(authorize ->
				authorize.requestMatchers("/css/**").permitAll()
					.requestMatchers("/js/**").permitAll()
					.requestMatchers("/registration").permitAll()
					.anyRequest().authenticated()
			).logout(logout -> 
				logout.logoutUrl("/logout")
					.permitAll()
					);
		return http.build();
	}
	
	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
