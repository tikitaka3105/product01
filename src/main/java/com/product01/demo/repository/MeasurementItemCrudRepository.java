package com.product01.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.product01.demo.entity.MeasurementItem;

public interface MeasurementItemCrudRepository extends JpaRepository<MeasurementItem, Integer> {
	@Query(value = "select * from measurement_items where user_id = :userId", nativeQuery = true)
	List<MeasurementItem> findByUserId(@Param("userId") Integer userId);
}
