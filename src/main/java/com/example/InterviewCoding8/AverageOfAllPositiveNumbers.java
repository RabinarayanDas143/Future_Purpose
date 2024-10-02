package com.example.InterviewCoding8;

public class AverageOfAllPositiveNumbers {

	public static void main(String[] args) {
		int[] array = { -2, -3, 0, 25, -7, 12, -11 };
		int count = 0, sum = 0;
		double average;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				sum = sum + array[i];
				count++;
			}
		}
		if (count > 0) {
			average = sum / count;
			System.out.println("Average is :" + average);
		} else {
			System.out.println("There is no positive number in given Array.....");
		}
	}

}
