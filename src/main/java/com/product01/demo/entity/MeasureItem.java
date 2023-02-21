package com.product01.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "measure_items")
@Getter
@Setter
@NoArgsConstructor
public class MeasureItem extends CommonColumn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_type")
	private String itemType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "measure_title_id")
	private MeasureTitle measureTitle;
	
	@OneToMany(mappedBy = "measureItem" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<MeasuredValue> measuredValueList;
}
