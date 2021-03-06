package com.generics;

import java.util.*;

public class findMax<E extends Comparable<E>> {
	E[] elements;

	public findMax(E[] elements) {
		this.elements = elements;
	}

	public static <E extends Comparable> E comparesion(E[] elements) {
		Arrays.sort(elements);
		int lenght = elements.length;
		E max = elements[lenght - 1];
		return max;
	}

	public static void main(String[] args) {
		Integer[] max_int_number = { 11, 822, 55, 800, 44, 87, 1000, 558 };
		System.out.println("Maximum integer value is: " + comparesion(max_int_number));

		Double[] max_double_number = { 1.6, 87.8, 82.8, 80.2, 4.8 };
		System.out.println("Maximum double value is: " + comparesion(max_double_number));

		String[] max_string_number = { "A", "A", "C", "B", "N" };
		System.out.println("Maximum string number  is: " + comparesion(max_string_number));

	}
}