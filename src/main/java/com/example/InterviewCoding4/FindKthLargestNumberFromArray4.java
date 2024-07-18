package com.example.InterviewCoding4;

import java.util.Arrays;

public class FindKthLargestNumberFromArray4 {

	public static void main(String[] args) {
		int[] array = { 5, 1, 2, 3, 4, 6, 9, 8, 7, 10 };
		int Kth = 4;
		int KthLargestNum = getKthLargestNumber(array, Kth);
		System.out.println(KthLargestNum);
	}

	private static int getKthLargestNumber(int[] array, int kth) {
		// Sorting
		/*
		 * boolean swapped; do { swapped = false; for (int i = 0; i < array.length - 1;
		 * i++) { if (array[i] > array[i + 1]) { array[i] = array[i] + array[i + 1];
		 * array[i + 1] = array[i] - array[i + 1]; array[i] = array[i] - array[i + 1];
		 * swapped = true; } } } while (swapped);
		 */
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if (i == kth - 1) {
				kth = array[i];
				break;
			}
		}
		return kth;
	}

}
