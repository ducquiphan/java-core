package com.java;

import java.util.List;

/**
 * Structured
 *
 * @author Admin
 * @version 1.0
 * @since 2025-01-20
 */
public class FP01Structured {
	public static void main(String[] args) {
		printAllEvenNumbersInListStructured(List.of(12, 45, 3, 5, 2));
	}
	
	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
	private static void printAllEvenNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}
}
