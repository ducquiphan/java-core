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
	}
	
	static void lessonTernaryOperator() {
		String makeOfCar = "Lamborghini";
		//		boolean isDomesticCar = makeOfCar == "Lamborghini" ? false : true;
		boolean isDomesticCar = (makeOfCar != "Lamborghini");
		if (isDomesticCar) {
			System.out.println("This is car is domestic in our country");
		}
		String result = isDomesticCar ? "This car is domestic" : "This car is not domestic";
		System.out.println(result);
	}
}
