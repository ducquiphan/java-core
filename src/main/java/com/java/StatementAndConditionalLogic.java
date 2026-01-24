package com.java;

/**
 * StatementAndConditionalLogic
 *
 * @author Phan Qui Duc
 * @version 1.0
 * @since 2026-01-24
 */
public class StatementAndConditionalLogic {
	public static void main(String[] args) {
		lessonTernaryOperator();
		lessonPrecedenceOperator();
	}
	
	static void lessonTernaryOperator() {
		System.out.println("---------------------");
		System.out.println("lessonTernaryOperator: ");
		String makeOfCar = "Lamborghini";
		//		boolean isDomesticCar = makeOfCar == "Lamborghini" ? false : true;
		boolean isDomesticCar = (makeOfCar != "Lamborghini");
		if (isDomesticCar) {
			System.out.println("This is car is domestic in our country");
		}
		String result = isDomesticCar ? "This car is domestic" : "This car is not domestic";
		System.out.println(result);
		System.out.println();
	}
	
	static void lessonPrecedenceOperator() {
		System.out.println("---------------------");
		System.out.println("lessonPrecedenceOperator: ");
		double firstDoubleNum = 20.00d;
		double secondDoubleNum = 80.00d;
		double result = (firstDoubleNum + secondDoubleNum) * 100.00d;
		System.out.println("Result is: " + result);
		double remainder = result % 40.00d;
		System.out.println("Remainder is: " + remainder);
		boolean isDividedBy40 = remainder == 0;
		System.out.println("isDividedBy40: " + isDividedBy40);
		if (!isDividedBy40) {
			System.out.println("Got some remainder");
		}
		System.out.println();
	}
}
