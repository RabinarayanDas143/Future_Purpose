package com.example.InterviewCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementFromArray {

	public static List<Integer> findDuplicateElement(int[] array) {
		List<Integer> duplicate = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] == array[j]) && (i != j)) {
					//duplicate.add(array[j]);
					if(!duplicate.contains(array[j])) {
						duplicate.add(array[j]);
					}
				}
			}
		}
		return duplicate;
	}

	public static List<Integer> findDuplicateUsingSet(int[] array) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int i : array) {
			if (set.add(i) == false) {
				list.add(i);
			}
		}
		return list;
	}

	public static void FindDuplicateUsingHashMap(int[] array) {

		Map<Integer, Integer> mp = new HashMap<>();
		for (int i : array) {
			Integer count = mp.get(i);
			if (count == null) {
				mp.put(i, 1);
			} else {
				count = count + 1;
				mp.put(i, count);
			}
		}
		Set<Map.Entry<Integer, Integer>> es = mp.entrySet();
		for(Map.Entry<Integer, Integer> me:es) {
			if(me.getValue()>1) {
				System.out.println(me.getKey()+" ");
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 1, 4, 3, 5, 3, 5 };

		// It is using brute force method , this method is applicable for
		// when element are repeted only once in array
		List<Integer> duplicateElement = findDuplicateElement(array);
		 System.out.println(duplicateElement);

		// It is using Set interface
		List<Integer> duplicateList = findDuplicateUsingSet(array);
		//System.out.println(duplicateList);

		// Using HashMap
		//FindDuplicateUsingHashMap(array);
	}
}
