package com.bean;

import java.util.Objects;

public class Product implements Comparable<Product> {

	private int productId;
	private String productName;
	private double productPrice;
	private String category;
	
	public Product() {
		
	}
	
	public Product(int productId, String productName, double productPrice, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.category = category;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, productId, productName, productPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && productId == other.productId
				&& Objects.equals(productName, other.productName)
				&& Double.doubleToLongBits(productPrice) == Double.doubleToLongBits(other.productPrice);
	}

	@Override
	public int compareTo(Product o) {
		
		//int result = this.productId-o.getProductId();	
		
		int result = (int) (this.productPrice-o.getProductPrice());
		if(result == 0) {
			result = this.getProductName().compareTo(o.getProductName());
		}		
		//int result = this.category.compareTo(o.getCategory());
		return result;
	}

}
