package com.example.java8CodingQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
		int[] intArray = { 1, 3, 4, 2, 5, 7, 4, 7, 8, 4, 2, 9 };
		List<Integer> list = new ArrayList<>();
		for (int i : intArray) {
			list.add(i);
		}

		int findsecondlarges = list.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst().get();
		System.out.println(findsecondlarges);

	}
}
