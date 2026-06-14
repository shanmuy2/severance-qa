package com.verizon.hcm.severance.automation.javacourse;

import java.util.Scanner;

public class ConditionStatementActivities {

	public static void main(String[] args) {
		
	
	Scanner in = new Scanner(System.in);
	System.out.println("give the input1");
	int input1 = in.nextInt();
	
	System.out.println("give the input2");
	int input2 = in.nextInt();
	
	System.out.println("give the input3");	
	int input3 = in.nextInt();
	
	if(input1>input2&&input1>input3) {
		
	System.out.println("print"+input1);
	
	}else if(input2>input3&&input2>input1){
		System.out.println("print"+input2);
		
	}else {
		
		
	System.out.println("print"+input3);
	
	}}
}