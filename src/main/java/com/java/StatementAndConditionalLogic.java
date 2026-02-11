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
		lessonIfElse(10000, 10, 200, true);
		displayHighScorePosition("Duc", calculateHighScorePosition(1500));
		displayHighScorePosition("Duc", calculateHighScorePosition(1000));
		displayHighScorePosition("Duc", calculateHighScorePosition(500));
		displayHighScorePosition("Duc", calculateHighScorePosition(100));
		displayHighScorePosition("Duc", calculateHighScorePosition(25));
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
	
	static void lessonIfElse(int score, int levelCompleted, int bonus, boolean gameOver) {
		System.out.println("---------------------");
		System.out.println("lessonIfElse: ");
		int finalScore;
		if (gameOver) {
			finalScore = calculateScore(score, levelCompleted, bonus);
			System.out.println("Final score: " + finalScore);
		}
		System.out.println();
	}
	
	static int calculateScore(int score, int levelCompleted, int bonus) {
		return score + levelCompleted * bonus;
	}
	
	static void displayHighScorePosition(String playerName, int playerPosition) {
		System.out.println("---------------------");
		System.out.println("displayHighScorePosition: ");
		System.out.println(playerName + " managed to get position " + playerPosition + " on the high score list");
		System.out.println();
	}
	
	static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500) {
			return 2;
		} else if (playerScore >= 100) {
			return 3;
		} else {
			return 4;
		}
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
		long aLong = (long) (a * 1000);
		long bLong = (long) (b * 1000);
		return aLong == bLong;
	}
	
	public static void checkNumber(int number) {
		System.out.println(number > 0 ? "positive" : number < 0 ? "negative" : "zero");
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;
		} else {
			return (long) Math.round(kilometersPerHour * (1.0 / 1.609));
		}
	}
	
	public static void printConversion(double kilometersPerHour) {
		long miles = toMilesPerHour(kilometersPerHour);
		if (miles < 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
		}
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
			return;
		}
		System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes % 1024 + " KB");
	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if ((hourOfDay >= 0 && hourOfDay < 8 && barking) || (hourOfDay > 22 && hourOfDay <= 23 && barking)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) {
			return false;
		} else if ((year % 4 == 0) && (year % 100 != 0)) {
			return true;
		} else if ((year % 100 == 0) && (year % 400 == 0)) {
			return true;
		}
		return false;
	}
	
	public static boolean hasEqualSum(int a, int b, int c) {
		return a + b == c;
	}
	
	public static boolean hasTeen(int a, int b, int c) {
		return isTeen(a) || isTeen(b) || isTeen(c);
	}
	
	public static boolean isTeen(int num) {
		return num >= 13 && num <= 19;
	}
}
