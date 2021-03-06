package com.ecom.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entity.Customer;
import com.ecom.model.LoginRequest;
import com.ecom.model.LoginResponse;
import com.ecom.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customer/save")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		
		Customer newCustomer = customerService.saveCustomer(customer);	
		
		return  new ResponseEntity<>(newCustomer,HttpStatus.CREATED);
	}
	
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<Customer> fetchCustomerDetails(@PathVariable("customerId") long customerId) {
		
		Customer customer = customerService.getCustomerById(customerId);
		
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/customer/all")
	public List<Customer> fetchAllCustomers() {		
			
		return customerService.getAllCustomers();
	}	
	
}
