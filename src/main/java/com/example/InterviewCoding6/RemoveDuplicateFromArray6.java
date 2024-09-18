package com.example.InterviewCoding6;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArray6 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 7, 8, 10 };
		List<Integer> filterArray = getFilterArray(array);
		System.out.println(filterArray);
	}

	private static List<Integer> getFilterArray(int[] array) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			boolean duplicate = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					duplicate = true;
				}
			}
			if (!duplicate && !list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		return list;
	}

}
