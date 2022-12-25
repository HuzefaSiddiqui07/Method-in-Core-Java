// Call  Parameterized Constructor Data in Main Method Class
package com.method2;

public class EmpolyeeMain01 {

	// Create Return type method
	public static Empolyee01 empolyee() {
		// Initialize
		int id = 102;
		return new Empolyee01(id);

	}

	public static void main(String[] args) {

		Empolyee01 e = empolyee();

		System.out.println(e.id);
	}

}
