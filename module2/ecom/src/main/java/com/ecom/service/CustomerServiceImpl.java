package com.ecom.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.entity.Customer;
import com.ecom.exception.CustomerNotFoundException;
import com.ecom.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	 Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	 
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) {		
		
		Optional<Customer> optionalCustomerbyUsername = customerRepository.findByUsername(customer.getUsername());
		
		if(optionalCustomerbyUsername.isPresent()) {
			//throw some excepiton
		}
		
	    Optional<Customer> optionalCustomerByEmail = customerRepository.findByEmail(customer.getEmail());
		
		if(optionalCustomerByEmail.isPresent()) {
			//throw some excepiton
		}	
		
		
		Customer newCustomer = customerRepository.save(customer);
		return newCustomer;
	}

	@Override
	public Customer getCustomerById(long customerId) {
		
		logger.info("getCustomerById method calling");
		
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		
		if(optionalCustomer.isEmpty()) {
			logger.error("customernotfuound exception");
			throw new CustomerNotFoundException("Customer Not existing with id: "+customerId);
		}
		
		Customer customer = optionalCustomer.get();
		
		logger.info("getCustomerById method returned");
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		List<Customer> customers = customerRepository.findAll();
		
		return customers;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return null;
	}

	@Override
	public void deleteCustomer(long customerId) {
		
		
	}	

}
