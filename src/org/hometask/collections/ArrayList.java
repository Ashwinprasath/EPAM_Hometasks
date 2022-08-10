package org.hometask.collections;

import java.util.Scanner;
import java.util.*;

public class ArrayList {

	
	public static void main(String[] args) {


		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String s = sc.nextLine();
			java.util.ArrayList<java.util.ArrayList<String>> a = new java.util.ArrayList<java.util.ArrayList<String>>(n);
			for (int i = 0; i < n; i++) {
			    s = sc.nextLine();
			    a.add(i, new java.util.ArrayList<String>(Arrays.asList(s.split("\\s"))));
			}
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
			    int x = sc.nextInt();
			    int y = sc.nextInt();
			    if (x <= a.size() && y < a.get(x-1).size() && y >= 0) {
			        System.out.println(a.get(x-1).get(y));
			    } else {
			        System.out.println("ERROR!");
			    }
			}
		}	
	}
}
