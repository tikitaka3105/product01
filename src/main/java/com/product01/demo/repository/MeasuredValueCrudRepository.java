package com.product01.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.product01.demo.entity.MeasuredValue;

public interface MeasuredValueCrudRepository extends JpaRepository<MeasuredValue, Integer> {
	@Query(value = "select * from measured_values where measurement_item_id = :measurementItemId", nativeQuery = true)
	public List<MeasuredValue> findByMeasurementItemId(@Param("measurementItemId") Integer measurementItemId);
}
