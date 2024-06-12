package com.example.InterviewCoding3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfEachChar3 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		// This method using collection method
		Map<Character, Integer> charFreq = getCharFreqFromString(str);
		// System.out.println(charFreq);

		// This Method with out using collection method
		int[] intArray = { 1, 3, 2, 3, 4, 5, 6, 4, 3, 6, 7, 8, 5, 6, 7, 9, 0, 3, 21, 9, 8, 5, 21 };
		Map<Integer, Integer> intFreq = getFreqFromintArray(intArray);

		// This method using collection method for every String frequency
		String[] strArray = { "Java", "React", "Java", ".Net", "React", "Mysql", "React", "Java" };
		Map<String, Integer> stringFreq = getStringFreq(strArray);
		System.out.println(stringFreq);
	}

	private static Map<String, Integer> getStringFreq(String[] strArray) {
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		for (String str : strArray) {
			list.add(str);
		}
		for (String str : list) {
			map.putIfAbsent(str, Collections.frequency(list, str));
		}
		return map;
	}

	private static Map<Integer, Integer> getFreqFromintArray(int[] intArray) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < intArray.length - 1; i++) {
				if (intArray[i] > intArray[i + 1]) {
					intArray[i] = intArray[i] + intArray[i + 1];
					intArray[i + 1] = intArray[i] - intArray[i + 1];
					intArray[i] = intArray[i] - intArray[i + 1];
					swapped = true;
				}
			}
		} while (swapped);
		System.out.println(Arrays.toString(intArray));
		int i, j;
		for (i = 0; i < intArray.length; i++) {
			int counting = 1;
			for (j = i + 1; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					counting++;
				} else {
					break;
				}
			}
			i = j - 1;
			//System.out.println(intArray[i] + "------->" + counting);
		}
		return null;
	}

	private static Map<Character, Integer> getCharFreqFromString(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = str.toCharArray();
		List<Character> list = new ArrayList<>();
		for (char c : charArray) {
			list.add(c);
		}
		for (char c : list) {
			map.putIfAbsent(c, Collections.frequency(list, c));
		}

		return map;
	}
}
