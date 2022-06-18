package com.ecom.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.entity.Admin;
import com.ecom.entity.Customer;
import com.ecom.exception.AuthenticationFailedException;
import com.ecom.exception.UserNameNotExistingException;
import com.ecom.repository.AdminRepository;
import com.ecom.repository.CustomerRepository;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Customer customerLogin(String username, String password) {
		
		Optional<Customer> optionalCustomer = customerRepository.findByUsername(username);
		
		if(optionalCustomer.isEmpty()) {
			throw new UserNameNotExistingException("Username is not existing.");
		}
		
		Optional<Customer> optionalCustomer2 = customerRepository.findByUsernameAndPassword(username, password);
		
		if(optionalCustomer2.isEmpty()) {
			throw new AuthenticationFailedException("Authentication failed");
		}
		
		Customer customer = optionalCustomer2.get();	
		
		return customer;
	}

	@Override
	public Admin adminLogin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
