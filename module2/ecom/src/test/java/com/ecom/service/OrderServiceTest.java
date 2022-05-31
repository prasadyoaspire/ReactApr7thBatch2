package com.ecom.service;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecom.repository.OrderRepository;
import com.ecom.repository.ProductRepository;

@SpringBootTest
public class OrderServiceTest {

	@InjectMocks
	OrderService orderService = new OrderServiceImpl();
	
	@Mock
	private OrderRepository orderRepository;
	
	@Mock
	private ProductRepository productRepository;
	
	
}
