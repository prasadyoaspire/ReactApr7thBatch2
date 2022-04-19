package com.abc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter empno");
			int eno = sc.nextInt();
			System.out.println("Enter emp name");
			String ename = sc.next();
			System.out.println("Enter emp salary");
			double esal = sc.nextDouble();
			sc.close();
			
			System.out.println("EmployeeNo:"+eno);
			System.out.println("Employee Name:"+ename);
			System.out.println("Employee Salary:"+esal);
		}
		catch(InputMismatchException e) {
			System.err.println("Enter valid types");
		}
		
		
	}

}
