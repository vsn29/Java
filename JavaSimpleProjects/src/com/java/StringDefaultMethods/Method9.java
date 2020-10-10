package com.java.StringDefaultMethods;

// contentEquals(): Checks whether a strimg contains the exact same sequence of characters of the specified charsequence or StringBuffer.
//=================

//Return Type : boolean

// There are two contentEqual() methods:
//========================================

// 1) public boolean contentEquals(StringBuffer chars)

//        --> StringBuffer chars : The StringBuffer to be searched for

// 2) public boolean contentEquals(CharSequence chars)

//       --> CharSequence chars : The sequence of character to be searched for


public class Method9 {

	
	
	 public static void main(String[] args) {
		
		 String str = "Nishu";
		 
		 System.out.println(str.contentEquals("Nishu"));
		 
		 System.out.println(str.contentEquals("ni"));
		
		 //CharSequence chars : returns true if and only if this String represents he same sequence
		 //                     if characters as specified in the string buffer , otherwise returns false
		 
		System.out.println(str.contentEquals("Nishu"));
		
	    // returns false: 
		
		System.out.println(str.contentEquals("Hi nishanth"));
		 
		 
	}
}
