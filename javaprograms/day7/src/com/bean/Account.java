package com.bean;

public class Account {

	private int accNo;
	private double balance;
	private Customer accHolder;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Customer accHolder) {
		this.accHolder = accHolder;
	}	
	
}
