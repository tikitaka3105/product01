package com.product01.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.product01.demo.entity.MeasureTitle;
import com.product01.demo.entity.User;

public interface MeasureTitleRepository extends JpaRepository<MeasureTitle, Integer> {
	@Query("select m from MeasureTitle m LEFT JOIN FETCH m.measureItemList where m.user = :loginUser")
	List<MeasureTitle> findByUserId(@Param("loginUser") User loginUser);

	@Query("select m from MeasureTitle m LEFT JOIN FETCH m.measureItemList WHERE m.id = :id")
	MeasureTitle findByIdWithMeasureItem(@Param("id") Integer id);
}
