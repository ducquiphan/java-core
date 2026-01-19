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
		// Whole number
		byte myByteValue = 116;
		short myShortValue = 12310;
		int myIntValue = 123123123;
		//		long myLongValue = 50000L + (10L * (a + b + c));
		long myLongValue = (long) 50000 + (long) (10 * (myByteValue + myShortValue + myIntValue));
		double e = 10 / 2;
		// 566 in binary (32-bit int): 00000000 00000000 00000010 00110110
		// When you cast an int to a byte, Java simply discards everything except the last 8 bits (the least significant bits).
		// Last 8 bits of 566: 0011011 = 56
		// 566 / 256 = 2 remainder 54
		byte f = (byte) (100 + 466);
		System.out.println("Result of f: " + f);
		System.out.println("Result of myIntValue: " + myIntValue);
		System.out.println("Result of d: " + myLongValue);
		System.out.println("Result of e: " + e);
		
		// Real number
		//		float myFloatValue = 5;
		float myFloatValue = 5f;
		//		double myDoubleValue = 5;
		double myDoubleValue = 5d;
		System.out.println("Result of myFloatValue: " + myFloatValue);
		System.out.println("Result of myDoubleValue: " + myDoubleValue);
		
		//		float myOtherFloatValue = 5.25f;
		float myOtherFloatValue = (float) 5.25;
		System.out.println("Result of myOtherFloatValue: " + myOtherFloatValue);
	}
}
