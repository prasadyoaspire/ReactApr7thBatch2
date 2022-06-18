package com.ecom.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entity.Customer;
import com.ecom.model.LoginRequest;
import com.ecom.model.LoginResponse;
import com.ecom.service.AuthenticationService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AuthenticationController {

	@Autowired
	private AuthenticationService authenticationService;
	
	@PostMapping("/customer/login")
	public ResponseEntity<LoginResponse> singin(@Valid @RequestBody LoginRequest loginReq) {
		
		Customer customer = authenticationService.customerLogin(loginReq.getUserName(),loginReq.getPassword());
		
		LoginResponse loginResp = new LoginResponse();
		loginResp.setCustomerId(customer.getUserId());
		loginResp.setCustomerName(customer.getCustomerName());
		loginResp.setEmail(customer.getEmail());
		loginResp.setMobile(customer.getMobile());
		loginResp.setRole(customer.getRole());
		
		return new ResponseEntity<>(loginResp,HttpStatus.OK);
	}
}
