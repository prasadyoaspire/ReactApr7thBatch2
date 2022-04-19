package com.abc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Date:"+today);
		
		LocalDateTime dtime = LocalDateTime.now();
		System.out.println("Date and Time:"+ dtime);
		
		LocalDate dob = LocalDate.of(1998, 10, 30);
		System.out.println("Dob: "+dob);
		
		LocalDate joiningDate = LocalDate.of(2015, Month.JUNE, 30);
		System.out.println("Joining Date : "+joiningDate);			

	}
}
