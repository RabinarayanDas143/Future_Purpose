package com.example.java8CodingQuestion6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenOdd6 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int[] evenArray = Arrays.stream(array).filter(e -> e % 2 == 0).boxed().collect(Collectors.toList()).stream()
				.mapToInt(e -> e).toArray();
		int[] oddArray = Arrays.stream(array).boxed().filter(e -> e % 2 != 0).collect(Collectors.toList()).stream()
				.mapToInt(e -> e).toArray();
		System.out.println("EvenArray :" + Arrays.toString(evenArray));
		System.out.println("OddArray :" + Arrays.toString(oddArray));
	}

}
