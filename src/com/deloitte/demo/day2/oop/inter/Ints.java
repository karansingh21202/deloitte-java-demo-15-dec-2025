package com.deloitte.demo.day2.oop.inter;

public class Ints {

}

interface IntOne {

	public abstract void absMethod();

	public abstract void anotherAbsMethod();

	public default void defMethod() {
		System.out.println("default method in interface");

	}

	public static void statMethod() {
		System.out.println("static method in interface");
	}

}

class ClassOne implements IntOne {

	@Override
	public void absMethod() {
		System.out.println("abstract methd implemented in concrete class");

	}

	@Override
	public void anotherAbsMethod() {
		System.out.println("Another abstract method");
	}

}
