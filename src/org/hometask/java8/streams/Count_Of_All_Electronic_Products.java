package org.hometask.java8.streams;

import java.util.ArrayList;

public class Count_Of_All_Electronic_Products {

	public static void products(ArrayList<Products> list) {
		list.add(new Products("Camera", 450, "Electronics", 'A'));
		list.add(new Products("Car", 1000000, "Automobile", 'B'));
		list.add(new Products("TrollyBag", 500, "Luggage", 'A'));
		list.add(new Products("TV", 25000, "Electronics", 'A'));

	}
	
	public static void main(String[] args) {
		ArrayList<Products> list = new ArrayList<>();
		products(list);

		long products = list.stream().filter(ab -> ab.category.equals("Electronics")).count();
		System.out.println(products);
	}
}
