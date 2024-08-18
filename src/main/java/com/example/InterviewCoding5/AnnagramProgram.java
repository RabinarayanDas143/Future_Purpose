package com.example.InterviewCoding5;

import java.util.Arrays;

public class AnnagramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "RaceCar", str2 = "Carrace";
		String result = checkAnnagram(str1, str2);
		System.out.println(result);
	}

	private static String checkAnnagram(String str1, String str2) {
		char[] str1CharArray = str1.toLowerCase().toCharArray();
		char[] str2CharArray = str2.toLowerCase().toCharArray();
		Arrays.sort(str1CharArray);
		Arrays.sort(str2CharArray);
		if (Arrays.equals(str1CharArray, str2CharArray)) {
			return "Two String are Annagram";
		} else {
			return "Two String are not Annagram";
		}
	}

}
