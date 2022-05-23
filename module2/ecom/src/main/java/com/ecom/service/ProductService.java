package com.ecom.service;

import java.util.List;

import com.ecom.entity.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	
	public Product getProductById(int productId);
	
	public List<Product> getAllProducts();
		
}
