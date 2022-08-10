package org.hometask.java8.consumer_supplier;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Products_with_Premium_Grade_And_Suffix {

	public static void products(ArrayList<Products> arrlist) {
		arrlist.add(new Products("Fan", 350, "Electrical", 'A'));
		arrlist.add(new Products("Samsung", 10060, "Electronics", 'A'));
		arrlist.add(new Products("Paracetamol", 299, "Medical", 'C'));
		arrlist.add(new Products("TATA", 100000, "Automobile", 'A'));
		arrlist.add(new Products("ExpressBee", 2509, "Transport", 'D'));
		arrlist.add(new Products("Axis", 50900, "Banking", 'A'));
	}

	public static void main(String[] args) {
		ArrayList<Products> list = new ArrayList<>();
		products(list);

		Consumer<Products> con = ab -> {
			if ((ab.grade == 'P' || ab.grade == 'p') && ab.name.contains("*"))
				System.out.println(ab.name + " " + ab.grade);
		};
		for (Products ab : list) {
			con.accept(ab);
		}

	}

}
