package com.example.InterviewCoding2;

import java.util.Arrays;

public class SecondLargestFromArray {

	public static int getSecondLargest(int[] array) {
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

		return array[array.length - 2];
	}

	public static int getKthLargestNumber(int[] array, int k) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if (k == i) {
				result = array[i];
				break;
			}
		}
		System.out.println(Arrays.toString(array));
		return result;
	}

	public static void main(String[] args) {
		int[] array = { 5, 4, 2, 3, 1, 6, 9, 8, 7, 10 };
		int secondLargest = getSecondLargest(array);
		//System.out.println(secondLargest);

		int k = 4;
		int KthLargest = getKthLargestNumber(array, k);
		System.out.println(KthLargest);
	}
}
