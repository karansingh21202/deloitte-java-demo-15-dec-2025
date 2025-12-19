package com.deloitte.demo.day4.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(30);
		set.add(40);

		System.out.println(set);
		System.out.println(set.size());

		// find and use other methods 
		System.out.println("Contains 20? " + set.contains(20));
		set.remove(10);
		System.out.println("After removing 10: " + set);
		System.out.println("Is empty? " + set.isEmpty());
		set.clear();
		System.out.println("After clear, size: " + set.size());

	}

}
