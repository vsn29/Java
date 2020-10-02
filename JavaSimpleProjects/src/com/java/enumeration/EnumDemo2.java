package com.java.enumeration;

//Let us see another example of Java enum where we are using 
//value(), valueOf(), and ordinal() methods of Java enum.

public class EnumDemo2 {

	//Define Enum within class
	public enum Seasons{SUMMER,WINTER,SPRING,FALL}
	
	//Creating the main class
	public static void main(String[] args) {
	
		//Traversing the enum
		
		for(Seasons s: Seasons.values()){
			
			System.out.println(s);
		}
		
		System.out.println("Value of WINTER is: "+Seasons.valueOf("WINTER"));  
		System.out.println("Index of WINTER is: "+Seasons.valueOf("WINTER").ordinal());  
		System.out.println("Index of SUMMER is: "+Seasons.valueOf("SUMMER").ordinal());  
		
	}
	
}
