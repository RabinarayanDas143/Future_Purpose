package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArray {

	public static void main(String[] args) {
		int[] array1 = { 5, 2, 4, 3, 1 };
		int[] array2 = { 6, 9, 7, 8, 10 };

		int[] mergeArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().distinct()
				.map(e -> e).toArray();
		System.out.println(Arrays.toString(mergeArray));
	}

}
