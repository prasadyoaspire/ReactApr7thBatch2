package com.springioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.springioc.beans.Shape;

public class ShapeService {

	@Qualifier("rectangle2")
	@Autowired
	private Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void findArea() {
		shape.area();
	}
	
}
