package com.example.InterviewCoding3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFrequencyAndMissingNumber {
	public static void main(String[] args) {
		int[] array = { 4, 3, 2, 1, 2, 3, 4, 2, 5, 6, 10, 5, 10 };
		Map<Integer, Integer> frequency = getFrequency(array);
		System.out.println(frequency);
		
		List<Integer> missing = findMissingNumber(array);
		System.out.println(missing);
	}

	private static List<Integer> findMissingNumber(int[] array) {
		 Set<Integer> set = new HashSet<>();
		 List<Integer> Missing = new ArrayList<>();
		 for(int i:array) {
			 set.add(i);
		 }
		 List<Integer> list = IntStream.iterate(1, i->i+1).limit(10).boxed().collect(Collectors.toList());
		 for(int i:list) {
			 if(!set.contains(i)) {
				 Missing.add(i);
			 }
		 }
		return Missing;
	}

	private static Map<Integer, Integer> getFrequency(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for(int i:array) {
			list.add(i);
		}
		for (int i : list) {
			map.putIfAbsent(i, Collections.frequency(list, i));
		}
		return map;
	}
}
