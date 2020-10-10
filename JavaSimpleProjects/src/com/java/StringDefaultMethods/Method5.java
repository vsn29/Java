package com.java.StringDefaultMethods;
//compareTo() :  Compares 2 strings lexicographically.
//============

// Points to Note here are:
//=============================

// 1) Comparison is based on the uncode value of each character in a String.

// 2) The method returns,

//     --> 0 if the String is equal to the other String.

//     --> >0 (Greater than 0) if the String is lexographically greater than the other string.

//     --> <0 (Less than 0) if the String is lexographically  less than the other string.

// 3) use compareToIgnoreCase(): to compare two strings lexongraphically , ignoring lowercase and uppercase differences.

// 4) use equals() method to compare two strings without consideration of unicode values.


public class Method5 {
	
	public static void main(String args[]){
		
		String str1 = "Nishanth";
		
		String str2 = "Nishanth";
		
		String str3 ="Shantabaisssss";
		
		String str4 = "Shantabai";
		
		String str5 = "Shanta";
		
		String str6 = "Shantabai";
		
		//Case 1: Returns 0 if the str1 is equals to str2
		int value= str1.compareTo(str2);
		//Print the value
		System.out.println(" 0 if the string is equal to the other string : " +value);
		
		//Case: Returns >0 if the string is greater than the other string
		
		int value1 =str3.compareTo(str4);
		
		System.out.println(" >0 if the string is greater than the other string :"  +value1);
		
		int value2 =str5.compareTo(str6);
		
		System.out.println(" <0 if the string is greater than the other string :"  +value2);
		
		
	}

}
