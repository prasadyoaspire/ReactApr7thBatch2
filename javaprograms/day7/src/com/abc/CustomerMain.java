package com.abc;

import java.time.LocalDate;

import com.bean.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setCustomerId(111);
		customer.setCustomerName("Krish");		
		//LocalDate dob = LocalDate.of(1998, 10, 30);
		//customer.setDob(dob);		
		customer.setDob(LocalDate.of(1998, 10, 30));
		customer.setEmail("krish@tmail.com");
		
		int cid = customer.getCustomerId();
		String cname = customer.getCustomerName();
		LocalDate dob = customer.getDob();
		String email = customer.getEmail();
		
		System.out.println("CustomerId: "+cid);
		System.out.println("Name: "+cname);
		System.out.println("DOB: "+dob);
		System.out.println("Email: "+email);

	}

}
