package com.example.InterviewCoding5;

import java.util.Arrays;

public class BubbleSort5 {

	public static void main(String[] args) {

		int[] array = { 4, 1, 3, 2, 5, 9, 7, 8, 6, 10 };
		int[] sortindoWhile = sortUsedoWhile(array);
		// System.out.println(Arrays.toString(sortindoWhile));
		int[] sortinforLoop = sortUseforLoop(array);
		System.out.println(Arrays.toString(sortinforLoop));
	}

	private static int[] sortUseforLoop(int[] array) {
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

	private static int[] sortUsedoWhile(int[] array) {
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
