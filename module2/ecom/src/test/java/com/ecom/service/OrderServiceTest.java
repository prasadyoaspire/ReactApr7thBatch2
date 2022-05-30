package com.ecom.service;

import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecom.repository.OrderRepository;

@SpringBootTest
public class OrderServiceTest {

	@InjectMocks
	OrderService orderService = new OrderServiceImpl();
	
	@Autowired
	private OrderRepository orderRepository;
	
	
}
