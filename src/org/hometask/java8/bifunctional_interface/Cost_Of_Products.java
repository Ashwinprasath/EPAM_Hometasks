package org.hometask.java8.bifunctional_interface;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class Cost_Of_Products {

	public static void productDetails(TreeMap<Integer, Products> map) {
		map.put(1, new Products("Wheat", 100, 1, "A"));
		map.put(2, new Products("Rice", 600, 2, "B"));
		map.put(3, new Products("Deterget", 200, 1, "A"));
		map.put(4, new Products("Sanitary", 500, 5, "C"));
		map.put(5, new Products("Oil", 700, 2, "D"));
		map.put(6, new Products("Maggi", 200, 3, "B"));

	}

	public static void main(String[] args) {

		TreeMap<Integer, Products> m = new TreeMap<>();
		productDetails(m);
		Set<Entry<Integer, Products>> entrySet = m.entrySet();
		ArrayList<Entry<Integer, Products>> list = new ArrayList<>(entrySet);
		int cost = 0;
		BiFunction<Integer, Integer, Integer> bifunc = (price, quantity) -> {
			return (price * quantity);
		};
		for (Entry<Integer, Products> products : list) {
			bifunc.apply(products.getValue().price, products.getValue().quantity);
			cost += (products.getValue().price * products.getValue().quantity);
		}
		System.out.println("Cost of the cart is "+cost);
	}
}
