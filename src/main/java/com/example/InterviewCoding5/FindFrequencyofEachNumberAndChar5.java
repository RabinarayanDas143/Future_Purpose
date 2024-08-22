package com.example.InterviewCoding5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyofEachNumberAndChar5 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 2, 3, 1, 2, 4, 5, 3, 6, 7, 6, 8, 7, 9, 8, 9, 10 };
		Map<Integer, Integer> numFreq = getFreqUseCollection(array);
		// System.out.println("Frequency is number :" + numFreq);

		Map<Integer, Integer> numFreq1 = getFreqwithoutCollection(array);
		//System.out.println("Frequency without collection : " + numFreq1);

		Map<Integer, Integer> numFreq2 = getFrequWithoutCollectionWithoutSwap(array);
		//System.out.println("Frequency without collection : " + numFreq2);

	}

	private static Map<Integer, Integer> getFrequWithoutCollectionWithoutSwap(int[] array) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int key = array[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		return map;
	}

	private static Map<Integer, Integer> getFreqwithoutCollection(int[] array) {

		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					array[i] = array[i] + array[i + 1];
					array[i + 1] = array[i] - array[i + 1];
					array[i] = array[i] - array[i + 1];
					swapped = true;
				}
			}
		} while (swapped);

		Map<Integer, Integer> map = new HashMap<>();
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
			map.put(array[i], counter);
		}
		return map;
	}

	private static Map<Integer, Integer> getFreqUseCollection(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		for (int i = 0; i < list.size(); i++) {
			map.putIfAbsent(list.get(i), Collections.frequency(list, list.get(i)));
		}
		return map;
	}

}
