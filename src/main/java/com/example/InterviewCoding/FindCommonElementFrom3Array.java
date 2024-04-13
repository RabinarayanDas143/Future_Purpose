package com.example.InterviewCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonElementFrom3Array {
	public static int[] getCommonElement(int[] array1, int[] array2, int[] array3) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				for (int k = 0; k < array3.length; k++) {
					if (array1[i] == array2[j] && array2[j] == array3[k]) {
						list.add(array3[k]);
					}
				}
			}
		}
		int[] unique = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			unique[i] = list.get(i);
		}
		return unique;
	}

	public static int[] getCommonelement(int[] array1, int[] array2, int[] array3) {
		int x = array1[0], y = array2[0], z = array3[0];
		List<Integer> list = new ArrayList<>();
		while (x < array1.length && y < array2.length && z < array3.length) {
			if (array1[x] == array2[y] && array2[y] == array3[z]) {
				list.add(array1[x]);
				x++;
				y++;
				z++;
			} else if (array1[x] < array2[y]) {
				x++;
			} else if (array2[y] < array3[z]) {
				y++;
			} else {
				z++;
			}
		}
		int[] unique = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			unique[i] = list.get(i);
		}
		System.out.println(Arrays.toString(unique));
		return unique;
		
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 6, 7, 2, 8, 4, 9 };
		int[] array3 = { 22, 33, 2, 44, 66, 4, 99 };

		// first way its time complexcity more;
		int[] commonElement = getCommonElement(array1, array2, array3);
		// System.out.println(Arrays.toString(commonElement));

		// second
		int[] commonelement = getCommonelement(array1, array2, array3);
		System.out.println(Arrays.toString(commonelement));
	}
}
