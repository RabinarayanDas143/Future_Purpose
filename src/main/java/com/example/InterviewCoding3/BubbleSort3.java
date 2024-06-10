package com.example.InterviewCoding3;

import java.util.Arrays;

public class BubbleSort3 {
	public static void main(String[] args) {
		int[] array = { 3, 5, 4, 1, 2, 6, 9, 7, 8, 10 };

		int[] bubbleSort1 = getBubbleSort1(array);
		// System.out.println(Arrays.toString(bubbleSort1));

		int[] bubbleSort2 = getBubbleSort2(array);
		System.out.println(Arrays.toString(bubbleSort2));
	}

	private static int[] getBubbleSort2(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		return array;
	}

	private static int[] getBubbleSort1(int[] array) {
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
