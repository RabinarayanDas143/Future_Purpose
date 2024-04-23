package com.example.InterviewCoding2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFrequencyAndMissingNumber2 {

	public static void getFrequAndMissing(int[] array) {
		// find frequency
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
		int i, j;
		for (i = 0; i < array.length; i++) {
			int counter = 1;
			for (j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					counter++;
				} else {
					break;
				}
			}
			i = j - 1;
			System.out.println(array[i] + "------->" + counter);
		}

		// Find Missing Number
		List<Integer> list = Stream.iterate(1, k -> k + 1).limit(10).collect(Collectors.toList());
		Set<Integer> set = new HashSet<>();
		for (int k : array) {
			set.add(k);
		}
		List<Integer> missing = new ArrayList<>();
		for (int l : list) {
			if (!set.contains(l)) {
				missing.add(l);
			}
		}
		System.out.println("Missing elements are :"+ missing);
	}

	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 4, 1, 2, 2, 2, 6, 1, 9, 9, 6, 10, 1, 10 };
		getFrequAndMissing(array);
	}
}
