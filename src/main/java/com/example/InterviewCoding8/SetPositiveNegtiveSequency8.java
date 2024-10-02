package com.example.InterviewCoding8;

import java.util.Arrays;

public class SetPositiveNegtiveSequency8 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 5, -3, -1, -4 };
		int[] result = getPositiveNegtiveSequency(array);
		System.out.println(Arrays.toString(result));
	}

	private static int[] getPositiveNegtiveSequency(int[] array) {
		int[] result = new int[array.length];
		int positive = 0, negtive = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 && positive < result.length) {
				result[positive] = array[i];
				positive += 2;
			} else if (array[i] < 0 && negtive < result.length) {
				result[negtive] = array[i];
				negtive += 2;
			}
		}
		return result;
	}

}
