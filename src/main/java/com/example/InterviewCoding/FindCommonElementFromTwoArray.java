package com.example.InterviewCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonElementFromTwoArray {

	public static int[] getCommonElement(int[] array1, int[] array2) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					list.add(array1[i]);
				}
			}
		}
		int[] uniqueElement = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			uniqueElement[i] = list.get(i);
		}
		return uniqueElement;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 7, 8, 1, 3, 22, 44, 55, 77, 88 };

		int[] commonElement = getCommonElement(array1, array2);
		System.out.println(Arrays.toString(commonElement));
	}
}
