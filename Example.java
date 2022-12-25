// Return Method with Using toString Method
package com.method2;

public class Example {

	// Initialize
	int age = 23;
	String name = "Huzefa";
	String city = "Mumbai";

	@Override
	public String toString() {
		return "Example [age=" + age + ", name=" + name + ", city=" + city + "]";
	}

	// Create Method with return type
	public Example test() {
		// Create an Object
		Example exp = new Example();
		System.out.println(exp);
		return exp;
	}

	public static void main(String[] args) {

		// Create an Object for calling return type method
		Example example = new Example();

		// To call method by object
		example.test();

	}

}
