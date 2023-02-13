package com.product01.demo.entity;


import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "created_at")
	private Timestamp createdAt;
	
	@Column(name = "updated_at")
	private Timestamp updatedAt;
	
	@Column(name = "deleted_at")
	private Timestamp deletedAt;
	
	@Column(name = "delete_flag")
	private Boolean deleteFlag;
	
	@Column(name = "rolename")
	private String rolename;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private List<MeasurementItem> measurementItemList;
	
	public User() {
		this.createdAt = new Timestamp(System.currentTimeMillis());
		this.updatedAt = new Timestamp(System.currentTimeMillis());
		this.deleteFlag = false;
		this.rolename = "GENERAL";
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.createdAt = new Timestamp(System.currentTimeMillis());
		this.updatedAt = new Timestamp(System.currentTimeMillis());
		this.deleteFlag = false;
		this.rolename = "GENERAL";
	}
}
