package com.abc.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.abc.bean.Employee;

public class ReduceOperationDemo {

	public static void main(String[] args) {
		
		Integer[] nums = { 10,20,30,50};
		
		//sum of all the elements inside array
		
		int sum = 0;
		
		for(int i = 0;i<nums.length;i++) {
			sum = sum + nums[i];
		}
		
		System.out.println("Sum: "+sum);
		
		//using stream api
		
		Optional<Integer> optional = Arrays.stream(nums).reduce((a,b)-> a+b);
		int result = optional.get();
		System.out.println("Sum: "+result);
		
		
		Employee emp1 = new Employee(101,"abc",50000,LocalDate.of(2014, 10, 20),"developer");
		Employee emp2 = new Employee(102,"bbb",70000,LocalDate.of(2014, 10, 20),"lead");
		Employee emp4 = new Employee(103,"ccc",50000,LocalDate.of(2015, 10, 20),"developer");
		Employee emp5 = new Employee(104,"ddd",50000,LocalDate.of(2015, 10, 20),"developer");
		Employee emp6 = new Employee(105,"eee",90000,LocalDate.of(2010, 10, 20),"manager");
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(emp6);
		employees.add(emp5);
		employees.add(emp4);	
		employees.add(emp2);
		employees.add(emp1);
		
		//task: sum of salaries of all empolyees
		
		List<Double> salaryList = employees.stream().map(e->e.getSalary()).collect(Collectors.toList());
		
		Double sumOfSalaries = salaryList.stream().reduce((a,b)->a+b).get();
		
		System.out.println("Sum of all emps salaries : "+sumOfSalaries);
		
		
	}

}
