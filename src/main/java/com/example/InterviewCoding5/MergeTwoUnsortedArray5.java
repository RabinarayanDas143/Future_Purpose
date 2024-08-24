package com.example.InterviewCoding5;

import java.util.Arrays;

public class MergeTwoUnsortedArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 5, 1, 4, 2, 3 };
		int[] array2 = { 6, 9, 7, 8, 10 };
		int[] mergeArray = getMergeArray(array1, array2);
		System.out.println(Arrays.toString(mergeArray));
	}

	private static int[] getMergeArray(int[] array1, int[] array2) {
		int[] result = new int[array1.length + array2.length];
		array1 = getSortArray(array1);
		array2 = getSortArray(array2);
		int k = 0;
		for (int i = 0; i < array1.length; i++) {
			result[k] = array1[i];
			k++;
		}
		for (int i = 0; i < array2.length; i++) {
			result[k] = array2[i];
			k++;
		}
		return result;
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
