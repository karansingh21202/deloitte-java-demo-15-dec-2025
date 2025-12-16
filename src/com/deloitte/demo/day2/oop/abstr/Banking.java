package com.deloitte.demo.day2.oop.abstr;

public class Banking {

}

abstract class Rbi {

	public abstract void doKyc();

}

class HdfcBank extends Rbi {

	@Override
	public void doKyc() {
		System.out.println("KYC with Aadhaar");
	}

}

class IciciBank extends Rbi {

	@Override
	public void doKyc() {
		System.out.println("KYC with PAN");
	}
}
