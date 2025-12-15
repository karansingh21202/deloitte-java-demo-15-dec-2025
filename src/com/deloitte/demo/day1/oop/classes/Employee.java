package com.deloitte.demo.day1.oop.classes;

// entity == class 
public class Employee {

	// attributes == variables / fields
	// instance fields == belong to object
//	access using - objectName.fieldName
	int id;
	String name;
	double salary;

	// static fields == belong to class
//	access using - ClassName.fieldName
	static long officePhone;
	static String officeAddress;

	// functionalities == methods

	void work() {
		System.out.println("Employee is working...");

	}

}
