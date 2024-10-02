package com.example.InterviewCoding8;

public class IndexOfInput8 {

	public static void main(String[] args) {
		int num = 10;
		int[] array = { 2, 3, 7, 9, 8, 5, 4, 1, 10 };
		int index = getIndexOfNum(array, num);
		if (index != -1) {
			System.out.println("Index of given number is :" + index);
		} else {
			System.out.println("Given number is not present in array");
		}
	}

	private static int getIndexOfNum(int[] array, int num) {
		boolean flag = false;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				index = i;
				flag = true;
			}
		}
		if (!flag) {
			index = -1;
		}
		return index;
	}

}
