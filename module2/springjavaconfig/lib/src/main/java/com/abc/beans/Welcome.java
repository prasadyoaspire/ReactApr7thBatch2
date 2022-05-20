package com.abc.beans;

public class Welcome {
	
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void sayHello() {
		
		System.out.println("Message: "+message);
	}	

}
