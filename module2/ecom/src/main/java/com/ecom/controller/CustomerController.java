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
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(newCustomer,HttpStatus.CREATED);		
		return responseEntity;
	}
	
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<Customer> fetchCustomerDetails(@PathVariable("customerId") long customerId) {
		
		Customer customer = customerService.getCustomerById(customerId);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer,HttpStatus.OK);		
		return responseEntity;
	}
	
	@GetMapping("/customer/all")
	public List<Customer> fetchAllCustomers() {
		
		List<Customer> customerList = customerService.getAllCustomers();		
		return customerList;
	}
	
	@PostMapping("/customer/login")
	public ResponseEntity<LoginResponse> singin(@Valid @RequestBody LoginRequest loginReq) {
		
		Customer customer1 = customerService.doLogin(loginReq.getUserName(),loginReq.getPassword());
		
		LoginResponse loginResp = new LoginResponse();
		loginResp.setCustomerId(customer1.getCustomerId());
		loginResp.setCustomerName(customer1.getCustomerName());
		loginResp.setEmail(customer1.getEmail());
		loginResp.setMobile(customer1.getMobile());
		
		ResponseEntity<LoginResponse> responseEntity = new ResponseEntity<>(loginResp,HttpStatus.OK);		
		return responseEntity;
	}
}
