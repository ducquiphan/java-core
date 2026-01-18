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
		double e = 10 / 2;
		// 566 in binary (32-bit int): 00000000 00000000 00000010 00110110
		// When you cast an int to a byte, Java simply discards everything except the last 8 bits (the least significant bits).
		// Last 8 bits of 566: 0011011 = 56
		// 566 / 256 = 2 remainder 54
		byte f = (byte) (100 + 466);
		System.out.println("Result of f: " + f);
		System.out.println("Result of c: " + c);
		System.out.println("Result of d: " + d);
		System.out.println("Result of e: " + e);
	}
}
