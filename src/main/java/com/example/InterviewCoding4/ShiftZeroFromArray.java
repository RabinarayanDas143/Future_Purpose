package com.example.InterviewCoding4;

import java.util.Arrays;

public class ShiftZeroFromArray {
	public static void main(String[] args) {
		int[] array = { 3, 0, 2, 0, 1, 0, 0, 5, 0, 4 };
		int[] filterArray = getFilterArray(array);
		System.out.println(Arrays.toString(filterArray));
	}

	private static int[] getFilterArray(int[] array) {
		int[] newarray = new int[array.length];
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				newarray[k++] = array[i];
			}
		}
		return newarray;
	}
}
