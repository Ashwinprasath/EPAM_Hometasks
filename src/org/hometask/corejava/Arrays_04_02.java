package org.hometask.corejava;

import java.util.Scanner;

public class Arrays_04_02 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the size of array: ");
			int n = s.nextInt();
			
			System.out.println("Enter " + (n) + " array elements: ");
			int arr[] = new int[n];
			for (int i = 0; i <= n - 1; i++) {
				arr[i] = s.nextInt();
			}

			int smallest = arr[0];
			int largest = arr[0];

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > largest)
					largest = arr[i];
				else if (arr[i] < smallest)
					smallest = arr[i];
			}
			System.out.println("Largest Number is : " + largest);
			System.out.println("Smallest Number is : " + smallest);
		}

	}

}
