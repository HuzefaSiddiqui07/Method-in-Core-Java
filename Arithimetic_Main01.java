// Call  Parameterized Constructor Data in Main Method Class
package com.method2;

public class Arithimetic_Main01 {

	// Create Return type Method
	public static Arithimetic_01 arithimetic() {

		// Initialize Values to Declare Variables
		int v = 60;
		int c = 30;
		int add = v + c;
		int subtract = v - c;
		int multiply = v * c;

		// Create Return with Parameterized Constructor Object
		return new Arithimetic_01(v, c, add, subtract, multiply);

	}

	public static void main(String[] args) {

		// Create Return type Object to call direct Method Name
		Arithimetic_01 arthmtc = arithimetic();

		// All Parameterized Variable Names to Call by Object to print on console
		System.out.println("Value of v is :" + arthmtc.v);
		System.out.println("Value of c is :" + arthmtc.c);
		System.out.println("Addition is :" + arthmtc.add);
		System.out.println("Subtraction is :" + arthmtc.subtract);
		System.out.println("Multiplication is :" + arthmtc.multiply);
	}
}
