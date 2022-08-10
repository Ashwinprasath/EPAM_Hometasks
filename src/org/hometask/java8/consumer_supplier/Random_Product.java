package org.hometask.java8.consumer_supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Random_Product {

	public static void main(String[] args) {
		ArrayList<Products> list = new ArrayList<>();
		productNames(list);
		Supplier<String> supplier = () -> {
			int random_product = (int) (Math.random() * 4);
			return list.get(random_product).name;
		};

		System.out.println(supplier.get());
	}

	public static void productNames(ArrayList<Products> arrlist) {
		arrlist.add(new Products("Fan", 350, "Electrical", 'A'));
		arrlist.add(new Products("Samsung", 10060, "Electronics", 'A'));
		arrlist.add(new Products("Paracetamol", 299, "Medical", 'C'));
		arrlist.add(new Products("TATA", 100000, "Automobile", 'A'));
		arrlist.add(new Products("ExpressBee", 2509, "Transport", 'D'));
		arrlist.add(new Products("Axis", 50900, "Banking", 'A'));
	}
}
