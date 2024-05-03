package com.example.InterviewCoding;

public class MissingNumberInArray {
	public int MissingNumber(int[] array, int n) {
		//int expectedSum = n *( n + 1) / 2;
		//System.out.println(expectedSum);
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum =sum+i;
		}
		System.out.println(sum);
		int actualSum = 0;
		for (int num : array) {
			actualSum += num;
		}
		System.out.println(actualSum);
		return sum - actualSum;
	}
	
	

	public static void main(String[] ram) {
		MissingNumberInArray obj = new MissingNumberInArray();
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9 };
		int sizeOfArray = array.length + 1;
		//int result = obj.MissingNumber(array, sizeOfArray);
		 
		//System.out.println(result);
	}
}
