package com.example.InterviewCoding9;

public class AverageOfAllPositiveNumbers {

	private AverageOfAllPositiveNumbers() {

	}

	private static AverageOfAllPositiveNumbers obj = null;

	public static AverageOfAllPositiveNumbers getAverageOfAllPositiveNumbersObj() {
		if (obj == null) {
			synchronized (AverageOfAllPositiveNumbers.class) {
				if (obj == null) {
					obj = new AverageOfAllPositiveNumbers();
				}
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		int[] array = { -2, -3, 0, 25, -7, 12, -11 };
		AverageOfAllPositiveNumbers obj = getAverageOfAllPositiveNumbersObj();
		double average = obj.getAverage(array);
		System.out.println(average);
	}

	private double getAverage(int[] array) {
		int count = 0, sum = 0;
		double average = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				sum = sum + array[i];
				count++;
			}
		}
		if (count > 0) {
			average = sum / count;
		}
		return average;
	}

}
