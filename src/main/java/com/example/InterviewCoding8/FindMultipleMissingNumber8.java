package com.example.InterviewCoding8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMultipleMissingNumber8 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 5, 5, 8, 10 };
		List<Integer> missingNumbers = getMissingNumbers(array);
		System.out.println(missingNumbers);
	}

	private static List<Integer> getMissingNumbers(int[] array) {
		int start = array[0];
		int end = array[array.length - 1];
		List<Integer> list = Stream.iterate(start, e -> e + 1).limit(end).collect(Collectors.toList());
		Set<Integer> set = new HashSet<>();
		List<Integer> result = new ArrayList<>();
		for (int i : array) {
			set.add(i);
		}
		for (int i : list) {
			if (!set.contains(i)) {
				result.add(i);
			}
		}
		return result;
	}

}
