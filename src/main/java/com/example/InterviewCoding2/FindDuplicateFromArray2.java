package com.example.InterviewCoding2;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateFromArray2 {

	public static List<Integer> getDuplicateElement(int[] array) {
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

	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 4, 5, 6, 7, 6, 7, 7 };
		List<Integer> DuplicateArray = getDuplicateElement(array);
		System.out.println(DuplicateArray);
	}
}
