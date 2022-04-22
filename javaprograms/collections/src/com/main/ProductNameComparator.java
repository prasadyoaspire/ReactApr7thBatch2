package com.main;

import java.util.Comparator;

import com.bean.Product;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		int result = o1.getProductName().compareTo(o2.getProductName());
		
		return result;
	}

}
