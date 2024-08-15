package com.example.InterviewCoding4;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateFromArray4 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 2, 3, 7, 4, 5, 9, 8, 7, 10, 2, 2 };
		List<Integer> list = getDuplicate(array);
		 System.out.println(list);
		List<Integer> list1 = getFilterArray(array);
		System.out.println(list1);
	}

	private static List<Integer> getFilterArray(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] != array[j] && i != j) {
					if (!list.contains(array[i])) {
						list.add(array[i]);
					}
				}
			}
		}
		return list;
	}

	private static List<Integer> getDuplicate(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					if (!list.contains(array[i])) {
						list.add(array[i]);
					}
				}
			}
		}
		return list;
	}
}
