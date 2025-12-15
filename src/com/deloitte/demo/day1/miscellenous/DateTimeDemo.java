package com.deloitte.demo.day1.miscellenous;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	// print current time and date

	public static void main(String[] args) {

		LocalDateTime atPresent = LocalDateTime.now();

		System.out.println(atPresent);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");

		String printStuff = atPresent.format(formatter);

		System.out.println(printStuff);

	}

}
