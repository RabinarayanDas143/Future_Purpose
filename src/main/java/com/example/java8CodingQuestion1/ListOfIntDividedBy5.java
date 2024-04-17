package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfIntDividedBy5 {

	public static List<Integer> getIntDivBy5(int[] array) {
		List<Integer> list = Arrays.stream(array).boxed().filter(i -> i % 5 == 0).collect(Collectors.toList());
		return list;
	}

	public static void main(String[] args) {
		int[] intArray = { 1, 3, 2, 10, 15, 12, 14, 98, 15, 13, 20, 25 };
		List<Integer> list = getIntDivBy5(intArray);
		System.out.println(list);
	}
}
