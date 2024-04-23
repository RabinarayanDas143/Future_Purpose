package com.example.InterviewCoding2;

import java.util.Arrays;

public class BubbleSort2 {

	public static int[] firstBubbleSort(int[] array) {
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

	public static int[] secondBubbleSort(int[] array) {
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

	public static void main(String[] args) {
		int[] array = { 1, 4, 2, 3, 5, 8, 7, 6, 10, 9 };
		int[] bubbleSort = firstBubbleSort(array);
		//System.out.println(Arrays.toString(bubbleSort));

		int[] bubbleSort1 = secondBubbleSort(array);
		System.out.println(Arrays.toString(bubbleSort1));
	}
}
