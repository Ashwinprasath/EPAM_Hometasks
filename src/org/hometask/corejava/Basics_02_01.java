package org.hometask.corejava;

import java.util.Scanner;

public class Basics_02_01 {
	public static void main(String[] args) {

		String name;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter your name: ");
			name = sc.next();
		}
		System.out.println("Hello, " + name + "");
	}
}
