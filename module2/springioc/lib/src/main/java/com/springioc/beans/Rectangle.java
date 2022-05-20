package com.springioc.beans;

public class Rectangle implements Shape {

	private int length;
	private int breadth;
		
	public void setLength(int length) {
		this.length = length;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public void area() {
		double result = length*breadth;
		System.out.println("Rectangle area: "+result);
	}

}
