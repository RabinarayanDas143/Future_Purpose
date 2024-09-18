package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenOdd5 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int[] evenArray = Arrays.stream(array).boxed().filter(e -> e % 2 == 0).collect(Collectors.toList()).stream()
				.mapToInt(e -> e).toArray();
		System.out.println(Arrays.toString(evenArray));
		
		int[] oddArray = Arrays.stream(array).boxed().filter(e -> e % 2 != 0).collect(Collectors.toList()).stream()
				.mapToInt(e -> e).toArray();
		System.out.println(Arrays.toString(oddArray));
	}

}
