package com.example.InterviewCoding4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNumFromArray {

	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 5, 4, 2, 10, 6, 9, 7, 8, 6, 7, 10 };
		int[] result = getFilterArray(array);
		System.out.println(Arrays.toString(result));
	}

	private static int[] getFilterArray(int[] array) {
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
		for (int i : array) {
			if (!list.contains(i)) {
				list.add(i);
			}
		}
       array = list.stream().mapToInt(e->e).toArray();
		return array;
	}

}
