package com.example.InterviewCoding1;

public class MaxMinFromArray {

	public void findmaxMin(int[] array) {
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			} else if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("From your array Max number is :" + max + " and Min number is :" + min);
	}

	public static void main(String[] args) {
		int[] array = { 23, 4, 577, 2, 4, 8, 11, 33, 88, 25 };
		MaxMinFromArray obj = new MaxMinFromArray();
		obj.findmaxMin(array);
	}
}
