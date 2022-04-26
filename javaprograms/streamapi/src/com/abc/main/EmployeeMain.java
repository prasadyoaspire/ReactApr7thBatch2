package com.abc.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.abc.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
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
			
		
		List<Employee> devlopers = new ArrayList<>();	
		
		Iterator<Employee> i = employees.iterator();
		
		while(i.hasNext()) {			
			Employee emp = i.next();			
			if(emp.getRole().equals("developer")) {
				devlopers.add(emp);
			}
		}
		
		System.out.println("Devlopers List: ");
		
		Iterator<Employee> i1 = devlopers.iterator();
		while(i1.hasNext()) {
			Employee e= i1.next();
			System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getSalary()+" "+e.getRole());
		}
		
		//using java8 forEach
		
//		employees.forEach(e-> {
//			if(e.getRole().equals("developer")) {
//				devlopers.add(e);
//			}
//		});
//		
//		System.out.println("Devlopers List: ");
//		
//		devlopers.forEach(d->System.out.println(d.getEmpId()+" "+d.getName()+" "+d.getSalary()+" "+d.getRole()));
		

	}

}
