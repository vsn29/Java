package com.java.StringDefaultMethods;
// Built-in methods of String Class:

//=========================================

//Method 1 : charAt(): Returns the chararcter at the specified index (Position) [Type: char].

public class Method1 {

	public static void main(String args[]) {

		// Define a String
		String str = "Nishanth";
		// Get the Character value at the 1st index
		char c = str.charAt(1);
		// Print the character

		System.out.println("Character at the 1st index is : " + c);
	}
}
