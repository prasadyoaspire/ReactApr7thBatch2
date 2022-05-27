package com.ecom.model;

import java.util.List;

public class OrderRequest {

	private long customerId;	
	private List<ProductQuantity>  productQuantity;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public List<ProductQuantity> getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(List<ProductQuantity> productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
}
