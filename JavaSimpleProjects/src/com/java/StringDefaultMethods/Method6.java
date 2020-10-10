package com.java.StringDefaultMethods;
//compareToIgnoreCase(): compares two strings lexographically, by ignoring lower-case and upper-case differences.
//======================

public class Method6 {
	
	public static void main(String[] args) {
		
		String str1 = "Nishanth";
		
		String str2 = "nishanth";
		
		int value = str1.compareToIgnoreCase(str2);
		
		System.out.println(value);
		
		
		
	}

}
