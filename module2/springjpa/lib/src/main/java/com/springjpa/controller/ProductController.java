package com.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springjpa.entity.Product;
import com.springjpa.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	public void addProduct(Product product) {
		
		productService.saveProduct(product);
		
		System.out.println("Product saved.");
	}
	
	
}
