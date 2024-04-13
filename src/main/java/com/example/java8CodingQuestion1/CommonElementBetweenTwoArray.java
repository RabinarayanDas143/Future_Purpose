package com.example.java8CodingQuestion1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoArray {

	public static List<Integer> getCommonElementFromTwoArray(int[] array1, int[] array2) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		for (int i : array1) {
			list.add(i);
		}
		for (int i : array2) {
			list1.add(i);
		}
		Predicate<Integer> predicate = e -> Arrays.stream(array2).boxed().collect(Collectors.toList()).contains(e);
		List<Integer> duplicateList = list.stream().filter(predicate).collect(Collectors.toList());
		return duplicateList;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 4, 3, 5, 6, 7, 8 };
		int[] array2 = { 2, 5, 7, 9, };
		List<Integer> duplicateList = getCommonElementFromTwoArray(array1, array2);
		System.out.println("Common elements are :"+ duplicateList);
	}
}
