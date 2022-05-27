package com.ecom.service;

import java.util.List;
import java.util.Set;

import com.ecom.entity.Order;
import com.ecom.entity.OrderItem;

public interface OrderService {

	Order saveOrder(long customerId, Set<OrderItem> orderItems);
	
	Order getOrderById(long orderId);
	
	List<Order> getAllOrders();
}
