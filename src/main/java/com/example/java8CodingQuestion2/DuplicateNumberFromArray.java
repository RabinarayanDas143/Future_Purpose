package com.example.java8CodingQuestion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class DuplicateNumberFromArray {
	public static int[] getDuplicateFromArray(int[] array) {
		List<Integer> duplicate = new ArrayList<>();
		array = Arrays.stream(array).boxed().filter(e -> duplicate.contains(e) ? duplicate.add(e) : !duplicate.add(e))
				.collect(Collectors.toList()).stream().mapToInt(e -> e.intValue()).toArray();
		return array;
	}

	public static void main(String[] args) {
		int[] array = { 11, 22, 55, 44, 11, 77, 88, 33, 55 };
		int[] duplicateNum = getDuplicateFromArray(array);
		System.out.println(Arrays.toString(duplicateNum));
	}
}
