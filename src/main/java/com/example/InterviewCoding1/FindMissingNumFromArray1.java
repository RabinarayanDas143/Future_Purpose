package com.example.InterviewCoding1;

public class FindMissingNumFromArray1 {

	public static int getMissingNUm(int[] array) {
		int length = array.length + 1;
		
		int actualSum = 0;
		for (int i = 1; i <= length; i++) {
			actualSum += i;
		}

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return actualSum - sum;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		int findMissingNum = getMissingNUm(array);
		System.out.println(findMissingNum);
	}
}
