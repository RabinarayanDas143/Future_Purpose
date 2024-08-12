package com.example.InterviewCoding5;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] reverseArray = getReverseArray(array);
		System.out.println(Arrays.toString(array));
	}

	private static int[] getReverseArray(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			array[start] = array[start] + array[end];
			array[end] = array[start] - array[end];
			array[start] = array[start] - array[end];

			start++;
			end--;
		}
		return array;
	}
}
