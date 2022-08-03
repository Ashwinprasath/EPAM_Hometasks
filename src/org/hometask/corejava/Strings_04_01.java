package org.hometask.corejava;

import java.util.LinkedHashSet;
import java.util.Set;

public class Strings_04_01 {

	public static void main(String[] args) {

		String s = "Hello";
		StringBuilder sb = new StringBuilder();
		Set<Character> se = new LinkedHashSet<>();

		for (int i = 0; i < s.length(); i++) {
			se.add(s.charAt(i));
		}
		for (Character c : se) {
			sb.append(c);
		}
		System.out.println(sb);
	}

}
