package com.example.java8CodingQuestion6;

import java.util.Arrays;
import java.util.OptionalDouble;

public class FindSumAndAverageFromArray6 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = Arrays.stream(array).boxed().mapToInt(e -> e).sum();
		OptionalDouble average = Arrays.stream(array).boxed().mapToDouble(e -> e).average();

		System.out.println("Sum is :" + sum + " , average is :" + average);

		int sum1 = Arrays.stream(array).boxed().reduce(0, (a, b) -> a + b);
		System.out.println(sum1);
	}

}
