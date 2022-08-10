package org.hometask.java8.consumer_supplier;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Upgrading_Name_Of_The_Product_Suffixed {

	public static void productNames(ArrayList<Products> arrlist) {
		arrlist.add(new Products("Fan", 350, "Electrical", 'A'));
		arrlist.add(new Products("Samsung", 10060, "Electronics", 'A'));
		arrlist.add(new Products("Paracetamol", 299, "Medical", 'C'));
		arrlist.add(new Products("TATA", 100000, "Automobile", 'A'));
		arrlist.add(new Products("ExpressBee", 2509, "Transport", 'D'));
		arrlist.add(new Products("Axis", 50900, "Banking", 'A'));
	}
	
public static void main(String[] args) {
		
		ArrayList<Products> al= new ArrayList<>();
		productNames(al);
		Consumer<Products> consumer= c->{
			if(c.price>3000) {
				System.out.println("Before upgrading suffix");
				System.out.println(c.name);
				c.name=c.name.concat(" *");
				System.out.println("After upgrading suffix");
				System.out.println(c.name);
			}
		};
		for(Products ab:al) {
			consumer.accept(ab);
		}
	}
}
