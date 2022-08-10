package org.hometask.java8.functional_interface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

import org.hometask.java8.Products_List;

public class Cost_Of_All_Electronic_Products {

	public static void main(String[] args) {
		int cost = 0;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the total no of items for which the cost needs to be calculated:");
			int size = s.nextInt();
			ArrayList<Products_List> list = new ArrayList<Products_List>();
			for (int i = 0; i < size; i++) {
				System.out.println("Add the details");
				list.add(new Products_List(s.next(), s.nextInt(), s.next()));
			}
			Predicate<Products_List> predicate = ab -> ab.category.equals("Electronics");
			Function<Products_List, Integer> fun = ab -> ab.price;

			for (Products_List ab : list) {

				if (predicate.test(ab)) {
					fun.apply(ab);
					cost += ab.price;
				}
			}
		}
		System.out.println("Total cost of the products is :" + cost);
	}
}
