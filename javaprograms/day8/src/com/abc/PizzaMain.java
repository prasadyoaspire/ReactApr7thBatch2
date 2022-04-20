package com.abc;

public class PizzaMain {

	public static void main(String[] args) {		
		
		String s = "BIG";
		
		PizzaSize ps = PizzaSize.BIG;			
		
		Pizza pizza = new Pizza(10,800,PizzaSize.BIG);
		
		pizza.displayPizza();

	}

}
