package com.java.StringDefaultMethods;

// Method 4: codePointCount(): Returns the number of unicode value in a String
public class Method4 {

	public static void main(String[] args) {

		String str = "Nishanth";

		int value = str.codePointCount(0, 8);

		System.out.println(value);

	}

}
