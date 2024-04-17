package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLast3Number {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 7, 3, 8, 4, 5, 6, 2, 3, 9, 8, 5, 1, 2, 4, 10, 4, 10 };

		List<Integer> soredList = Arrays.stream(array).distinct().sorted().boxed().collect(Collectors.toList());
		List<Integer> firstThree = Arrays.stream(array).boxed().distinct().sorted().limit(3)
				.collect(Collectors.toList());
		List<Integer> lastThree = Arrays.stream(array).boxed().distinct().sorted((a, b) -> b - a).limit(3)
				.collect(Collectors.toList());

		System.out.println("First 3 numbers are :" + firstThree + "  and last 3 numbers are :" + lastThree);
	}
}
