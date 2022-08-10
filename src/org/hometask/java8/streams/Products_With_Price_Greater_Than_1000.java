package org.hometask.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Products_With_Price_Greater_Than_1000 {

	public static void products(ArrayList<Products> list) {
		list.add(new Products("Camera", 450, "Electronics", 'A'));
		list.add(new Products("Car", 1000000, "Automobile", 'B'));
		list.add(new Products("TrollyBag", 500, "Luggage", 'A'));
		list.add(new Products("TV", 25000, "Electronics", 'A'));

	}

	public static void main(String[] args) {

		ArrayList<Products> list = new ArrayList<>();
		products(list);

		List<Products> products = list.stream().filter(ab -> ab.price > 1000).collect(Collectors.toList());
		System.out.println(products);
	}
}
