package com.example.InterviewCoding6;

import java.util.Arrays;

public class MergeTwoUnsortedArray6 {

	public static void main(String[] args) {

		int[] array1 = { 5, 2, 4, 3, 1 }, array2 = { 6, 8, 7, 9, 10 };
		int[] mergeArray = getMergeArrayInSorted(array1, array2);
		System.out.println(Arrays.toString(mergeArray));
	}

	private static int[] getMergeArrayInSorted(int[] array1, int[] array2) {
		array1 = getSortArray(array1);
		array2 = getSortArray(array2);
		int i = 0, j = 0, k = 0;
		int[] mergeArray = new int[array1.length + array2.length];
		while (i < array1.length) {
			mergeArray[k++] = array1[i++];
		}
		while (j < array2.length) {
			mergeArray[k++] = array2[j++];
		}
		return mergeArray;
	}

	private static int[] getSortArray(int[] array) {
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
