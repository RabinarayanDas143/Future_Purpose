package com.example.InterviewCoding7;

public class IndexofInput7 {

	public static void main(String[] args) {
		int num = 11;
		int[] array = { 2, 3, 7, 9, 8, 5, 4, 1, 10 };
		int index = getIndexOfNum(array, num);
		if (index != -1)
		System.out.println("Given numer index is :" + index);
		else
			System.out.println("Given number is not present in array");
	}

	private static int getIndexOfNum(int[] array, int num) {
		int index = 0;
		boolean flag=false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				index = i;
				flag = true;
			}
		}
		if(!flag) {
			index = -1;
		}
		return index;
	}

}
