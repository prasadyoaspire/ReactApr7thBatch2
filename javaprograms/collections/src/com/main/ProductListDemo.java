package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.bean.Product;

public class ProductListDemo {

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
		
		Product p4 = new Product();
		p4.setProductId(30);
		p4.setProductName("DellXp");
		p4.setProductPrice(122000);
		p4.setCategory("laptop");		
		
		
		//ArrayList<Product> products = new ArrayList<>();
		HashSet<Product> products = new HashSet<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		Iterator<Product> i = products.iterator();
		
		while(i.hasNext()) {
			Product p = i.next();
			System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()+" "+p.getCategory());
		}			

	}

}
