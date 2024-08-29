package com.example.InterviewCoding6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyofEachNumber6 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 3, 4, 5, 6, 7, 5, 6, 7, 8, 6, 7, 8, 9, 7, 8, 9, 10 };
		Map<Integer, Integer> frequseinbuilt = getFreqUseInbuilt(array);
		System.out.println("Useing inbuilt method :" + frequseinbuilt);

		Map<Integer, Integer> freqWithoutinbuilt = getfreqWithoutinbuilt(array);
		System.out.println("Freq. without using inbuilt method :" + freqWithoutinbuilt);

		Map<Integer, Integer> freqindowhile = getfreqIndoWhile(array);
		System.out.println("Freq. useing dowhile :"+freqindowhile);
	}

	private static Map<Integer, Integer> getfreqIndoWhile(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < array.length-1; i++) {
				if (array[i] > array[i + 1]) {
					array[i] = array[i] + array[i + 1];
					array[i + 1] = array[i] - array[i + 1];
					array[i] = array[i] - array[i + 1];
					swapped = true;
				}
			}
		} while (swapped);
		int i, j;
		Map<Integer, Integer> map = new HashMap<>();
		for (i = 0; i < array.length; i++) {
			int counter = 1;
			for (j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
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

	private static Map<Integer, Integer> getfreqWithoutinbuilt(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		return map;
	}

	private static Map<Integer, Integer> getFreqUseInbuilt(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : list) {
			map.putIfAbsent(i, Collections.frequency(list, i));
		}
		return map;
	}

}
