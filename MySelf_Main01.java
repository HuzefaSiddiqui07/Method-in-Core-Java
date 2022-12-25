// Call  Parameterized Constructor Data in Main Method Class

package com.method2;

public class MySelf_Main01 {

	// Create Return type Method
	public static MySelf01 mySelf() {

		// Initialize Values to Declare Variables
		String myName = "Huzefa Siddiqui";
		String myAddress = "Mumbai";
		char myGender = 'M';
		int myAge = 23;
		double myWeight = 65.0;
		long myContactNumber = 8433786334L;

		// Create Return with Parameterized Constructor Object
		return new MySelf01(myName, myAddress, myGender, myAge, myWeight, myContactNumber);
	}

	public static void main(String[] args) {

		// Create Return type Object to call direct Method Name
		MySelf01 myself = mySelf();

		// All Parameterized Variable Names to Call by Object to print on console
		System.out.println("My Name :" + myself.myName);
		System.out.println("My Address :" + myself.myAddress);
		System.out.println("My Gender :" + myself.myGender);
		System.out.println("My Age :" + myself.myAge);
		System.out.println("My Weight :" + myself.myWeight);
		System.out.println("My Contact Number :" + myself.myContactNumber);
	}
}
