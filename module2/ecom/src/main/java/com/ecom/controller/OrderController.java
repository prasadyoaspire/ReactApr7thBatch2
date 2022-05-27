package com.ecom.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entity.Order;
import com.ecom.entity.OrderItem;
import com.ecom.model.OrderRequest;
import com.ecom.model.ProductQuantity;
import com.ecom.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderSerivce;
	
	@PostMapping("/order/save")
	public ResponseEntity<Order>  placeOrder(@RequestBody OrderRequest orderReq) {
		
		long customerId = orderReq.getCustomerId();		
		List<ProductQuantity> selectedProducts = orderReq.getProductQuantity();
			
		Set<OrderItem> orderItemsSet = new HashSet<>();
		
		selectedProducts.forEach(p-> {
			OrderItem orderItem = new OrderItem();
			orderItem.setProductId(p.getProductId());
			orderItem.setQunatity(p.getQuantity());				
			orderItemsSet.add(orderItem);
		});	
	
		Order newOrder = orderSerivce.saveOrder(customerId, orderItemsSet);
		
		return new ResponseEntity<>(newOrder,HttpStatus.CREATED );
		
	}
	
}
