package com.method2;

import java.util.Scanner;

public class Arithimetic_03 {

	// Initialization
	int d;
	int s;
	int add = d + s;
	int subtract = d - s;
	int multiply = d * s;

	@Override
	public String toString() {
		return "Arithimetic_03 [d=" + d + ", s=" + s + ", add=" + add + ", subtract=" + subtract + ", multiply="
				+ multiply + "]";
	}

	// Create a return type method
	public Arithimetic_03 user() {
		// Create an object
		Arithimetic_03 obj = new Arithimetic_03();
		System.out.println(obj);
		return obj;
	}

	public static void main(String[] args) {
		// Create Scanner Object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Fisrt Number");
		int store1 = scan.nextInt();

		System.out.println("Enter Second Number");
		int store2 = scan.nextInt();

		System.out.println("Store Fisrt Value :" + store1);
		System.out.println("Store Fisrt Value :" + store2);

		// Create an Object
		Arithimetic_03 obj = new Arithimetic_03();
		obj.user();
	}
}
