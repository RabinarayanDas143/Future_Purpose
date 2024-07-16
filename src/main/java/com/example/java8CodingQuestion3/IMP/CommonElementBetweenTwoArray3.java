package com.example.java8CodingQuestion3.IMP;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoArray3 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array2 = { 5, 6, 7, 8, 9, 10 };

		int[] resultArray = getFilterArray(array1, array2);
		System.out.println(Arrays.toString(resultArray));
	}

	private static int[] getFilterArray(int[] array1, int[] array2) {
		Predicate<Integer> p = e -> Arrays.stream(array2).boxed().collect(Collectors.toList()).contains(e);
		int[] filterArray = Arrays.stream(array1).boxed().filter(p).mapToInt(Integer::intValue).toArray();
		int[] filterArray1 = Arrays.stream(array1).boxed().filter(p).collect(Collectors.toList()).stream()
				.mapToInt(e -> Integer.valueOf(e)).toArray();
		return filterArray;
	}
}
