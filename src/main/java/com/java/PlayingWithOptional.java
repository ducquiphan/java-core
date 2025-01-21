package com.java;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * PlayingWithOptional
 *
 * @author Admin
 * @version 1.0
 * @since 2025-01-20
 */
public class PlayingWithOptional {
	public static void main(String[] args) {
		List<String> fruits = List.of("Apple", "Banana", "Orange", "Grapes");
		Predicate<? super String> predicate = fruit -> fruit.startsWith("c");
		Optional<String> optional = fruits.stream().filter(predicate).findFirst();
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		Optional<String> fruit = Optional.of("Apple");
		Optional<String> empty = Optional.empty();
	}
	
}
