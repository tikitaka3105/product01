package com.product01.demo.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "measured_values")
@Data
@AllArgsConstructor
public class MeasuredValue {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "measurement_item_id")
	private Integer measurementItemId;
	
	@Column(name = "measured_value1")
	private String measuredValue1;
	
	@Column(name = "measured_value2")
	private String measuredValue2;
	
	@Column(name = "measured_value3")
	private String measuredValue3;
	
	@Column(name = "measured_value4")
	private String measuredValue4;
	
	@Column(name = "measured_value5")
	private String measuredValue5;
	
	@Column(name = "measured_value6")
	private String measuredValue6;
	
	@Column(name = "measured_value7")
	private String measuredValue7;
	
	@Column(name = "measured_value8")
	private String measuredValue8;
	
	@Column(name = "measured_value9")
	private String measuredValue9;
	
	@Column(name = "measured_value10")
	private String measuredValue10;
	
	@Column(name = "created_at")
	private Timestamp createdAt;
	
	@Column(name = "updated_at")
	private Timestamp updatedAt;
	
	@Column(name = "deleted_at")
	private Timestamp deletedAt;
	
	@Column(name = "delete_flag")
	private Boolean deleteFlag;
	
	public MeasuredValue() {
		this.createdAt = new Timestamp(System.currentTimeMillis());
		this.updatedAt = new Timestamp(System.currentTimeMillis());
		this.deleteFlag =false;
	}
}
