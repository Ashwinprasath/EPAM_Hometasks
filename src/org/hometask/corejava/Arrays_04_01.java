package org.hometask.corejava;

import java.util.Scanner;

public class Arrays_04_01 {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the size of array: ");
			int n = s.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter " + (n-1) + " array elements: ");

			for (int i = 0; i <= n - 2; i++) {
				arr[i] = s.nextInt();
			}

			int sum = (n * (n + 1)) / 2;
			int sumArr = 0;
			for (int i = 0; i <= n - 1; i++) {
				sumArr = sumArr + arr[i];
			}
			int missingNumber = sum - sumArr;
			System.out.println("Missing number is : " + missingNumber);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
