package com.example.InterviewCoding2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RemoveDuplicateFromAray {
	public static int[] getUniqueArray(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i - 1] > array[i]) {
					array[i - 1] = array[i - 1] + array[i];
					array[i] = array[i - 1] - array[i];
					array[i - 1] = array[i - 1] - array[i];
					swapped = true;
				}
			}
		} while (swapped);
		List<Integer> list = new ArrayList<>();
		 for(int i=0;i<array.length;i++) {
			 if(!list.contains(array[i])) {
				 list.add(array[i]);
			 }
		 }
		 System.out.println(list);
		return array;
	}

	public static void main(String... args) {
		int[] array = { 4, 5, 3, 6, 1, 3, 2, 5, 6, 7, 2, 7, 6, 8, 10, 9, 10 };
		int[] uniqueArray = getUniqueArray(array);
	}
}
