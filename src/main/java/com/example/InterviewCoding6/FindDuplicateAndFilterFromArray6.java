package com.example.InterviewCoding6;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray6 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 10, 9, 8, 7, 6 };
		List<Integer> filterArray = getFilterFromArray(array);
		System.out.println("Filter numbers are : " + filterArray);

		List<Integer> duplicateNumber = getDuplicateNumber(array);
		System.out.println("Duplicate numbers are :"+ duplicateNumber);
	}

	private static List<Integer> getDuplicateNumber(int[] array) {
		List<Integer> duplicateNumber = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					flag = true;
				}
			}
			if (!duplicateNumber.contains(array[i]) && flag) {
				duplicateNumber.add(array[i]);
			}
		}
		return duplicateNumber;
	}

	private static List<Integer> getFilterFromArray(int[] array) {
		List<Integer> duplicate = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					flag = true;
				}
			}
			if (!duplicate.contains(array[i]) && !flag) {
				duplicate.add(array[i]);
			}
		}
		return duplicate;
	}

}
