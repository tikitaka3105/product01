package com.product01.demo.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeasureItemSettingForm {
	@NotEmpty
	@Size(max = 128)
	private String itemName;
	@NotEmpty
	private String itemType;
}
