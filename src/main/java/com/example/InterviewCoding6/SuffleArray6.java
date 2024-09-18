package com.example.InterviewCoding6;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray6 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] suffleArray = getSuffleArray(array);
		System.out.println(Arrays.toString(suffleArray));
	}

	private static int[] getSuffleArray(int[] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomIndex = rand.nextInt(array.length - 1);
			int tempNum = array[randomIndex];
			array[randomIndex] = array[i];
			array[i] = tempNum;
		}
		return array;
	}

}
