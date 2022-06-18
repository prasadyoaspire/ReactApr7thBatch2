package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecom.entity.Admin;
import com.ecom.entity.Customer;

public interface AdminRepository extends JpaRepository<Customer,Long> {

	@Query("select a from Admin a where a.username = :uname and a.password = :upwd")
	Admin login(@Param("uname") String username, @Param("upwd") String password);

}
