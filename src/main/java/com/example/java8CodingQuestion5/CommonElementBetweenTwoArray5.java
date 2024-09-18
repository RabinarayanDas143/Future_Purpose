package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoArray5 {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 3, 4, 5, 6, 7, 8 };

		Predicate<Integer> preditcate = e -> Arrays.stream(array1).boxed().collect(Collectors.toList()).contains(e);
		int[] array = Arrays.stream(array2).boxed().filter(preditcate).collect(Collectors.toList()).stream()
				.mapToInt(e -> e).toArray();

		System.out.println(Arrays.toString(array));
	}

}
