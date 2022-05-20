package com.springjpa.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjpa.controller.ProductController;
import com.springjpa.entity.Product;

public class ProductControllerMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		ProductController productController = context.getBean(ProductController.class);
		
		Product product= new Product();
		product.setProductName("IPhone");
		product.setProductPrice(68000);
		
		productController.addProduct(product);

	}

}
