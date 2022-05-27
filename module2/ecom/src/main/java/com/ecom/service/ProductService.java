package com.ecom.service;

import java.util.List;

import com.ecom.entity.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	
	public Product getProductById(long productId);
	
	public List<Product> getAllProducts();
	
	public List<Product> getProductsByCategory(String category);
	
	public List<Product> getAllProductsWithInPriceRange(double lowerPrice, double upperPrice);
	
	public Product updateProduct(Product product);
	
	public void deleteProduct(long productId);
		
}
