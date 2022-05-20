package com.springjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springjpa.dao.ProductDao;
import com.springjpa.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Transactional
	public void saveProduct(Product product) {
		productDao.addProduct(product);
	}	
	
}
