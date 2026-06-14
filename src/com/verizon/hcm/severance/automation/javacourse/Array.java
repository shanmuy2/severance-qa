package com.verizon.hcm.severance.automation.javacourse;

public class Array {

	// Array is storing multiple values of similar data types in single variable
//
//its index based
//index starts from 0 to n-1
//it is fixed in size

	public static void main(String[] args) {
		String a[] = new String[3];

		a[0] = "Yespal";
		a[1] = "Sagana";
		a[2] = "dhodho";
		// int length = a.length;
		/*for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}*/
	
	for(String x:a) {
		
		System.out.println(x);
	}
		
		
	}
}
