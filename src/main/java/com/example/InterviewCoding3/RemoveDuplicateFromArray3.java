package com.example.InterviewCoding3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromArray3 {
	public static void main(String[] args) {
		int[] array = { 3, 2, 1, 5, 4, 9, 6, 7, 8, 10, 3, 4, 6, 2, 8, 5, 9, 10 };
		int[] filterArray = removeDulicateFromArray(array);
		System.out.println(Arrays.toString(filterArray));
	}

	private static int[] removeDulicateFromArray(int[] array) {
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
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (!list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		int[] resultArray = list.stream().mapToInt(e->e).toArray();
		return resultArray;
	}
}
