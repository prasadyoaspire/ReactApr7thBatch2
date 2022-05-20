package com.springioc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springioc.beans.Product;
import com.springioc.controller.ProductController;

public class ProductControllerMain {

	public static void main(String[] args) {	
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springappcontext.xml");
		
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
