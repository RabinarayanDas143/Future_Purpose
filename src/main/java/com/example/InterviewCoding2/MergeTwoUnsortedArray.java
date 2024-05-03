package com.example.InterviewCoding2;

import java.util.Arrays;

public class MergeTwoUnsortedArray {
	public static int[] getMergeSortArray(int[] array1, int[] array2) {

		array1 = sort(array1);
		array2 = sort(array2);
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

	public static int[] sort(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i - 1] > array[i]) {
					array[i - 1] = array[i - 1] + array[i];
					array[i] = array[i - 1] - array[i];
					array[i - 1] = array[i - 1] - array[i];
					swapped = true;
				}
			}
		} while (swapped);
		return array;
	}

	public static void main(String[] args) {
		int[] array1 = { 4, 3, 5, 2, 1 };
		int[] array2 = { 8, 6, 9, 10, 7 };
		int[] mergeSortArray = getMergeSortArray(array1, array2);
		System.out.println(Arrays.toString(mergeSortArray));
	}
}
