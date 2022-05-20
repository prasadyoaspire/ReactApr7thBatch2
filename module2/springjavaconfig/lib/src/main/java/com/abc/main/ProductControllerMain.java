package com.abc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.beans.Product;
import com.abc.config.AppConfiguration;
import com.abc.controller.ProductController;

public class ProductControllerMain {

	public static void main(String[] args) {	
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		ProductController productController = context.getBean(ProductController.class);
		
		Product product1 = new Product();
		product1.setProductId(101);
		product1.setProductName("Iphone");
		product1.setProductPrice(68000);
		
		productController.addProduct(product1);
		
		Product product2 = new Product();
		product2.setProductId(102);
		product2.setProductName("Samsung");
		product2.setProductPrice(38000);
		
		productController.addProduct(product2);
		
		System.out.println("**** All Products ******");
		
		productController.getAllProducts();			
		
		context.close();
		
	}

}
