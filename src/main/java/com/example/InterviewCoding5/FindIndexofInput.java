package com.example.InterviewCoding5;

public class FindIndexofInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 20, 50, 30, 40 };
		int num = 70;
		int index = getIndexNo(array, num);
		if (index != -1) {
			System.out.println("Index Num is :" + index);
		}
		else {
			System.out.println("Given no is not present in array");
		}
	}

	private static int getIndexNo(int[] array, int num) {
		// TODO Auto-generated method stub
		int index = 0;
		boolean flag = false;
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
