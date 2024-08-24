package com.example.InterviewCoding5;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6, 7, 8, 9, 10, 20 };
		List<Integer> result = getFilterArray(array);
		System.out.println(result);
	}

	private static List<Integer> getFilterArray(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					flag = true;
				}
			}
			if (!list.contains(array[i]) && !flag) {
				list.add(array[i]);
			}
		}
		return list;
	}

}
