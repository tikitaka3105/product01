package com.product01.demo.form;

import java.util.List;

import com.product01.demo.entity.MeasureTitle;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class MeasureValueForm {

	private MeasureTitle measureTitle;
	
	@Valid
	private List<MeasuredValueForm> measuredValueFormList;
	
	@NotEmpty
	private String measuredAt;
}
