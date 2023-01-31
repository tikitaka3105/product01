package com.product01.demo.form;

import com.product01.demo.validator.EqualsPropertyValues;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsPropertyValues(property = "passwordConf", comparingProperty = "password")
public class UserForm {
	
	@NotEmpty
	@Size(min = 3, max = 20)
	private String username;
	
	@NotEmpty
	@Size(min = 8, max = 20)
	private String password;
	
	@NotEmpty
	private String passwordConf;
}
