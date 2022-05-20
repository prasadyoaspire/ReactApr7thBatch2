package com.springioc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springioc.beans.Product;

@Repository
public class ProductDao {

	private List<Product> products = new ArrayList<>();
	
	public void addProduct(Product product) {		

		products.add(product); 
	}
	
	public List<Product> getAll() {
		return products;
	}
}
