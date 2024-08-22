package com.example.InterviewCoding5;

public class FindKthLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int largest = 4;
		int largestNumber = getLargestNumber(array, largest);
		System.out.println("Largest number is :"+largestNumber);
	}

	private static int getLargestNumber(int[] array, int largest) {
		int largestNumber = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if(i==largest-1) {
				largestNumber=array[i];
				break;
			}
		}
		return largestNumber;
	}

}
