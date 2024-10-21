package com.example.InterviewCoding9;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray9 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randindex = rand.nextInt(array.length);
			int randNum = array[randindex];
			int temp = array[i];
			array[i] = randNum;
			array[randindex] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
