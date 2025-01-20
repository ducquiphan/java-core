package com.java;

import java.util.List;

/**
 * Structured
 *
 * @author Admin
 * @version 1.0
 * @since 2025-01-20
 */
public class Structured {
	public static void main(String[] args) {
		printAllNumbersInListStructured(List.of(12, 45, 3, 5, 2));
	}
	
	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
