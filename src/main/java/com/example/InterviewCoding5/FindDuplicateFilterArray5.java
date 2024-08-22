package com.example.InterviewCoding5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindDuplicateFilterArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 1, 4, 5, 2, 3, 5, 9, 6, 7, 8, 9, 10 };
		List<Integer> duplicateArray = getDuplicateFromArray(array);
		System.out.println(duplicateArray);

		List<Integer> filterArray = getFilterArray(array);
		System.out.println(filterArray);
	}

	private static List<Integer> getFilterArray(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					flag=true;
					break;
				}
			}
			if (!list.contains(array[i]) && !flag) {
				list.add(array[i]);
			}
		}
		Collections.sort(list);
		return list;
	}

	private static List<Integer> getDuplicateFromArray(int[] array) {
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
