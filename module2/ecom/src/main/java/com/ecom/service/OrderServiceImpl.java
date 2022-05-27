package com.ecom.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.entity.Customer;
import com.ecom.entity.Order;
import com.ecom.entity.OrderItem;
import com.ecom.entity.Product;
import com.ecom.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService;
	
	
	@Override
	public Order saveOrder(long customerId, Set<OrderItem> orderItems) {
		
		Order order = new Order();
		order.setOrderDate(LocalDate.now());
		order.setOrderStatus("Pending");		
		Customer customer = customerService.getCustomerById(customerId);
		order.setCustomer(customer);
		
		orderItems.forEach(item-> {
			
			long productId = item.getProductId();
			int quantity = item.getQunatity();
			
			Product product = productService.getProductById(productId);
			
			double itemTotal = product.getProductPrice()*quantity;
			
			item.setItemTotal(itemTotal);
			
			item.setOrder(order);
			
		});
		
		order.setOrderItems(orderItems);
		
		//order total
		
		Optional<Double> optionalDouble = orderItems.stream().map(o -> o.getItemTotal()).reduce((a,b) -> a+b);
		
		order.setOrderAmount(optionalDouble.get()); // calculate order amount
		
		Order newOrder = orderRepository.save(order);
		return newOrder;
	}

	@Override
	public Order getOrderById(long orderId) {
		
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		
		return null;
	}

	
}
