package com.main;

import java.util.Comparator;

import com.bean.Product;

public class ProductNumberCompartor implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		int result = o1.getProductId()-o2.getProductId();
		return result;
	}
	

}
