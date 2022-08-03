package org.hometask.corejava;

import java.util.Scanner;

public class Loops_03 {

	public static void main(String args[]) {
		int i, j, Number, startsWith = 0, x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number: ");
		Number = s.nextInt();

		System.out.println("Enter X: ");
		x = s.nextInt();

		// Generate Pyramid using for loop
		for (i = 0; i < Number; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(startsWith + " ");
				startsWith = startsWith + x;
			}
			System.out.println();
		}
	}
}
