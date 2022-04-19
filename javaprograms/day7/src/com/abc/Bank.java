package com.abc;

import java.time.LocalDate;

import com.bean.Account;
import com.bean.Customer;

public class Bank {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setCustomerId(1111);
		customer.setCustomerName("Krish");
		customer.setEmail("krish@tmail.com");
		
		LocalDate dob = LocalDate.of(2000, 10, 10);
		customer.setDob(dob);	
		
		//Customer customer = new Customer(1111,"Krish",dob,"krish@tmail.com");			
		
		Account account = new Account();
		account.setAccNo(10000);
		account.setBalance(50000);
		account.setAccHolder(customer);
		
		int accno = account.getAccNo();
		double acbal = account.getBalance();
		Customer acholder = account.getAccHolder();
		
		int custId = acholder.getCustomerId();
		String custName = acholder.getCustomerName();
		String custEmail = acholder.getEmail();
		LocalDate custDob = acholder.getDob();
		
		System.out.println("A/c No: "+accno);
		System.out.println("Balance: "+acbal);
		System.out.println("A/c holder details ");
		System.out.println("Customer Id: "+custId);
		System.out.println("Customer Name: "+custName);
		System.out.println("Customer Email: "+custEmail);
		System.out.println("Customer Id: "+custDob);
		

	}

}
