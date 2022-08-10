package org.hometask.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class All_Collections {

	// a. ArrayList
	public void arrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// b. LinkedList
	public void linkedList() {
		LinkedList<String> li = new LinkedList<>();
		li.add("Ravi");
		li.add("Vijay");
		li.add("Ravi");
		li.add("Ajay");
		Iterator<String> itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// c. HashSet
	public void hashSet() {

		HashSet<String> hs = new HashSet<>();
		hs.add("Ravi");
		hs.add("Vijay");
		hs.add("Ravi");
		hs.add("Ajay");

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// d. LinkedHashSet
	public void linkedHashSet() {

		LinkedHashSet<String> ls = new LinkedHashSet<>();
		ls.add("Ravi");
		ls.add("Vijay");
		ls.add("Ravi");
		ls.add("Ajay");

		Iterator<String> itr = ls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// e. TreeSet
	public void treeSet() {

		TreeSet<String> ts = new TreeSet<>();
		ts.add("Ravi");
		ts.add("Vijay");
		ts.add("Ravi");
		ts.add("Ajay");

		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// f. HashMap
	public void hashMap() {

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Java", 8);
		hm.put("Python", 3);
		hm.put("JavaScript", 1);

		for (Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	// g. LinkedHashMap
	public void linkedHashMap() {

		LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
		lm.put("Python", 3);
		lm.put("Java", 8);
		lm.put("JavaScript", 1);
		

		for (Entry<String, Integer> entry : lm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	// h. TreeMap
	public void treeMap() {

		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("Java", 8);
		tm.put("Ruby", 1);
		tm.put("Python", 3);

		for (Entry<String, Integer> entry : tm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
