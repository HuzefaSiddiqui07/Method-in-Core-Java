// Return Method with Using toString Method
package com.method2;

public class Student {

	// Initialization
	int rollno = 92;
	String name = "Ram";
	String address = "Mumbai";

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

	// Create a return type method
	public Student getStudent() {
		// Create an Object
		Student std = new Student();

		System.out.println(std);

		return std;

	}

	public static void main(String[] args) {

		// Create an Object
		Student student = new Student();

		student.getStudent();
	}
}
