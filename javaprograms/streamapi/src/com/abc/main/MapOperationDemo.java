package com.abc.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.abc.bean.Employee;

public class MapOperationDemo {

	public static void main(String[] args) {

		// data source
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("sql");
		list.add("jpa");
		list.add("devops");
		
//		Function<String,Integer> fun1 = x->x.length();		
//		Consumer<Integer> con1 = x -> System.out.println(x);		
//		list.stream().map(fun1).forEach(con1);
		
		list.stream().map(x->x.length()).forEach(x -> System.out.println(x));
		

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
		
		//task:  collect all developers in a separate list
		
		//List<Employee> developers = employees.stream().filter(e-> e.getRole().equals("developer")).collect(Collectors.toList());
			
		//developers.forEach(x->System.out.println(x.getName()+" "+x.getRole()));
		
		
		//task : how many developer inside the employee list
		
		long count = employees.stream().filter(e-> e.getRole().equals("developer")).count();
		
		System.out.println("No of developers: "+count);
		
		
		List<Integer> scores = new ArrayList<>();
		scores.add(50);
		scores.add(65);
		scores.add(85);		
		scores.add(45);
		
		// or
				
		List<Integer> scores1 = Arrays.asList(50,65,85,45);
		
		//task: sum of all integer values
			
		
		
		

	}

}
