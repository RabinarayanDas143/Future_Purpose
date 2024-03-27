package com.example.java8CodingQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortNoAsceDesc {
	// This method given array to ding sort then reverse
	public void sortNoAsce(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] > intArray[j]) {
					intArray[i] = intArray[i] + intArray[j];
					intArray[j] = intArray[i] - intArray[j];
					intArray[i] = intArray[i] - intArray[j];
				}
			}
		}
		System.out.println("-------------------: "+Arrays.toString(intArray));
		Set<Integer> set = new HashSet<>();
		for (int i : intArray) {
			set.add(i);
		}
		System.out.println(set);
		List<Integer> list = new ArrayList<>();
		list.addAll(set);
		List<Integer> result = new ArrayList<>();
		for (int i = list.size() - 1; i > 0; i--) {
			result.add(list.get(i));
		}
		System.out.println(result);
	}

	// This method is same for above method , using java8
	public void sortNoAsceJava8(int[] intArray) {
		List<Integer> converArrayToList = new ArrayList<>();
		for (int i : intArray) {
			converArrayToList.add(i);
		}
		List<Integer> list = converArrayToList.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		LinkedHashSet<Integer> linkedset = new LinkedHashSet<>();
		linkedset.addAll(list);
		System.out.println(linkedset);
	}
	
	// This method for doing descending order
	public void sortNoDescJava8(int[] intArray) {
		List<Integer> converArrayToList = new ArrayList<>();
		for (int i : intArray) {
			converArrayToList.add(i);
		}
		List<Integer> list = converArrayToList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		LinkedHashSet<Integer> linkedset = new LinkedHashSet<>();
		linkedset.addAll(list);
		System.out.println(linkedset);
	}

	public static void main(String[] args) {
		SortNoAsceDesc obj = new SortNoAsceDesc();
		int[] intArray = { 2, 3, 1, 3, 4, 5, 2, 3, 7, 5, 2, 1, 9, 3, 6, 10 };
		obj.sortNoAsce(intArray);
		//obj.sortNoAsceJava8(intArray);
		//obj.sortNoDescJava8(intArray);
	}
}
