package com.deloitte.demo.day3.fun;

import java.util.function.Function;
import java.util.function.Predicate;

// built in functional interfaces in java

public class JavaBuiltInFunIntsDemo {

	public static void main(String[] args) {

		// 1. test a condition -> Predicate -> test

		// full syntax
//		Predicate<Integer> isEven = (Integer num) -> {
//			return num % 2 == 0;
//		};

		// shortcut
		Predicate<Integer> isEven = num -> num % 2 == 0;
		boolean output = isEven.test(9);
		System.out.println(output);

		// 2. convert input to output

		Function<String, Integer> lengthFun = str -> str.length();

		int length = lengthFun.apply("Sonu");
		System.out.println(length);

	}

}
