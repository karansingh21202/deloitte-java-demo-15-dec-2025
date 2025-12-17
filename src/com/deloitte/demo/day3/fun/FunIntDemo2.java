package com.deloitte.demo.day3.fun;

public class FunIntDemo2 {

	public static void main(String[] args) {

//		Gst obj = (double a, double b) -> {
//			return a * b;
//		};

//		Gst obj2 = (double a, double b) -> a * b;
//
//		double amount = obj2.getGst(100, 18);
//
//		System.out.println(amount);

//		// full syntax
//		FixedGst obj3 = (double amount) -> {
//			return amount * 18;
//		};

//		// short syntax 
//		FixedGst obj3 = (double d) ->  d * 18;

		// shortest syntax
		FixedGst obj3 = d -> d * 18;

		double amount2 = obj3.getGst(100);

		System.out.println(amount2);

	}

}
