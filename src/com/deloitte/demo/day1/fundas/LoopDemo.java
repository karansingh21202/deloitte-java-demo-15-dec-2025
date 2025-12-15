package com.deloitte.demo.day1.fundas;

public class LoopDemo {

	public static void main(String[] args) {

//		int num = 1;
//		// while loop == 0 or more iterations
//		while (num <= 10) {
//			System.out.println(num);
//			num++;
//		}
//
//		num = 1;
//		// do while loop == 1 or more iterations
//		do {
//			System.out.println(num);
//			num++;
//		} while (num <= 10);

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}

		String[] friends = { "Sonu", "Monu", "Tonu", "Ponu" };

//////	for loop == fixed number of iterations 
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}

//		for each loop / enhanced for loop 
		for (String friend : friends) {
			System.out.println(friend);
		}

	}

}
