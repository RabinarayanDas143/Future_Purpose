package com.example.java8CodingQuestion6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindFirstAndLast3Number6 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] first3Number = Arrays.stream(array).sorted().limit(3).boxed().collect(Collectors.toList()).stream()
				.mapToInt(e -> e).toArray();
		int[] last3Number = Arrays.stream(array).boxed().sorted((a, b) -> b - a).limit(3).collect(Collectors.toList())
				.stream().mapToInt(e -> e).toArray();
		System.out.println("First3Num :" + Arrays.toString(first3Number));
		System.out.println("Last3Num :" + Arrays.toString(last3Number));
	}

}
