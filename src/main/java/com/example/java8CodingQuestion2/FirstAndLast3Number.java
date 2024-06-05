package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstAndLast3Number {
	public static void main(String[] args) {
		int[] array = { 5, 3, 2, 1, 4, 6, 9, 8, 7, 10 };
		int[] first3Num = new int[3];
		int[] last3Num = new int[3];

		first3Num = Arrays.stream(array).boxed().sorted().distinct().limit(3).collect(Collectors.toList()).stream()
				.mapToInt(n -> n).toArray();
		System.out.println("first 3 num :" + Arrays.toString(first3Num));

		last3Num = Arrays.stream(array).boxed().sorted((a, b) -> b - a).distinct().limit(3).collect(Collectors.toList())
				.stream().mapToInt(n -> n).toArray();
		
		System.out.println("Last 3 num :"+Arrays.toString(last3Num));

	}
}
