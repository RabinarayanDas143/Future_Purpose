package com.example.InterviewCoding;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// reverseArray(array);

		int[] unSortArray = { 1, 5, 7, 2, 4, 3, 6, 9, 8, 10 };
		reverseUnsortedArray(unSortArray);
	}

	public static void reverseArray(int[] array) {

		int[] revArray = new int[array.length];
		int k = 0;

		for (int i = array.length - 1; i >= 0; i--) {
			revArray[k] = array[i];
			k++;
		}

		System.out.println(Arrays.toString(revArray));
	}

	public static void reverseUnsortedArray(int[] unSortArray) {

		int[] revArray = new int[unSortArray.length];

		for (int i = 0; i < unSortArray.length; i++) {
			for (int j = i + 1; j < unSortArray.length; j++) {
				if (unSortArray[i] > unSortArray[j]) {
					unSortArray[i] = unSortArray[i] + unSortArray[j];
					unSortArray[j] = unSortArray[i] - unSortArray[j];
					unSortArray[i] = unSortArray[i] - unSortArray[j];
				}
			}
		}
		int k = 0;
		for (int i = unSortArray.length - 1; i >= 0; i--) {
			revArray[k] = unSortArray[i];
			k++;
		}
		System.out.println(Arrays.toString(revArray));
	}

}
