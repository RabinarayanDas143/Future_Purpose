package com.example.InterviewCoding5;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray5 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] suffleArray = getSuffleArray(array);
		System.out.println(Arrays.toString(suffleArray));
	}

	private static int[] getSuffleArray(int[] array) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomIndex = rand.nextInt(array.length);
			int temp = array[randomIndex];
			array[randomIndex] = array[i];
			array[i] = temp;

		}
		return array;
	}
}