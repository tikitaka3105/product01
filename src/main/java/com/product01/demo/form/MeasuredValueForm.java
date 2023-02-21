package com.product01.demo.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MeasuredValueForm {
	
	@NotEmpty
	@Size(max = 50)
	private String value;
}
