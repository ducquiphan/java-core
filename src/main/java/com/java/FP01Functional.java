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
	
	private static final List<String> courses = List.of("AWS", "Spring", "Spring Boot", "Java", "Python", "API", "Microservices", "Docker",
			"Kubernetes");
	
	public static void main(String[] args) {
		printAllEvenNumbersInListFunctional(List.of(12, 45, 3, 5, 2));
		System.out.println();
		printAllOddNumbersInListFunctional(List.of(12, 45, 3, 5, 2));
		System.out.println();
		printAllCourseIndividually();
		System.out.println();
		printAllCourseContainingSpring();
		System.out.println();
		printAllCourseHasAtLeastFourLetters();
		System.out.println();
	}
	
	//	private static boolean isEven(int number) {
	//		return number % 2 == 0;
	//	}
	
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
	}
	
	private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
				//.filter(FP01Functional::isEven)
				.filter(number -> number % 2 == 0) // Lambda
				.forEach(System.out::println);
	}
	
	private static void printAllOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
				.filter(number -> number % 2 == 1) // Lambda
				.forEach(System.out::println);
	}
	
	private static void printAllCourseIndividually() {
		courses.stream().forEach(System.out::println);
	}
	
	private static void printAllCourseContainingSpring() {
		courses.stream()
				.filter(course -> course.contains("Spring"))
				.forEach(System.out::println);
	}
	
	private static void printAllCourseHasAtLeastFourLetters() {
		courses.stream()
				.filter(course -> course.length() >= 4)
				.forEach(System.out::println);
	}
}
