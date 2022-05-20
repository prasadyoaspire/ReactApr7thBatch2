package com.springioc.beans;

public class Triangle implements Shape {

	private int base;
	private int height;
	
	public void setBase(int base) {
		this.base = base;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void area() {
		double result = 0.5*base*height;
		System.out.println("Triangle area: "+result);

	}

}
