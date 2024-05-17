package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ListOfNumDividedBy5 {

	public static int[] getNumDivideBy5(int[] array) {
		array = Arrays.stream(array).boxed().filter(i -> i % 5 == 0).collect(Collectors.toList()).stream()
				.mapToInt(i -> i.intValue()).toArray();
		return array;
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 23, 45, 67, 34, 11, 6, 9, 70, 33, 55 };
		int[] result = getNumDivideBy5(array);
		System.out.println(Arrays.toString(result));
	}
}
