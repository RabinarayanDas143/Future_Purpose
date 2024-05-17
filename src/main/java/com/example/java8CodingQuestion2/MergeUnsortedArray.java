package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeUnsortedArray {
	public static void main(String[] args) {
		int[] array1 = { 4, 2, 3, 1, 5 };
		int[] array2 = { 7, 8, 6, 9, 10 };

		int[] result = getMergeArray(array1, array2);
		System.out.println(Arrays.toString(result));
	}

	public static int[] getMergeArray(int[] array1, int[] array2) {
		// array1=Arrays.stream(array1).boxed().sorted().collect(Collectors.toList()).stream().mapToInt(i->i.intValue()).toArray();
		// array2=Arrays.stream(array2).boxed().sorted().collect(Collectors.toList()).stream().mapToInt(i->i.intValue()).toArray();
		int[] resultArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
		return resultArray;
	}
}
