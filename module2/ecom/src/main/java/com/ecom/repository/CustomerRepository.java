package com.ecom.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.ecom.entity.Customer;

//@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
	
	Optional<Customer> findByUsername(String username);
	
	Optional<Customer> findByEmail(String email);
	
	Optional<Customer> findByUsernameAndPassword(String username,String password);

//	@Query("select c from Customer c where c.username = :uname and c.password = :upwd")
//	Optional<Customer> login(@Param("uname") String username, @Param("upwd") String password);
}
