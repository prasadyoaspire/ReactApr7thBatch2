package com.abc.bean;

import java.time.LocalDate;

public class Employee {

	private int empId;
	private String name;
	private double salary;
	private LocalDate joiningDate;
	private String role;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String name, double salary, LocalDate joiningDate, String role) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.role = role;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}	
	
}
