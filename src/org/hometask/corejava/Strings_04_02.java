package org.hometask.corejava;

public class Strings_04_02 {

	public static boolean checkForRotation(String s1, String s2) {
		return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);
	}

	public static void main(String[] args) {
		String s1 = "ABACD";
		String s2 = "CDABA";
		System.out.println("The given strings are: " + s1 + "  and  " + s2);
		System.out.println("\nThe concatination of 1st string twice is: " + s1 + s1);

		if (checkForRotation(s1, s2)) {
			System.out.println("The 2nd string " + s2 + "  exists in the new string.");
			System.out.println("\nStrings are rotations of each other");
		} else {
			System.out.println("The 2nd string " + s2 + "  not exists in the new string.");
			System.out.println("\nStrings are not rotations of each other");
		}
	}
}
