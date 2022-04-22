package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.bean.Account;

public class SortArrayListDemo {

	public static void main(String[] args) {
		
		int[] nums = {20,30,10,45,28};
		
		Arrays.sort(nums);
		
		for(int n:nums) {
			System.out.println(n);
		}
		
		
		List<String> courses = new ArrayList<>();
		
		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("hibernate");
		courses.add("sql");
		
		System.out.println(courses);
		
		Collections.sort(courses);
		
		System.out.println(courses);
		
		Account account1 = new Account(1111,"aaaa",500000);
		Account account2 = new Account(3333,"cccc",600000);
		Account account3 = new Account(5555,"bbbb",200000);
		Account account4 = new Account(2222,"jjjj",500000);
		
		List<Account> accounts = new ArrayList<>();
		
		accounts.add(account4);
		accounts.add(account3);
		accounts.add(account2);
		accounts.add(account1);
		
		Collections.sort(accounts);
		
		Iterator<Account> i = accounts.iterator();
		
		while(i.hasNext()) {
			Account account = i.next();
			System.out.println(account.getAccno()+" "+account.getName()+" "+account.getBalance());
		}		

	}
	
	
}
