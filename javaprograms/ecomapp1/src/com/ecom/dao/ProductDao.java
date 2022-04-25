package com.ecom.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ecom.bean.Product;

public class ProductDao {
	
	private List<Product> products = new ArrayList<>();
	
	public ProductDao() {
		
		Product product1 = new Product();
		product1.setProductId(10);
		product1.setProductName("IphoneX");
		product1.setPrice(85000);
		product1.setCategory("mobile");
		
		Product product2 = new Product();
		product2.setProductId(20);
		product2.setProductName("Samsungs50");
		product2.setPrice(55000);
		product2.setCategory("mobile");
		
		Product product3 = new Product();
		product3.setProductId(30);
		product3.setProductName("SonyI20");
		product3.setPrice(25000);
		product3.setCategory("headphone");
		
		Product product4 = new Product();
		product4.setProductId(40);
		product4.setProductName("SonyXP");
		product4.setPrice(35000);
		product4.setCategory("headphone");
		
		products.add(product4);
		products.add(product3);
		products.add(product2);
		products.add(product1);		
		
	}
	
	
	public Product  getProductById(int productId) {		
		Product product = null;		
		Iterator<Product> i = products.iterator();	
		while(i.hasNext()) {
			Product p = i.next();
			if(productId == p.getProductId()) {
				product = p;
				return product;
			}
		}
		
		return product;
	}	

}
