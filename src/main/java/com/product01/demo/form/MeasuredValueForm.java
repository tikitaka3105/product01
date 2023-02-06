package com.product01.demo.form;

import com.product01.demo.entity.MeasurementItem;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MeasuredValueForm {
	
	@NotEmpty
	@Size(max = 50)
	private String measuredValue1;
	
	@Size(max = 50)
	private String measuredValue2;
	
	@Size(max = 50)
	private String measuredValue3;
	
	@Size(max = 50)
	private String measuredValue4;
	
	@Size(max = 50)
	private String measuredValue5;
	
	@Size(max = 50)
	private String measuredValue6;
	
	@Size(max = 50)
	private String measuredValue7;
	
	@Size(max = 50)
	private String measuredValue8;
	
	@Size(max = 50)
	private String measuredValue9;
	
	@Size(max = 50)
	private String measuredValue10;
	
	private String measuredAt;
	
	private MeasurementItem measurementItem;
}
