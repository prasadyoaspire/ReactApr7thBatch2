package com.springioc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.beans.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		Student student = (Student) context.getBean("stu1");
		
		student.displyStudent();

	}

}
