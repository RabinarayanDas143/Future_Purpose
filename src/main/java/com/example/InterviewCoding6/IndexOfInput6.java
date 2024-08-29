package com.example.InterviewCoding6;

import java.util.Arrays;

public class IndexOfInput6 {

	public static void main(String[] args) {
		int[] array = { 1, 4, 2, 3, 5, 8, 6, 7, 10 };
		int num = 11;
		String indexNum = getIndexNum(array, num);
		System.out.println(indexNum);
	}

	private static String getIndexNum(int[] arrayarray, int num) {
		int index = -1;
		try {
			for (int i = 0; i < arrayarray.length; i++) {
				if (arrayarray[i] == num) {
					index = i;
				}
			}
			if (index == -1) {
				throw new Exception();
			}
		} catch (Exception e) {
			// TODO: handle exception
			return "The number is not present in array...";
		}
		return "The index number of given input is :" + index;
	}

}
