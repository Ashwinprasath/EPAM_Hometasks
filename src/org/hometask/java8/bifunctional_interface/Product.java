package org.hometask.java8.bifunctional_interface;

public class Product {

	String name;
	int price;

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return name + " " + price;
	}
}
