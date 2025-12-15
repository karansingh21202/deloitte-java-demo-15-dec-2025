package com.deloitte.demo.day1.fundas;

public class SwitchDemo {

	public static void main(String[] args) {

		// program to convert numbers from digits to words

		System.out.println("Start");

		int input = 4; // one

		switch (input) {

//		if (input == 1)

		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("Other");
		}
		System.out.println("End");

	}

}
