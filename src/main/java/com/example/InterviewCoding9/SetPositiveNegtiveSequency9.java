package com.example.InterviewCoding9;

import java.util.Arrays;

public class SetPositiveNegtiveSequency9 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 5, -3, -1, -4 };
		int[] result = getPositiveNegtiveSequency(array);
		System.out.println(Arrays.toString(result));
	}

	private static int[] getPositiveNegtiveSequency(int[] array) {
		int positive = 0, negtive = 1;
		int[] result = new int[array.length];
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
