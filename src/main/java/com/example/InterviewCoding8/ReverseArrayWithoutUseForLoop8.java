package com.example.InterviewCoding8;

import java.util.Arrays;

public class ReverseArrayWithoutUseForLoop8 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int first = 0;
		int last =  array.length - 1;
		while (first < last) {
			array[first] = array[first] + array[last];
			array[last] = array[first] - array[last];
			array[first] = array[first] - array[last];
			first++;
			last--;
		}
		System.out.println(Arrays.toString(array));
	}

}
