package com.generics;

import java.util.Scanner;

public class findMax<E extends Comparable> {
	E x, y, z;

	public findMax(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static <E extends Comparable> E comparesion(E x, E y, E z) {
	    E max = x;
	        if (y.compareTo(max) > 0) {
	            max = y;
	        }
	        if (z.compareTo(max) > 0) {
	            max = z;
	        }
	    return max;
	}

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//-----------get float value from user ---------
		System.out.println("enter the float value :: ");
		Float firstNumber = sc.nextFloat();
		Float secondNumber = sc.nextFloat();
		Float thirdNumber = sc.nextFloat();
		System.out.println("1st number is :: " + firstNumber);
		System.out.println("2nd number is :: " + secondNumber);
		System.out.println("3rd number is :: " + thirdNumber);
		Float maxNumber = comparesion(firstNumber, secondNumber, thirdNumber);
		System.out.println("Maximum value is :: " + maxNumber);
		System.out.println(" ");
		//------ get integer value form user -------------
		System.out.println("enter the integer value :: ");
		Integer first_Number = sc.nextInt();
		Integer second_Number = sc.nextInt();
		Integer third_Number = sc.nextInt();
		System.out.println("1st number is :: " + first_Number);
		System.out.println("2nd number is :: " + second_Number);
		System.out.println("3rd number is :: " + third_Number);
		Integer max_Number = comparesion(first_Number, second_Number, third_Number);
		System.out.println("Maximum value is :: " + max_Number);
		System.out.println(" ");
		//------get string value from user-------------
		System.out.println("enter the String :: ");
		String first_String_Number = sc.next();
		String second_String_Number = sc.next();
		String third_String_Number = sc.next();
		System.out.println("1st number is :: " + first_String_Number);
		System.out.println("2nd number is :: " + second_String_Number);
		System.out.println("3rd number is :: " + third_String_Number);
		String max_String_Number = comparesion(first_String_Number, second_String_Number, third_String_Number);
		System.out.println("Maximum value is :: " + max_String_Number);
		

	}
}