package com.example.InterviewCoding5;

import java.util.Arrays;

public class ShiftZeroFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 0, 2, 0, 4, 0, 1 };
		int[] result = shiftZeroinArray(array);
		System.out.println(Arrays.toString(result));
	}

	private static int[] shiftZeroinArray(int[] array) {
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
