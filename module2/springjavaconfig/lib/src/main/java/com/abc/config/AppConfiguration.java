package com.abc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abc.beans.Welcome;
import com.abc.controller.ProductController;
import com.abc.dao.ProductDao;
import com.abc.service.ProductService;

@Configuration
@ComponentScan(basePackages = "com.abc")
public class AppConfiguration {

	@Bean(name = "hello")
	public Welcome getWelcomeBean() {
		Welcome welcome = new Welcome();
		welcome.setMessage("Hello Spring!");
		return welcome;
	}		
	
//	@Bean
//	public ProductDao getProductDaoBean() {
//		ProductDao productDao = new ProductDao();
//		return productDao;		
//	}
//	
//	@Bean
//	public ProductService getProductServiceBean() {
//		ProductService productService = new ProductService();
//		//productService.setProductDao(getProductDaoBean()); // injecting dependency - setter injection
//		return productService;
//	}
//	
//	@Bean
//	public ProductController getProductControllerBean() {
//		ProductController productController = new ProductController();
//		//productController.setProductService(getProductServiceBean()); // injecting dependency - setter injection
//		return productController;
//	}
}
