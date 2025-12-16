package com.deloitte.demo.day2.oop.inter;

public class InterDemo {

	public static void main(String[] args) {

		IntOne obj = new ClassOne();
//		ClassOne obj2 = new ClassOne();

		obj.absMethod();
		obj.anotherAbsMethod();
		obj.defMethod();

		IntOne.statMethod();

	}

}
