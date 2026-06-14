package com.verizon.hcm.severance.automation.javacourse;

public class MultiDecimalArray {

	public static void main(String[] args) {

		String a[][] = new String[2][3];

		a[0][0] = "test";

		a[0][1] = "test1";

		a[0][2] = "test2";
		a[1][0] = "test3";
		a[1][1] = "test4";
		a[1][2] = "test5";

		for (String[] x : a) {

			for (String y : x) {

				System.out.println(y);
			}
		}

	}

}
