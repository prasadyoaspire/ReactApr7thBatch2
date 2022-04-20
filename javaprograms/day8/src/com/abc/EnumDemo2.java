package com.abc;

public class EnumDemo2 {
	
	enum Color {
        RED,
        GREEN,
        BLUE;
    }

	public static void main(String[] args) {
		
		Color c = Color.GREEN;
		
		chooseColor(c);
		
	}
	
	static void chooseColor(Color color) {
		
		System.out.println("Color selected:"+color);
	}
	
	
	
}
