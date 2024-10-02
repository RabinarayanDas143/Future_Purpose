package com.example.InterviewCoding8;

import java.util.Arrays;

public class MergeTwoUnsortedArray8 {

	public static void main(String[] args) {
		int[] array1 = { 5, 1, 4, 2, 3 };
		int[] array2 = { 6, 9, 7, 8, 10 };

		int[] result = getMergeArray(array1, array2);
		System.out.println(Arrays.toString(result));
	}

	private static int[] getMergeArray(int[] array1, int[] array2) {
		array1 = sortArray(array1);
		array2 = sortArray(array2);
		int[] mergeArray = new int[array1.length + array2.length];
		int k = 0;
		for (int i : array1) {
			mergeArray[k] = i;
			k++;
		}
		for (int j : array2) {
			mergeArray[k] = j;
			k++;
		}
		return mergeArray;
	}

	private static int[] sortArray(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					array[i] = array[i] + array[i + 1];
					array[i + 1] = array[i] - array[i + 1];
					array[i] = array[i] - array[i + 1];
					swapped = true;
				}
			}
		} while (swapped);
		return array;
	}

}
