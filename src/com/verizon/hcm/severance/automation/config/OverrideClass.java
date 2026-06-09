package com.verizon.hcm.severance.automation.config;

public class OverrideClass extends AbstractClass{

	@Override
	public void sample() {
		System.out.println("sample");
	}

	@Override
	public void sample1() {
		System.out.println("sample1");
	}

	@Override
	public void sample2() {
		System.out.println("sample2");
	}
public static void main(String[] args) {
	OverrideClass oc = new OverrideClass();
	oc.sample();
	oc.sample1();
	oc.sample2();
	oc.sample3();
	AbstractClass.sample3();
}
}
