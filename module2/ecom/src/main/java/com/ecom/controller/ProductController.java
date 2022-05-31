package com.ecom.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entity.Product;
import com.ecom.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;	

	@GetMapping("/product/all")
	public List<Product> fetchAllProducts() {

		List<Product> productList = productService.getAllProducts();
		
		return productList;
	}
	
	@GetMapping("/product/find/{pId}")
	public ResponseEntity<Object> fetchProductById(@PathVariable("pId") int productId) {
		
		ResponseEntity<Object> responseEntity = null;		
		Product product = productService.getProductById(productId);	
		responseEntity = new ResponseEntity<>(product,HttpStatus.OK);				
		return responseEntity;
	}
	
	@GetMapping("/product/bycategory/{categoryName}")
	public List<Product> fetchProductsByCategory(@PathVariable("categoryName") String category) {
			
		List<Product> products = productService.getProductsByCategory(category);
						
		return products;
	}
	
	@GetMapping("/product/byprice/{lowerRange}/{upperRange}")
	public List<Product> fetchProductsByPriceRange(@PathVariable("lowerRange") double lowerRange,@PathVariable("upperRange") double upperRange) {
			
		List<Product> products = productService.getAllProductsWithInPriceRange(lowerRange, upperRange);
						
		return products;
	}
	
	@PostMapping("/product/save")
	public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) {
		
		Product newProduct = productService.saveProduct(product);		
		ResponseEntity<Product> responseEntity = new ResponseEntity<>(newProduct,HttpStatus.CREATED);
		return responseEntity;
	}
	
	@DeleteMapping("/product/delete/{productId}")
	public ResponseEntity<String> removeProduct(@PathVariable("productId") int productId) {
		
		productService.deleteProduct(productId);		
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Product Deleted Successfully.", HttpStatus.OK);
		return responseEntity;		
	}
	
	@PutMapping("/product/update")
	public ResponseEntity<Product> modifyProduct(@RequestBody Product product) {
		
		Product updatedProduct = productService.updateProduct(product);	
		ResponseEntity<Product> responseEntity = new ResponseEntity<>(updatedProduct,HttpStatus.OK);
		return responseEntity;
	}	
	
}
