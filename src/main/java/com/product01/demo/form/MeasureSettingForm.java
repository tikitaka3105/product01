package com.product01.demo.form;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeasureSettingForm {
	@NotEmpty
	@Size(max = 128)
	private String title;
	
	@Valid
	private List<MeasureItemSettingForm> measureItemSettingFormList;
	
	@Valid
	private List<MeasuredValueForm> measuredValueFormList;
}
