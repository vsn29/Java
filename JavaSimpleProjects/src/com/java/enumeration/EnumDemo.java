package com.java.enumeration;
//Capgemini Interview Questions and Answers:

//[26-09-2020 : Saturday]
//============================================================================

//1)Enumeration and Typecasting in Java? 

//1)Enumeration :
//====================================================================
//a)The Enum in java is data type which contains fixed set of CONSTANTS.

//b)It can be used for 

//    ->Days of the week (MONDAY,TUESDAY,WEDNESDAY,THURSEDAY,FRIDAY,SATURDAY,SUNDAY)

//	 ->Directions (EAST,WEST,SOUTH,NORTH)

//	 ->Seasons (SPRING,SUMMER,WINTER AUTUMN or FALL)

// 	 ->Colors (RED,BLUE,GREEN,YELLOW etc) etc..

//c)The enum constants are static and final implicitly.

//d)Enums are used to creat data types like classes and it can be defined within the class and outside the class.

//e)Enum class internally inherits the Enum class so it cannot inherit any other class but it can implement many interfaces.

//Advantages of Java Enum:
//====================================================================================
//1) Enum improves the type safety.

//2) Enum can be easily used in switch.

//3) Enum can be traversed 

//4) It can have fields , costructors and methods.

//5) Enum may implement many interface but cannot extend any class because it internally extends 	the Enum class.

public class EnumDemo {

	// Defining the enum inside the class
	public enum Seasons {
		WINTER, SUMMER, AUTUMN, SPRING, FALL
	}

	// Main Method.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Traversing the enum

		for (Seasons s : Seasons.values()) {
			System.out.println(s);
		}

	}

}
