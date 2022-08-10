package org.hometask.java8.premitive_interface;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class Square_Number {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			IntConsumer intc = ab -> System.out.println("Square of the entered number is "+ab * ab);
			intc.accept(s.nextInt());
		}
	}
}
