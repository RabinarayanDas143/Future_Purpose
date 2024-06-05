package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeUnsortedArray2 {
	public static void main(String[] args) {
		int[] array1 = { 5, 2, 3, 4, 1, 3, 4 };
		int[] array2 = { 6, 9, 7, 8, 6, 7, 10, 9 };

		int[] mergeArray = getMergeArray(array1, array2);
		System.out.println(Arrays.toString(mergeArray));
	}

	private static int[] getMergeArray(int[] array1, int[] array2) {
		int[] mergeArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).boxed().sorted().distinct()
				.collect(Collectors.toList()).stream().mapToInt(n -> n).toArray();
		return mergeArray;
	}
}
