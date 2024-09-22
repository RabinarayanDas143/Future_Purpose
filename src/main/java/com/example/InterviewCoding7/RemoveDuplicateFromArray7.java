package com.example.InterviewCoding7;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArray7 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 10, 4, 5, 6, 7, 8, 3, 4, 5, 6, 7, 6, 7, 8, 9 };
		List<Integer> result = getFilterArray(array);
		System.out.println(result);
	}

	private static List<Integer> getFilterArray(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					flag = false;
				}
			}
			if (!list.contains(array[i]) && flag) {
				list.add(array[i]);
			}
		}
		return list;
	}

}
