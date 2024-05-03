package com.example.InterviewCoding2;

public class MaxMinNoFromArray {
	public static void main(String[] args) {
		int[] array = { 5, 3, 2, 1, 6, 7, 3, 4, 9, 2, 10, 13, 2, 13 };
		int MAX = array[0];
		int MIN = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(MAX<array[i]) {
				MAX=array[i];
			}else if(MIN>array[i]) {
				MIN=array[i];
			}
		}
		
		System.out.println("Max no from array :"+MAX+" and Min no from array :"+MIN);
	}
}
