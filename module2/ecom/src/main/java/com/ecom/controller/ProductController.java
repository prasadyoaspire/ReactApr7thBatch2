package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entity.Product;
import com.ecom.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/product/all")
	public List<Product> fetchAllProducts() {

		List<Product> productList = productService.getAllProducts();
		return productList;
	}
	
	@GetMapping("/product/find/{pId}")
	public Product fetchProductById(@PathVariable("pId") int productId) {
		
		Product product = productService.getProductById(productId);
		return product;
	}
	
	@PostMapping("/product/save")
	public Product addProduct(@RequestBody Product product) {
		
		Product newProduct = productService.saveProduct(product);		
		return newProduct;
	}
}
