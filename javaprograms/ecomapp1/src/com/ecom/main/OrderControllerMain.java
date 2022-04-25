package com.ecom.main;

import java.util.Scanner;

import com.ecom.controller.OrderController;

public class OrderControllerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter productId: ");
		int productId = sc.nextInt();
		
		System.out.println("Enter quantity: ");
		int quantity = sc.nextInt();
		
		sc.close();		
			
		OrderController orderController = new OrderController();
		
		orderController.placeOrder(productId,quantity);
		

	}

}
