package org.hometask.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LambdaExpression {

	public void stringPalindrome(String s1) {
		String rev = "";
		char[] c1 = s1.toCharArray();
		for (int i = c1.length - 1; i >= 0; i--) {

			rev += c1[i];
		}
		System.out.println("Reverse of the String " + s1 + " is :" + rev);
		if (rev.equals(s1)) {
			System.out.println("The String " + s1 + " is Pallindrome as it is matched with Reverse " + rev);
		} else
			System.out.println("The String " + s1 + " is not a Pallindrome as it is not matched with Reverse " + rev);
	}

	public void secondHighestInList() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(14);
		list.add(12);
		list.add(7);
		list.add(8);
		list.add(19);
		list.add(11);
		System.out.println("Before Sorting " + list);
		
		Collections.sort(list);
		System.out.println("After Sorting " + list);
		
		int secondHighestNum = list.get(list.size() - 2);
		System.out.println("Second Highest Number of the list is: " + secondHighestNum);

	}

	public void secondHighestInListWithLambda() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(14);
		list.add(12);
		list.add(7);
		list.add(8);
		list.add(19);
		list.add(11);
		System.out.println("Before Sorting " + list);
		
		Collections.sort(list, (T1, T2) -> (T1 < T2) ? 1 : (T1 > T2) ? -1 : 0);
		System.out.println("After Sorting " + list);
		System.out.println("Second Largest " + list.get(1));
	}

	public void stringRotation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("Second string is not a rotation of first string");
		} else {

			str1 = str1.concat(str1);

			if (str1.indexOf(str2) != -1)
				System.out.println("Second string " + str2 + " is a rotation of first string ");
			else
				System.out.println("Second string " + str2 + " is not a rotation of first string");
		}
	}

	public void stringRotationWithLambda() {
		Interface_String i = (str1, str2) -> {
			str1 = str1.concat(str1);
			if (str1.contains(str2))
				System.out.println("true");
			else
				System.out.println("false");

		};
		i.rotation("abcde", "deabc");

	}

	public void newThread() {
		System.out.println("How may numbers to be printed:");
		int number = 5;
		Thread thread = new Thread(() -> {
			for (int i = 0; i <= number; i++) {
				System.out.println(i);
			}
		}
		);
		thread.start();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void comperatorInterfaceSortReverseOrder() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(14);
		list.add(12);
		list.add(7);
		list.add(8);
		list.add(19);
		list.add(11);
		System.out.println("Original list : " + list);
		Comparator c = Collections.reverseOrder();
		Collections.sort(list, c);
		System.out.println("Sorted list using Comparator : " + list);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void comperatorInterfaceSortAlphabeticalOrder() {
		ArrayList<Character> list = new ArrayList<>();
		list.add('C');
		list.add('Q');
		list.add('A');
		list.add('L');
		list.add('H');
		list.add('E');
		list.add('Y');
		System.out.println("Original list : " + list);
		Comparator c = Collections.reverseOrder();
		Collections.sort(list, c);
		System.out.println("Sorted list using Comparator : " + list);

	}

	public void treesetNumbersReverse() {
		TreeSet<Integer> treeset = new TreeSet<>();
		treeset.add(1);
		treeset.add(14);
		treeset.add(12);
		treeset.add(7);
		treeset.add(8);
		treeset.add(19);
		treeset.add(11);
		System.out.println("Treeset values are before sorting into Reverse order: " + treeset);

		TreeSet<Integer> revtreeset = (TreeSet<Integer>) treeset.descendingSet();
		System.out.println("Treeset values are after sorting into Reverse order: " + revtreeset);
	}

	public void treesetAlphabetReverseOrder() {
		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("Kranthi");
		treeset.add("Veer");
		treeset.add("EPAM");
		treeset.add("Tummuri");
		treeset.add("Testing");
		treeset.add("Automation");

		System.out.println("Treeset values are before sorting into Reverse order: " + treeset);
		TreeSet<String> revtreeset = (TreeSet<String>) treeset.descendingSet();
		System.out.println("Treeset values are after sorting into Reverse order: " + revtreeset);
	}

	public void treeMapNumberReverseOrder() {
		TreeMap<String, String> treemap = new TreeMap<>();
		treemap.put("1", "Welcome");
		treemap.put("2", "to");
		treemap.put("3", "Epam");
		treemap.put("6", "Sytems");
		treemap.put("5", "Kranthi");
		treemap.put("4", "Veer");

		NavigableMap<String, String> nvagiateMap = treemap.descendingMap();
		System.out.println("Tree Map sorting check in descending order " + nvagiateMap);
	}

	@SuppressWarnings("rawtypes")
	public void treeMapEmployeesReverseOrder() {
		TreeMap<String, String> treemap = new TreeMap<>();
		treemap.put("Employee1", "Welcome");
		treemap.put("Employee5", "to");
		treemap.put("Employee3", "Epam");
		treemap.put("Employee4", "Sytems");
		treemap.put("Employee2", "Kranthi");
		treemap.put("Employee6", "Veer");

		NavigableMap nvagiateMap = treemap.descendingMap();
		System.out.println("Tree Map sorting check in descending order " + nvagiateMap);
	}

	public void employeeSortWithCollectionsSort() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Employee1");
		list.add("Employee4");
		list.add("Employee5");
		list.add("Employee2");
		list.add("Employee3");
		list.add("Employee6");
		list.add("Employee7");

		Collections.sort(list);
		System.out.println("Sorting of the list is : " + list);
		Collections.reverse(list);
		System.out.println("Sorting of the list in descending order is : " + list);
	}

	public void employeeSortWithCollectionsSortWithJava8() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Employee1");
		list.add("Employee4");
		list.add("Employee5");
		list.add("Employee2");
		list.add("Employee3");
		list.add("Employee6");
		list.add("Employee7");

		List<String> sortedEmployee = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorting of the list is using java 8 : " + sortedEmployee);

		List<String> sortedEmployeeRev = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorting of the list (using reverse order) is using java 8 : " + sortedEmployeeRev);
	}

	public static void main(String[] args) {
		LambdaExpression le = new LambdaExpression();
		le.stringPalindrome("ABAABA");
		le.secondHighestInList();
		le.secondHighestInListWithLambda();
		le.stringRotation("abcde", "deabc");
		le.stringRotationWithLambda();
		le.newThread();
		le.comperatorInterfaceSortReverseOrder();
		le.comperatorInterfaceSortAlphabeticalOrder();
		le.treesetNumbersReverse();
		le.treesetAlphabetReverseOrder();
		le.treeMapNumberReverseOrder();
		le.treeMapEmployeesReverseOrder();
		le.employeeSortWithCollectionsSort();
		le.employeeSortWithCollectionsSortWithJava8();
	}

}
