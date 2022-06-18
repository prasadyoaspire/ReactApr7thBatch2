package com.ecom.service;

import java.util.List;

import com.ecom.entity.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	
	public Customer getCustomerById(long customerId);
	
	public List<Customer> getAllCustomers();
	
	public Customer updateCustomer(Customer customer);
	
	public void deleteCustomer(long customerId);
}
