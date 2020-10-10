package com.java.StringDefaultMethods;

//Method 3 : codePointBefore() : Returns the unicode of the character before the specified index
public class Method3 {

	public static void main(String[] args) {

		String str = "Nishanth";

		int value = str.codePointBefore(1);

		System.out.println(value);

	}

}
