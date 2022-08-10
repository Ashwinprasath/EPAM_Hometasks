package org.hometask.java8.bifunctional_interface;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Create_A_Product {

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<>();
		BiFunction<String, Integer, Product> bi = (name, price) -> new Product(name, price);
		al.add(bi.apply("OnePlus", 40000));
		al.add(bi.apply("Ipad", 25000));
		al.add(bi.apply("MacAir", 200000));

		System.out.println(al);
	}
}
