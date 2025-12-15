package com.deloitte.demo.day1.miscellenous;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Start");

		System.out.println("Please enter your name:");

		String name = sc.next();

		System.out.println("Welcome " + name + "!");

		System.out.println("End");

		sc.close();

	}

}
