package com.example.InterviewCoding7;

public class AverageofAllPositiveNumbers {

	public static void main(String[] args) {
		int[] array = { -2, -3, 0, 25, -7, 12, -11 };
		int count = 0, sum = 0;
		double average;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				count++;
				sum = sum + array[i];
			}
		}
		if (count > 0) {
			average = sum / count;
			System.out.println(average);
		} else {
			System.out.println("In given array there is no positive numbers..");
		}
	}

}
