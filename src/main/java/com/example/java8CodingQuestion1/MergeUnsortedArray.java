package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeUnsortedArray {

	public static int[] mergerArray(int[] array1, int[] array2) {
       int[] mergeArray = IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).sorted().distinct().toArray();
       return mergeArray;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 2, 4, 5, 2, 3, 1 };
		int[] array2 = { 6, 8, 7, 9, 6, 9, 10, 6 };
		int[] mergeArray = mergerArray(array1, array2);
		System.out.println(Arrays.toString(mergeArray));
	}
}
