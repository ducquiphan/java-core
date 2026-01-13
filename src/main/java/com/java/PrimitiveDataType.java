package com.java;

/**
 * PrimitiveDataType
 *
 * @author Phan Qui Duc
 * @version 1.0
 * @since 2026-01-13
 */
public class PrimitiveDataType {
	public static void main(String[] args) {
		byte a = 116;
		short b = 12310;
		int c = 123123123;
		//		long d = 50000L + (10L * (a + b + c));
		long d = (long) 50000 + (long) (10 * (a + b + c));
		System.out.println("Result: " + d);
	}
}
