package com.bean;

import java.time.LocalDate;

public class Customer {

	private int customerId;
	private String customerName;
	private LocalDate dob;
	private String email;
	
	public Customer() {
		
	}	
	
	public Customer(int customerId, String customerName, LocalDate dob, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dob = dob;
		this.email = email;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
