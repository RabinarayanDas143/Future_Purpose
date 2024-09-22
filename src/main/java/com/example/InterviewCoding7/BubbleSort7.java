package com.example.InterviewCoding7;

import java.util.Arrays;

public class BubbleSort7 {

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, 9, 8, 7, 6, 10 };
		int[] sortinForLoop = sortArrayinForLoop(array);
		// System.out.println(Arrays.toString(sortinForLoop));
		int[] sortinDoWhileLoop = sortindoWhileLoop(array);
		System.out.println(Arrays.toString(sortinDoWhileLoop));
	}

	private static int[] sortindoWhileLoop(int[] array) {
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

	private static int[] sortArrayinForLoop(int[] array) {
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

}
