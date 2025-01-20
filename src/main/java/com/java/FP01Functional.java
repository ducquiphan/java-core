package com.java;

import java.util.List;

/**
 * Structured
 *
 * @author Admin
 * @version 1.0
 * @since 2025-01-20
 */
public class FP01Functional {
	public static void main(String[] args) {
		printAllNumbersInListFunctional(List.of(12, 45, 3, 5, 2));
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// Convert Array into a stream of numbers
		// From [12, 45, 3, 5, 2]
		// into 12
		// 45
		// 3
		// 5
		// 2
		
		// What to do
		// Using method reference (Class_name::method_name)
		numbers.stream().forEach(System.out::println);
		
		// How to loop the numbers
		//		for (int number : numbers) {
		//			System.out.println(number);
		//		}
		
		
	}
}
