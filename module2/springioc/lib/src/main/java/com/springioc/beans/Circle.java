package com.springioc.beans;

public class Circle implements Shape {

	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		
		double result = 3.14 * radius*radius;
		
		System.out.println("Circle area: "+result);

	}

}
