package com.abc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.abc.beans.Welcome;
import com.abc.config.AppConfiguration;

public class WelcomeMain {

	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
//		Welcome welcome = (Welcome) context.getBean("hello");
//		welcome.sayHello();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		Welcome welcome = (Welcome) context.getBean("hello");
		welcome.sayHello();

	}

}
