package com.generics;

import java.util.Scanner;

public class findMaxNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value :: ");
		Integer firstNumber = sc.nextInt();
		Integer secondNumber = sc.nextInt();
		Integer thirdNumber = sc.nextInt();
		System.out.println("1st number is :: " + firstNumber);
		System.out.println("2nd number is :: " + secondNumber);
		System.out.println("3rd number is :: " + thirdNumber);
		Integer maxNumber = comparesion(firstNumber, secondNumber, thirdNumber);
		System.out.println("Maximum value is :: " + maxNumber);
	}

	private static Integer comparesion(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer max = firstNumber;
		if (secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		if (thirdNumber.compareTo(max) > 0) {
			max = thirdNumber;
		}
		return max;
	}

}
