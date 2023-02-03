package com.product01.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product01.demo.entity.MeasuredValue;

public interface MeasuredValueCrudRepository extends JpaRepository<MeasuredValue, Integer> {
}
