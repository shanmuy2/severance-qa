package com.verizon.hcm.severance.automation.javacourse;

public class JumpingStatement {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {

			if (i == 2) {
				//break;
				//continue;
				System.exit(0);
			}
			System.out.println("print" + i);
		}
	}
}
