package com.product01.demo.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MeasurementItemForm {
	
	@NotEmpty
	@Size(max = 50)
	private String itemName;
	
	@NotEmpty
	@Size(max = 50)
	private String measureValue1;
	
	@Size(max = 50)
	private String measureValue2;
	
	@Size(max = 50)
	private String measureValue3;
	
	@Size(max = 50)
	private String measureValue4;
	
	@Size(max = 50)
	private String measureValue5;
	
	@Size(max = 50)
	private String measureValue6;
	
	@Size(max = 50)
	private String measureValue7;
	
	@Size(max = 50)
	private String measureValue8;
	
	@Size(max = 50)
	private String measureValue9;
	
	@Size(max = 50)
	private String measureValue10;
	
	@NotEmpty
	private String measureValue1Type;
	
	private String measureValue2Type;
	
	private String measureValue3Type;
	
	private String measureValue4Type;
	
	private String measureValue5Type;
	
	private String measureValue6Type;
	
	private String measureValue7Type;
	
	private String measureValue8Type;
	
	private String measureValue9Type;
	
	private String measureValue10Type;
	
}
