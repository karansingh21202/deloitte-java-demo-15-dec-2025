package com.deloitte.demo.day1.oop.constr;

public class Employee {

	int id;
	String name;
	double salary;

	Employee() {
		System.out.println("default constructor called.");
	}

	Employee(int id, String name, double salary) {
		System.out.println("parameterized constructor called.");
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

}

// constructor - 
// is a special type of method 
// does not have return type 
// needed to create an object
// by default, JVM provides one default constructor
// we can create one or more constructors 
// if we create a constructor then JVM will not provide default constructor 
// one class can have one or more constructors 
// 