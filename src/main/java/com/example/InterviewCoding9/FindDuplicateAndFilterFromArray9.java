package com.example.InterviewCoding9;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray9 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> DuplicateNumber = getDuplicateNumberFromArray(array);
		System.out.println(DuplicateNumber);
		List<Integer> FilterNumber = getFilterNumbersFromArray(array);
		System.out.println(FilterNumber);
	}

	private static List<Integer> getFilterNumbersFromArray(int[] array) {
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

	private static List<Integer> getDuplicateNumberFromArray(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					flag = false;
				}
			}
			if (!list.contains(array[i]) && !flag) {
				list.add(array[i]);
			}
		}
		return list;
	}

}
