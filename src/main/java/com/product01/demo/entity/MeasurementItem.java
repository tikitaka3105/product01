package com.product01.demo.entity;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "measurement_items")
@Data
@AllArgsConstructor
public class MeasurementItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "measure_value1")
	private String measureValue1;
	
	@Column(name = "measure_value2")
	private String measureValue2;
	
	@Column(name = "measure_value3")
	private String measureValue3;
	
	@Column(name = "measure_value4")
	private String measureValue4;
	
	@Column(name = "measure_value5")
	private String measureValue5;
	
	@Column(name = "measure_value6")
	private String measureValue6;
	
	@Column(name = "measure_value7")
	private String measureValue7;
	
	@Column(name = "measure_value8")
	private String measureValue8;
	
	@Column(name = "measure_value9")
	private String measureValue9;
	
	@Column(name = "measure_value10")
	private String measureValue10;
	
	@Column(name = "created_at")
	private Timestamp createdAt;
	
	@Column(name = "updated_at")
	private Timestamp updatedAt;
	
	@Column(name = "deleted_at")
	private Timestamp deletedAt;
	
	@Column(name = "delete_flag")
	private Boolean deleteFlag;
	
	@OneToMany(mappedBy = "measurementItem", cascade = CascadeType.ALL)
	private List<MeasuredValue> measuredValueList;
	
	@Column(name = "measure_value1_type")
	private String measureValue1Type;
	
	@Column(name = "measure_value2_type")
	private String measureValue2Type;
	
	@Column(name = "measure_value3_type")
	private String measureValue3Type;
	
	@Column(name = "measure_value4_type")
	private String measureValue4Type;
	
	@Column(name = "measure_value5_type")
	private String measureValue5Type;
	
	@Column(name = "measure_value6_type")
	private String measureValue6Type;
	
	@Column(name = "measure_value7_type")
	private String measureValue7Type;
	
	@Column(name = "measure_value8_type")
	private String measureValue8Type;
	
	@Column(name = "measure_value9_type")
	private String measureValue9Type;
	
	@Column(name = "measure_value10_type")
	private String measureValue10Type;
	
	public MeasurementItem() {
		this.createdAt = new Timestamp(System.currentTimeMillis());
		this.updatedAt = new Timestamp(System.currentTimeMillis());
		this.deleteFlag =false;
	}
}
