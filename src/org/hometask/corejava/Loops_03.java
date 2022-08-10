package org.hometask.corejava;

import java.util.Scanner;

public class Loops_03 {

	int i, j, startsWith = 0;
	static int Number, x;

	public void forLoop() {

		for (i = 0; i < Number; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(startsWith + " ");
				startsWith = startsWith + x;
			}
			System.out.println();
		}
	}

	public void whileLoop() {

		int i = 1;
		while (i <= Number) {
			int j = 1;
			while (j <= i) {
				System.out.print(startsWith + " ");
				startsWith = startsWith + x;
				j++;
			}
			i++;
			System.out.println();
		}
	}

	public void doWhileLoop() {

		int i = Number, j;
		do {
			j = i;

			while (j <= Number) {
				System.out.print(startsWith + " ");
				startsWith = startsWith + x;
				j++;
			}
			System.out.println();
			i--;
		} while (i > 0);
	}

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		Loops_03 loops = new Loops_03();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number: ");
		Number = s.nextInt();

		System.out.println("Enter X: ");
		x = s.nextInt();

		loops.forLoop();
//		loops.whileLoop();
//		loops.doWhileLoop();

	}
}
