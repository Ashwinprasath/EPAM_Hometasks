package org.hometask.java8.premitive_interface;

import java.util.function.IntPredicate;

public class PrimeNumber {

	public static void main(String[] args) {
		int array[] = { 2, 10, 13, 14, 19 };
		IntPredicate intp = ab -> {
			int temp = 0;
			for (int i = 2; i < ab; i++) {
				if (ab % i == 0) {
					temp++;
				}
			}
			if (temp > 0)
				return false;
			else
				return true;
		};
		for (int number : array) {
			if (intp.test(number)) {
				System.out.println(number + " is prime number");
			}
		}
	}
}
