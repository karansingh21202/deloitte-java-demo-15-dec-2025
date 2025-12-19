package com.deloitte.demo.day4.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionIntro {

	public static void main(String[] args) {

		int[] arr = { 95, 97, 96, 98, 99 };
		// stores only one type of data
		// size is fixed
		// type safety

//		ArrayList myList = new ArrayList();
		List myList = new ArrayList();
		System.out.println(myList.size());
		myList.add(10);
		myList.add(20);
		myList.add(30);
		System.out.println(myList);
		System.out.println(myList.size());
		myList.remove(0);
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add(false);
		myList.add("abc");
		myList.add(10.25);
		System.out.println(myList);
		System.out.println(myList.size());

	}

}

// questions 

// 1. difference bw hashset and linkedhashset
// HashSet: Does not maintain any order of elements. It is faster.
// LinkedHashSet: Maintains insertion order of elements using a linked list. Slightly slower.

// 2. bw hashmap and linkedhashmap
// HashMap: No order for keys.
// LinkedHashMap: Maintains insertion order of keys.

// 3. bw vector and stack
// Vector: A legacy class, thread-safe dynamic array.
// Stack: Extends Vector and provides LIFO (Last-In-First-Out) operations like push and pop.

// 4. bw list and set
// List: Ordered collection, allows duplicates, accessible by index.
// Set: Unordered collection, does not allow duplicates.

// 5. what is capacity and its arguments in vector and stack
// Capacity is the total number of elements a Vector/Stack can store before growing.
// Arguments: 
// - initialCapacity: starting size (default 10).
// - capacityIncrement: how much it grows when full (if 0, it doubles).
