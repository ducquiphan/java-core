package com.java.workflow;

/**
 * KeywordsAndExpressions
 *
 * @author Phan Qui Duc
 * @version 1.0
 * @since 2026-01-25
 */
public class KeywordsAndExpressions {
	public static void main(String[] args) {
		// (100 + 1.609344): This is an expression
		double kilometers = (100 + 1.609344); // This is a statement
		
		int highScore = 50;
		if (highScore > 25) {
			highScore += 1000;
		} // Conditional statement
		
		// Count the number of expressions
		int health = 100;
		if ((health < 25) && (highScore > 1000)) {
			highScore = highScore - 1000;
		}
	}
}
