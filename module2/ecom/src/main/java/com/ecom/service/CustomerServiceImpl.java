package com.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.entity.Customer;
import com.ecom.exception.CustomerNotFoundException;
import com.ecom.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		Customer newCustomer = customerRepository.save(customer);
		return newCustomer;
	}

	@Override
	public Customer getCustomerById(long customerId) {
		
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		
		if(optionalCustomer.isEmpty()) {
			throw new CustomerNotFoundException("Customer Not existing with id: "+customerId);
		}
		
		Customer customer = optionalCustomer.get();
		
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
