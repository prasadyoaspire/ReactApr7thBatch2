package com.springioc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.beans.Circle;
import com.springioc.beans.Shape;
import com.springioc.service.ShapeService;

public class ShapeServiceMain {

	public static void main(String[] args) {
		
		//------ without spring ioc -------
		
//		Shape shape = new Circle();
//		
//		ShapeService shapeService = new ShapeService();
//		shapeService.setShape(shape);
//		
//		shapeService.findArea();
		
		//----- with spring ioc --------
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		ShapeService shapeService = (ShapeService) context.getBean("service1");
		
		shapeService.findArea();

	}

}
