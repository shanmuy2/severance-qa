package com.verizon.hcm.severance.automation.config;

public class PracticeJavaTest {

	private void firstMethod() {
		System.out.println("First Method is executed testing is done");
		System.out.println("First Method is executed testing 1 is done");
		System.out.println("First Method is executed testing 2 is done");
		System.out.println("First Method is executed testing 3 is done");
	}
	
	private void thirdMethod() {
	
		System.out.println("First Method is executed testing 3 is done");
	}
	
	private void FourthMethod() {
	
		System.out.println("First Method is executed testing 4 is done");
	}

	public static void main(String[] args) {
		PracticeJavaTest objectName = new PracticeJavaTest();
		objectName.firstMethod();
	}
}
