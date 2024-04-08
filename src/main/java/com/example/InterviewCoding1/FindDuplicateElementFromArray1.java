package com.example.InterviewCoding1;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElementFromArray1 {

	public static List<Integer> getDuplicateFromArray(int[] array) {
		List<Integer> duplicateList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					if (!duplicateList.contains(array[j])) {
						duplicateList.add(array[j]);
					}
				}
			}
		}
		return duplicateList;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 2, 6, 4, 5, 5, 1, 6, 8, 9 };
		List<Integer> duplicateList = getDuplicateFromArray(array);
		System.out.println(duplicateList);
	}
}
