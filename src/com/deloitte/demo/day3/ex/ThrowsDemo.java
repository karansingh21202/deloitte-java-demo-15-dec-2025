package com.deloitte.demo.day3.ex;

// throws 

public class ThrowsDemo {

	public static void main(String[] args) {

		try {
			ThrowsDemo.divide(10, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	static void divide(int i, int j) throws ArithmeticException, NumberFormatException {
		int result = i / j;
		System.out.println(result);
	}

}
