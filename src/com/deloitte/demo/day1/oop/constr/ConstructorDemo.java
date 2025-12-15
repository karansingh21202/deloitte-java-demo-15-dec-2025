package com.deloitte.demo.day1.oop.constr;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.id = 101;
		employee1.name = "Sonu";
		employee1.salary = 10.50;
		System.out.println(employee1.id + " " + employee1.name + " " + employee1.salary);
		
		Employee employee2 = new Employee();
		employee2.id = 102;
		employee2.name = "Monu";
		employee2.salary = 12.25;
		System.out.println(employee2.id + " " + employee2.name + " " + employee2.salary);
		
		Employee employee3 = new Employee(103, "Tonu", 11.75);
		System.out.println(employee3.id + " " + employee3.name + " " + employee3.salary);
		
		
		
		
	}
	

}
