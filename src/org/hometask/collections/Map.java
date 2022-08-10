package org.hometask.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashMap database = new HashMap();
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			s.nextLine();
			for (int i = 0; i < n; i++) {
				String name = s.nextLine();
				int phone = s.nextInt();
				database.put(name, "" + phone);
				s.nextLine();
			}
			while (s.hasNext()) {
				String str = s.nextLine();
				String phone = (String) database.get(str);
				System.out.println(phone == null ? "Not found" : str + "=" + phone);
			}
		}
	}
}
