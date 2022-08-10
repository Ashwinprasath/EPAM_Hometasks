package org.hometask.java8;

public class Products_List {

	public String name;
	public int price;
	public String category;

	public Products_List(String name, int price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public String toString() {
		return name + " :" + price + " :" + category;
	}
}
