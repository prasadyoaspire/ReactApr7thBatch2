package com.abc;

import java.time.LocalDate;
import java.util.Scanner;

import com.bean.Customer;

public class CustomerMainScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer id:");
		int id = sc.nextInt();
		
		System.out.println("Enter customer name:");
		String name = sc.next();
		
		System.out.println("Enter customer email:");
		String email = sc.next();
		
		//read date as string
		System.out.println("Enter customer dob (yyyy-MM-dd):");
		String dobString = sc.next();
		
		sc.close();
		
		//convert string date to LocalDate
		LocalDate dob = LocalDate.parse(dobString);
		
		Customer customer = new Customer();
		customer.setCustomerId(id);
		customer.setCustomerName(name);		
		customer.setDob(dob);
		customer.setEmail(email);		

		int customerId = customer.getCustomerId();
		String customerName = customer.getCustomerName();
		LocalDate customerDob = customer.getDob();
		String customerEmail = customer.getEmail();
		
		System.out.println("CustomerId: "+customerId);
		System.out.println("Name: "+customerName);
		System.out.println("DOB: "+customerDob);
		System.out.println("Email: "+customerEmail);

	}

}
