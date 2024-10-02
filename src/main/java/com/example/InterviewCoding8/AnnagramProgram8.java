package com.example.InterviewCoding8;

import java.util.Arrays;

public class AnnagramProgram8 {

	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "CarRace";
		String result = checkAnnagram(str1, str2);
		System.out.println(result);
	}

	private static String checkAnnagram(String str1, String str2) {
		char[] str1CharArray = str1.toLowerCase().toCharArray();
		char[] str2CharArray = str2.toLowerCase().toCharArray();
		// Arrays.sort(str1CharArray);
		// Arrays.sort(str2CharArray);
		char[] array1 = bubbleSort(str1CharArray);
		char[] array2 = bubbleSort(str2CharArray);
		if (Arrays.equals(array1, array2)) {
			return "Given Strings are Annagram";
		} else {
			return "Given Strings are not Annagram";
		}
	}

	private static char[] bubbleSort(char[] str1CharArray) {
		for (int i = 0; i < str1CharArray.length; i++) {
			for (int j = i + 1; j < str1CharArray.length; j++) {
				if (str1CharArray[i] > str1CharArray[j]) {
					char temp = str1CharArray[i];
					str1CharArray[i] = str1CharArray[j];
					str1CharArray[j] = temp;
				}
			}
		}
		return str1CharArray;

	}

}
