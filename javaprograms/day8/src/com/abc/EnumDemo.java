package com.abc;

public class EnumDemo {

	public static void main(String[] args) {
		
		int i = 100;
		
		byte b = 10;
		
		String sdirection = "SOUTH";
		
		Directions direction = Directions.SOUTH;
		
		System.out.println(direction);
		
		Directions[] allDirections = Directions.values();
		
		for(Directions d: allDirections) {
			System.out.println(d);
		}
		

	}

}
