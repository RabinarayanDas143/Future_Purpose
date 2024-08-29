package com.example.InterviewCoding6;

import java.util.Arrays;

public class BubbleSort6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 7, 8, 10 };
		int[] resultArrayIndoWhileLoop = getSortArrayIndoWhileLoop(array);
		// System.out.println(Arrays.toString(resultArrayIndoWhileLoop));
		int[] resultArrayInForLoop = getSortArrayInForLoop(array);
		System.out.println(Arrays.toString(resultArrayInForLoop));
	}

	private static int[] getSortArrayInForLoop(int[] array) {
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

	private static int[] getSortArrayIndoWhileLoop(int[] array) {
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
