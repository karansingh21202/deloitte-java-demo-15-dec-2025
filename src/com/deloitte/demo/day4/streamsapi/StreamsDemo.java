package com.deloitte.demo.day4.streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.deloitte.demo.day2.oop.Employee;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>(Arrays.asList(
				new Employee(101, "Sonu", 90000.0),
				new Employee(102, "Monu", 95000.0), 
				new Employee(103, "Tonu", 93000.0),
				new Employee(104, "Sonu", 92000.0)
		));

		System.out.println("All employees:");
		empList.forEach(e -> System.out.println(e.toString()));

		System.out.println("\nEmployees with salary > 92K:");
		
		// Streams API version (modern)
		empList.stream()
			.filter(e -> e.getSalary() > 92000)
			.forEach(e -> System.out.println(e));

		System.out.println("\nEmployees with salary > 92K (using traditional for loop):");

		// Simplified for-loop version (asan tarika)
		for (Employee e : empList) {
			if (e.getSalary() > 92000) {
				System.out.println(e);
			}
		}

	}

}
