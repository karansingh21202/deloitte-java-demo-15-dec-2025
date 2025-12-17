package com.deloitte.demo.day3.ex;

// throw 

public class ThrowDemo {

	public static void main(String[] args) {

		try {
			ThrowDemo.checkAge(17);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

	static void checkAge(int age) {
		if (age < 18)
			throw new RuntimeException("Voting age >= 18");
		else
			System.out.println("You are eligible to vote.");
	}

}
