package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ListOfIntDivBy5 {
	public static void main(String[] args) {
		int[] array = { 44, 33, 66, 5, 4, 523, 7, 57, 90, 87, 24, 35, 55 };
		int[] divBy5 = getNumDivBy5(array);
		System.out.println(Arrays.toString(divBy5));
	}

	private static int[] getNumDivBy5(int[] array) {
		int[] divBy5 = Arrays.stream(array).boxed().filter(n -> n % 5 == 0).collect(Collectors.toList()).stream()
				.mapToInt(n -> n).toArray();
		return divBy5;
	}
}
