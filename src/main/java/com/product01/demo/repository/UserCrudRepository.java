package com.product01.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.product01.demo.entity.User;

public interface UserCrudRepository extends JpaRepository<User, Integer>{
	@Query(value = "select * from users where username = :username", nativeQuery = true)
	User findByUsername(@Param("username") String username);
}
