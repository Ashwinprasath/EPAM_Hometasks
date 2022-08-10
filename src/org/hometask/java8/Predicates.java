package org.hometask.java8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Predicates {

	public void products_greater_1000() {

		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Choose the number of items to be checked:");
			int size = s.nextInt();
			ArrayList<Products_List> list = new ArrayList<Products_List>();
			for (int i = 0; i < size; i++) {
				System.out.println("Add the details");
				Products_List p = new Products_List(s.next(), s.nextInt(), s.next());
				list.add(p);
			}
			Predicate<Products_List> pred = ab -> ab.price > 1000;
			ArrayList<Products_List> product_list = new ArrayList<Products_List>();
			for (Products_List ab : list) {
				if (pred.test(ab)) {
					product_list.add(ab);
				}
			}
			System.out.println(product_list);
		}

	}

	public void electronics_Category() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Choose the number of items to be checked:");
			int size = s.nextInt();
			ArrayList<Products_List> list = new ArrayList<Products_List>();
			for (int i = 0; i < size; i++) {
				System.out.println("Add the details");
				Products_List p = new Products_List(s.next(), s.nextInt(), s.next());
				list.add(p);
			}
			Predicate<Products_List> pred = ab -> ab.category.equals("Electronics");
			ArrayList<Products_List> product_list = new ArrayList<Products_List>();
			for (Products_List ab : list) {
				if (pred.test(ab)) {
					product_list.add(ab);
				}
			}
			System.out.println(product_list);
		}

	}

	public void products_Greater_Than_100_And_In_Electronic_Category() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Choose the number of items to be checked:");
			int size = s.nextInt();
			ArrayList<Products_List> list = new ArrayList<Products_List>();
			for (int i = 0; i < size; i++) {
				System.out.println("Add the details");
				Products_List p = new Products_List(s.next(), s.nextInt(), s.next());
				list.add(p);
			}
			Predicate<Products_List> pred = ab -> ab.category.equals("Electronics") && ab.price > 100;
			ArrayList<Products_List> product_list = new ArrayList<Products_List>();
			for (Products_List ab : list) {
				if (pred.test(ab)) {
					product_list.add(ab);
				}
			}
			System.out.println(product_list);
		}

	}

	public void product_Greater_100_Or_In_Electronic_Category() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the no of items available:");
			int size = s.nextInt();
			ArrayList<Products_List> list = new ArrayList<Products_List>();
			for (int i = 0; i < size; i++) {
				System.out.println("Add the details");
				Products_List p = new Products_List(s.next(), s.nextInt(), s.next());
				list.add(p);
			}
			Predicate<Products_List> predicate = ab -> ab.category.equals("Electronics");
			Predicate<Products_List> predicate1 = ab -> ab.price > 100;
			ArrayList<Products_List> product_list = new ArrayList<Products_List>();
			for (Products_List ab : list) {
				if (predicate.or(predicate1).test(ab)) {
					product_list.add(ab);
				}
			}
			System.out.println(product_list);
		}

	}

	public void products_Less_Than_100_And_In_Electronic_Category() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Choose the number of items to be checked:");
			int size = s.nextInt();
			ArrayList<Products_List> list = new ArrayList<Products_List>();
			for (int i = 0; i < size; i++) {
				System.out.println("Add the details");
				Products_List p = new Products_List(s.next(), s.nextInt(), s.next());
				list.add(p);
			}
			Predicate<Products_List> pred = ab -> ab.category.equals("Electronics") && ab.price < 100;
			ArrayList<Products_List> product_list = new ArrayList<Products_List>();
			for (Products_List ab : list) {
				if (pred.test(ab)) {
					product_list.add(ab);
				}
			}
			System.out.println(product_list);
		}

	}

	public void status_Code_Is_400() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Choose the number of items to be checked:");
			int size = s.nextInt();
			ArrayList<Response_Class> list = new ArrayList<Response_Class>();
			for (int i = 0; i < size; i++) {
				System.out.println("Add the details");
				Response_Class resp = new Response_Class(s.nextInt(), s.next());
				list.add(resp);
			}
			Predicate<Response_Class> pred = ab -> ab.status_code == 400;
			ArrayList<Response_Class> Response_List = new ArrayList<Response_Class>();
			for (Response_Class ab : list) {
				if (pred.test(ab)) {
					Response_List.add(ab);
				}
			}
			System.out.println(Response_List);
		}

	}

	public void response_Type_JSON() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Choose the number of items to be checked:");
			int size = s.nextInt();
			ArrayList<Response_Class> list = new ArrayList<Response_Class>();
			for (int i = 0; i < size; i++) {
				System.out.println("Add the details");
				list.add(new Response_Class(s.nextInt(), s.next()));
			}
			Predicate<Response_Class> pred = ab -> ab.response_type.equals("JSON");
			ArrayList<Response_Class> Response_List = new ArrayList<Response_Class>();
			for (Response_Class ab : list) {
				if (pred.test(ab)) {
					Response_List.add(ab);
				}
			}
			System.out.println(Response_List);
		}

	}

	public void response_Type_JSON_And_Status_Code_400() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Choose the number of items to be checked:");
			int size = s.nextInt();
			ArrayList<Response_Class> list = new ArrayList<Response_Class>();
			for (int i = 0; i < size; i++) {
				System.out.println("Add the details");
				list.add(new Response_Class(s.nextInt(), s.next()));
			}
			Predicate<Response_Class> pred = ab -> ab.response_type.equals("JSON") && ab.status_code == 400;
			ArrayList<Response_Class> Response_List = new ArrayList<Response_Class>();
			for (Response_Class ab : list) {
				if (pred.test(ab)) {
					Response_List.add(ab);
				}
			}
			System.out.println(Response_List);
		}

	}

	public void response_Type_JSON_Or_Status_Code_400() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Choose the number of items to be checked:");
			int size = s.nextInt();
			ArrayList<Response_Class> list = new ArrayList<Response_Class>();
			for (int i = 0; i < size; i++) {
				System.out.println("Add the details");
				list.add(new Response_Class(s.nextInt(), s.next()));
			}
			Predicate<Response_Class> predicate = ab -> ab.response_type.equals("JSON");
			Predicate<Response_Class> predicate1 = ab -> ab.status_code == 400;
			ArrayList<Response_Class> Response_List = new ArrayList<Response_Class>();
			for (Response_Class ab : list) {
				if (predicate.or(predicate1).test(ab)) {
					Response_List.add(ab);
				}
			}
			System.out.println(Response_List);
		}

	}

	public void response_Type_JSON_And_Status_Code_Is_Not_400() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Choose the number of items to be checked:");
			int size = s.nextInt();
			ArrayList<Response_Class> list = new ArrayList<Response_Class>();
			for (int i = 0; i < size; i++) {
				System.out.println("Add the details");
				list.add(new Response_Class(s.nextInt(), s.next()));
			}
			Predicate<Response_Class> pred = ab -> ab.response_type.equals("JSON") && !(ab.status_code == 400);
			ArrayList<Response_Class> Response_List = new ArrayList<Response_Class>();
			for (Response_Class ab : list) {
				if (pred.test(ab)) {
					Response_List.add(ab);
				}
			}
			System.out.println(Response_List);
		}

	}

	public static void main(String[] args) {

		Predicates predicates = new Predicates();
		predicates.products_greater_1000();
		predicates.electronics_Category();
		predicates.products_Greater_Than_100_And_In_Electronic_Category();
		predicates.product_Greater_100_Or_In_Electronic_Category();
		predicates.products_Less_Than_100_And_In_Electronic_Category();
		predicates.status_Code_Is_400();
		predicates.response_Type_JSON();
		predicates.response_Type_JSON_And_Status_Code_400();
		predicates.response_Type_JSON_Or_Status_Code_400();
		predicates.response_Type_JSON_And_Status_Code_Is_Not_400();
	}

}
