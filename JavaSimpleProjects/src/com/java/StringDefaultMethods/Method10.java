package com.java.StringDefaultMethods;

// copyValueOf(): Returns a String that represents the characters of the char array.
//================
// This method returns a new string array and copies the characters into it.

// Syntax: 
//=========================================================================

// public static String copyValueOf(char[] data, int offset, int count)

//  char[] data :  A char Aarray

//  offset      : An int value , representing the start index of the character array.

//  count       : An int value , representng the length of the char array.


public class Method10 {
	
	public static void main(String[] args) {
		
		char[] str = {'N', 'I', 'S','H', 'A','N','T','H'};
		
		String str1 = "";
		str1 =str1.copyValueOf(str, 0, 7);
		
		System.out.println("Returned String is : " +str1);
		
		
	}

}
