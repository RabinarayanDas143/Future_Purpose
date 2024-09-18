package com.example.InterviewCoding6;

import java.util.Arrays;

public class ReverseArray6 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int start = 0;
		int end = array.length - 1;

		while (start < end) {
			array[start] = array[start] + array[end];
			array[end] = array[start] - array[end];
			array[start] = array[start] - array[end];
			start++;
			end--;
		}
		System.out.println(Arrays.toString(array));
	}

}
