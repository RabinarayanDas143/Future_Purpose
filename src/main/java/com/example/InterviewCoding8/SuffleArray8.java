package com.example.InterviewCoding8;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray8 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomINdex = rand.nextInt(array.length);
			int randomIndexNumber = array[randomINdex];
			array[randomINdex] = array[i];
			array[i] = randomIndexNumber;
		}
		System.out.println(Arrays.toString(array));
	}

}
