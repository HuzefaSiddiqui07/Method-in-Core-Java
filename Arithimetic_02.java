// Return Method with Using toString Method

package com.method2;

public class Arithimetic_02 {
	// Initialization
	int d = 90;
	int s = 50;
	int add = d + s;
	int subtract = d - s;
	int multiply = d * s;

	@Override
	public String toString() {
		return "Arithimetic_02 [d=" + d + ", s=" + s + ", add=" + add + ", subtract=" + subtract + ", multiply="
				+ multiply + "]";
	}

	// Create a return type method
	public Arithimetic_02 operators() {
		// Create an Object
		Arithimetic_02 obj = new Arithimetic_02();
		System.out.println(obj);
		return obj;
	}

	public static void main(String[] args) {

		// Create an Object
		Arithimetic_02 operation = new Arithimetic_02();
		// Call Method by Object
		operation.operators();

	}

}
