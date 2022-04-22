package com.main;

import java.util.HashMap;
import java.util.Map;

import com.bean.Product;

public class ProductMap {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setProductId(10);
		p1.setProductName("SonyHeadphone");
		p1.setProductPrice(2000);
		p1.setCategory("headphone");
		
		Product p2 = new Product();
		p2.setProductId(20);
		p2.setProductName("Iphone");
		p2.setProductPrice(88000);
		p2.setCategory("mobile");
		
		Product p3 = new Product();
		p3.setProductId(30);
		p3.setProductName("DellXp");
		p3.setProductPrice(122000);
		p3.setCategory("laptop");
		
		Map<Integer,Product> map = new HashMap<>();
		map.put(p1.getProductId(), p1);
		map.put(p2.getProductId(), p2);
		map.put(p3.getProductId(), p3);
		
		
		int productKey = 130;
		
		Product product = map.get(productKey);
		
		if(product!=null) {
			
			System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice());
		}
		else {
			System.out.println("Product not existing with key:");
		}		
		
		
	}
}
