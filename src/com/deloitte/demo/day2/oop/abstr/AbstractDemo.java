package com.deloitte.demo.day2.oop.abstr;

public class AbstractDemo {

	public static void main(String[] args) {

//		Calc calc = new Calc();
//		int sum = calc.addNums(10, 20);
//		System.out.println(sum);

//		Rbi rbi = new Rbi();
//		rbi.doKyc();

		HdfcBank bank1 = new HdfcBank();
		bank1.doKyc();
		IciciBank bank2 = new IciciBank();
		bank2.doKyc();
	}

}
