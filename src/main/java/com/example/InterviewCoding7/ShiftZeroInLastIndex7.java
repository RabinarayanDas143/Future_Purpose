package com.example.InterviewCoding7;

import java.util.Arrays;

public class ShiftZeroInLastIndex7 {

	public static void main(String[] args) {
		int[] array = { 5, 0, 1, 0, 3, 0 };
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
