package com.example.InterviewCoding5;

import java.util.Arrays;

public class ShiftZero {
	public static void main(String[] args) {
		int[] array = { 44, 0, 22, 55, 0, 11 };
		int[] shiftZero = getShiftZeroArray(array);
		System.out.println(Arrays.toString(shiftZero));
	}

	private static int[] getShiftZeroArray(int[] array) {
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
		return array;
	}
}
