package com.example.java8CodingQuestion6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArray6 {

	public static void main(String[] args) {
		int[] array1 = { 5, 2, 4, 3, 1 };
		int[] array2 = { 6, 9, 7, 8, 10 };

		int[] result = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(result));
	}

}
