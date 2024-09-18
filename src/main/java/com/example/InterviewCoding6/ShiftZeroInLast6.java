package com.example.InterviewCoding6;

import java.util.Arrays;

public class ShiftZeroInLast6 {

	public static void main(String[] args) {
		int[] array = { 3, 0, 5, 0, 2, 0 };
		int[] zeroShift = getShiftZeroArray(array);
		System.out.println(Arrays.toString(zeroShift));
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
