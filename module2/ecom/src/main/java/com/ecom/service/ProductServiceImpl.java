package com.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.entity.Product;
import com.ecom.exception.ProductNotFoundException;
import com.ecom.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		
		Product savedProduct = productRepository.save(product);
		return savedProduct;
	}

	@Override
	public Product getProductById(int productId) throws ProductNotFoundException {
		
		Optional<Product> optionalProduct = productRepository.findById(productId);		
		
		if(optionalProduct.isEmpty()) {
			
			throw new ProductNotFoundException("Product Not found with id: "+productId);
		}
		
		Product product = optionalProduct.get();
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		
		List<Product> products = productRepository.findAll();
		return products;
	}

	@Override
	public Product updateProduct(Product product) {
		
		Optional<Product> optionalProduct =  productRepository.findById(product.getProductId());
		
		if(optionalProduct.isEmpty()) {
			throw new ProductNotFoundException("Product Not found with id: "+product.getProductId());
		}
		
		Product updatedProduct = productRepository.save(product);
		
		return updatedProduct;
	}

	@Override
	public void deleteProduct(int productId) {
	
		Optional<Product> optionalProduct = productRepository.findById(productId);
		if(optionalProduct.isEmpty()) {
			throw new ProductNotFoundException("Product Not found with id: "+productId);
		}
		
		productRepository.deleteById(productId);		
	}

}
