package com.ecom.service;

import java.time.LocalDate;

import com.ecom.bean.Order;
import com.ecom.bean.Product;
import com.ecom.dao.ProductDao;

public class ProductService {
	
	public Order addOrder(int productId,int quantity) {
		
		Order order = null;
		
		ProductDao productDao = new ProductDao();
		
		//get product unit price from Product DB
		Product product = productDao.getProductById(productId);
		if(product != null) {
			
			double unitPrice = product.getPrice();
			
			//calculate total cost i.e  qunatity*productprice			
			double totalPrice = quantity * unitPrice;
			
			// add gst 5%
			
			//return invoice (Order)
			order = new Order();
			order.setOrderId(1);
			order.setDateOfOrder(LocalDate.now());
			order.setOrderAmount(totalPrice);
			order.setProductId(productId);
			
		}	
		
		return order;	
		
	}

}
