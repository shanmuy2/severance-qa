package com.verizon.hcm.severance.automation.javacourse;

import java.util.ArrayList;
import java.util.List;

public class Collectionlist {

	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(23);
		l.add(234);
		l.add(1234567);
		l.add(1234567890l);
		l.add(2/3f);
		l.add(3/2d);
		l.add("stringdfd");
		
		l.add('A');
		
		l.add(true);
		
		System.out.println(l.get(8));
		
		
		
	for (Object object : l) {
		
		System.out.println(object);
		
	}
		
		
		
		
		
		
		
	}
}
