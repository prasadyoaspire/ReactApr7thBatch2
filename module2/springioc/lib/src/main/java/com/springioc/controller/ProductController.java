package com.springioc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springioc.beans.Product;
import com.springioc.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService ;	

//	public void setProductService(ProductService productService) {
//		this.productService = productService;
//	}
	
	public void addProduct(Product product) {		
		//req processing logic goes here
		//input validation goes here
		
		//ProductService productService = new ProductService();
		
		productService.saveProduct(product);
		System.out.println("product saved");	
		
	}
	
	public void getAllProducts() {
		//ProductService productService = new ProductService();
		
		List<Product> products =productService.fetchAllProducts();
		products.forEach(p->System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()));		
	}

}
