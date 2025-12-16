package com.deloitte.demo.day2.oop.inherit;

public class Inherit {

}

class Phone {

	public void call() {
		System.out.println("call");
	}

	public void sms() {
		System.out.println("sms");
	}

}

class FeaturePhone extends Phone {

	public void music() {
		System.out.println("music");
	}

}

class SmartPhone extends FeaturePhone {

	@Override
	public void music() {
		System.out.println("dolby music");
	}

}