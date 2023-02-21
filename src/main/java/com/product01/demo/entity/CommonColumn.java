package com.product01.demo.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@MappedSuperclass
@Data
public class CommonColumn {
	@Column(name = "created_at", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp createdAt;
	
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp updatedAt;
	
	@Column(name = "deleted_at")
	private Timestamp deletedAt;
	
	@Column(name = "delete_flag")
	private Boolean deleteFlag;
	
	@PrePersist
	public void preInsert() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		setCreatedAt(timestamp);
		setUpdatedAt(timestamp);
		setDeleteFlag(false);
	}
	
	@PreUpdate
	public void preUpdate() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		setUpdatedAt(timestamp);
	}
}
