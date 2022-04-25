package com.ecom.controller;

import com.ecom.bean.Order;
import com.ecom.service.ProductService;

public class OrderController {

	public void placeOrder(int productId, int quantity) {
		
		ProductService productService = new ProductService();
		
		Order order = productService.addOrder(productId, quantity);
		
		if(order != null) {
			System.out.println("Order placed successfully");
			System.out.println("Order Details:");
			System.out.println("OrderId: "+order.getOrderId());
			System.out.println("Amount: "+order.getOrderAmount());
			System.out.println("OrderDate: "+order.getDateOfOrder());
			System.out.println("ProductId: "+order.getProductId());
		}
		else {
			System.out.println("Something went wrong");
		}
		
	}
}
