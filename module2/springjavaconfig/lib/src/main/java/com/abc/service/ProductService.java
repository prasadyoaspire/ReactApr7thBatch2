package com.abc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.beans.Product;
import com.abc.dao.ProductDao;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;	
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void saveProduct(Product product) {		
		//any logic goes here
		
		//ProductDao productDao = new ProductDao();
		productDao.addProduct(product);
	}
	
	public List<Product> fetchAllProducts() {
		//ProductDao productDao = new ProductDao();
		List<Product> productList = productDao.getAll();
		return productList;
	}
	
}
