package com.java.typeCasting;

// Typecasting :
//================================================================================

// Definition: Type Casting is When you assign a value of one primitive data type to another type
//============

// Types of Type Casting :
//==========================
// 1) Widening Casting (Automatically) : 
//    ==================================
//  -->Converting a smaller type to a larger type.

//  -->byte-->short-->char-->int-->long-->float-->double


// 2) Narrow Casting ( Manually) :
//   =============================

//  -->Converting a larger type to a smaller type

//  --> double-->float-->long-->int-->char-->short-->byte

public class TypeCastingDemo {
	
	
	public static void main(String args[]){
		
		int intType=29;
		
		//Converting smaller type to larger type
		double typeDouble= intType;
		
		System.out.println(intType);
		System.out.println(typeDouble);
	}

}
