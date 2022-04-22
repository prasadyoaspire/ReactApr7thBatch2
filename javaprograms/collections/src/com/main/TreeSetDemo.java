package com.main;

import java.util.Set;
import java.util.TreeSet;

import com.bean.Product;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> courses = new TreeSet<>(); // sorted set
		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("hibernate");

		System.out.println(courses);

		Product p1 = new Product(20, "Iphone", 85000, "mobile");
		Product p2 = new Product(40, "Samsung", 85000, "mobile");
		Product p3 = new Product(10, "Nokia", 56000, "mobile");
		Product p4 = new Product(30, "Oppo", 25000, "mobile");

		Set<Product> products = null;

		// System.out.println("Sorting Price by comparable: ");

		// products = new TreeSet<>();

		// System.out.println("Sorting by productId (Comparator) ");

		// ProductNumberCompartor numComp = new ProductNumberCompartor();

		// products = new TreeSet<>(numComp);

		System.out.println("Sorting by productName (Comparator)");

		ProductNameComparator nameComp = new ProductNameComparator();

		products = new TreeSet<>(nameComp);

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);

		for (Product p : products) {
			System.out.println(
					p.getProductId() + " " + p.getProductName() + " " + p.getProductPrice() + " " + p.getCategory());
		}

	}

}
