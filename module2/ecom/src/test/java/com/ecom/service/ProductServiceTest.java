package com.ecom.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecom.entity.Product;
import com.ecom.exception.ProductNotFoundException;
import com.ecom.repository.ProductRepository;

@SpringBootTest
public class ProductServiceTest {
	
	@InjectMocks
	private ProductService productService = new ProductServiceImpl();
			
	@Mock
	private ProductRepository productRepository;
	
	@Test
	public void testGetProductById() {
		
		Product product = new Product();
		product.setProductId(100);
		product.setProductName("Iphone");
		product.setProductPrice(50000);
		product.setCategory("phone");
		
		Optional<Product> optionalProduct = Optional.of(product);
		
		when(productRepository.findById(100L)).thenReturn(optionalProduct);
		
		Product myProduct = productService.getProductById(100);
		
		assertEquals("Iphone", myProduct.getProductName());
	}
	
	@Test
	public void testGetProductByIdWithException() {
		
		when(productRepository.findById(100L)).thenThrow(ProductNotFoundException.class);
		
		assertThrows(ProductNotFoundException.class,()->productService.getProductById(100L));
	}
	
	@Test
	public void testGetAllProducts() {
		
		Product product = new Product();
		product.setProductId(100);
		product.setProductName("Iphone");
		product.setProductPrice(50000);
		product.setCategory("phone");
		
		Product product2 = new Product();
		product2.setProductId(200);
		product2.setProductName("SumsungM32");
		product2.setProductPrice(20000);
		product2.setCategory("phone");
		
		Product product3 = new Product();
		product3.setProductId(300);
		product3.setProductName("Nokia");
		product3.setProductPrice(60000);
		product3.setCategory("phone");
		
		List<Product> productList = new ArrayList<>();
		productList.add(product3);
		productList.add(product2);
		productList.add(product);
		
		when(productRepository.findAll()).thenReturn(productList);
		
		List<Product> products = productService.getAllProducts();
		
		assertEquals(3,products.size());		
	}
	
	@Test
	public void testSaveProduct() {
		
		Product product = new Product();
		product.setProductId(100);
		product.setProductName("Iphone");
		product.setProductPrice(50000);
		product.setCategory("phone");
		
		when(productRepository.save(product)).thenReturn(product);
		
		Product newProduct = productService.saveProduct(product);
		
		assertEquals("Iphone",newProduct.getProductName());
		
		verify(productRepository,times(1)).save(product); // useful for testing void methods
		
	}
	
	@Test
	public void testDeleteProduct() {
		
		Product product = new Product();
		product.setProductId(100);
		product.setProductName("Iphone");
		product.setProductPrice(50000);
		product.setCategory("phone");
		
		Optional<Product> optionalProduct = Optional.of(product);
		
		when(productRepository.findById(100L)).thenReturn(optionalProduct);
		
//		Product myProduct = productService.getProductById(100);
		
		productService.deleteProduct(100);
		
		verify(productRepository,times(1)).findById(100L);
		verify(productRepository,times(1)).deleteById(100L);
		
	}

}
