package com.example.InterviewCoding7;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray7 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int tempIndex = rand.nextInt(array.length - 1);
			int tempNo = array[tempIndex];
			array[tempIndex] = array[i];
			array[i] = tempNo;
		}
		System.out.println(Arrays.toString(array));
	}

}
