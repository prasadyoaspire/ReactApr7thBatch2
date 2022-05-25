package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.ecom.entity.Customer;

//@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

	@Query("select c from Customer c where c.userName = :uname and c.password = :upwd")
	Customer login(@Param("uname") String username, @Param("upwd") String password);
}
