package com.abc;

public class Pizza {	
	
	private int id;
	private double price;	
	//private String size;
	private PizzaSize size;
	
	public Pizza(int id, double price, PizzaSize size) {
		this.id = id;
		this.price = price;
		this.size = size;
	}
	
    public void displayPizza() {
    	System.out.println("Id: "+id);
    	System.out.println("price: "+price);
    	System.out.println("size: "+size);
    	
    }
	
}
