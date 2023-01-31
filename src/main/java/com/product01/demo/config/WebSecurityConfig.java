//package com.product01.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//		http.authorizeHttpRequests()
//				.anyRequest().authenticated()
//				.and()
//			.formLogin()
//				.loginPage("/login")
//				.loginProcessingUrl("TBD")
//				.usernameParameter("userForm.username")
//				.passwordParameter("userForm.password")
//				.successForwardUrl("/home")
//				.failureUrl("/login?error")
//				.permitAll()
//				.and()
//			.logout()
//				.logoutUrl("/logout")
//				.logoutSuccessUrl("logout")
//				.permitAll();
//		return http.build();
//	}
//	
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	public void configure(WebSecurity web) throws Exception{
//		web.ignoring().requestMatchers(
//				"/images/**",
//				"/css/**",
//				"/js/**");
//	}
//	
//	public void configure(AuthenticationManagerBuilder auth) throws Exception{
//		auth.inMemoryAuthentication()
//			.withUser("TBD").password("TBD").roles("TBD");
//	}
//}
