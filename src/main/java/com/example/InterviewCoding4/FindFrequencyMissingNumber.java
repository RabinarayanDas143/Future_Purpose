package com.example.InterviewCoding4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFrequencyMissingNumber {
	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 9, 10, 3, 5, 1, 3, 3, 10 };
		Map<Integer, Integer> frequency = getFrequency(array);
		System.out.println(frequency);

		List<Integer> missingNumber = getMissingNumber(array);
		System.out.println(missingNumber);
	}

	private static List<Integer> getMissingNumber(int[] array) {
		List<Integer> seqList = IntStream.iterate(1, i -> i + 1).limit(10).boxed().collect(Collectors.toList());
		List<Integer> inputList = new ArrayList<>();
		List<Integer> missingNumber = new ArrayList<>();
		for (int i = 0; i < array.length - 1; i++) {
			if (!inputList.contains(array[i])) {
				inputList.add(array[i]);
			}
		}
		for (int i : seqList) {
			if (!inputList.contains(i)) {
				missingNumber.add(i);
			}
		}
		return missingNumber;
	}

	private static Map<Integer, Integer> getFrequency(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			map.putIfAbsent(list.get(i), Collections.frequency(list, list.get(i)));
		}
		return map;
	}
}
