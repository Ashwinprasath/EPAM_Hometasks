package org.hometask.java8.streams;

public class Products {

	String name;
	int price;
	String category;
	char grade;

	public Products(String name, int price, String category, char grade) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.grade = grade;

	}

	public String toString() {

		return name + " " + price + " " + category + " " + grade;
	}
}
