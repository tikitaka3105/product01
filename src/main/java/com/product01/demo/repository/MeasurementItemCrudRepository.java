package com.product01.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product01.demo.entity.MeasurementItem;

public interface MeasurementItemCrudRepository extends JpaRepository<MeasurementItem, Integer> {
}
