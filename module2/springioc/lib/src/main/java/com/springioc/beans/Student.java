package com.springioc.beans;

import java.util.Set;

public class Student {

	private int studentId;
	private String studentName;
	private Set<String> skills;
	
	public void setStudentId(int studetnId) {
		this.studentId = studetnId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	
	public void displyStudent() {
		
		System.out.println("StudentId: "+studentId);
		System.out.println("Studet Name: "+studentName);
		System.out.println("Skill Set: "+skills);
	}
	
}
