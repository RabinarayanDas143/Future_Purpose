package com.example.InterviewCoding1;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

	public static List<Integer> doBubbleSort(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		int n = list.size();
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (list.get(i - 1) > list.get(i)) {
					int temp = list.get(i - 1);
					list.set(i - 1, list.get(i));
					list.set(i, temp);
					swapped = true;
				}
			}
		} while (swapped);
		return list;
	}

	public static void main(String[] args) {
		int[] array = { 5, 3, 2, 1, 4, 6, 9, 8, 7, 10 };
		List<Integer> sortArray = doBubbleSort(array);
		System.out.println(sortArray);
	}
}
