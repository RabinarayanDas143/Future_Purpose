package com.example.InterviewCoding7;

import java.util.Arrays;

public class AnnagramPrograam7 {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "dacb";
		String result = checkAnnagram(str1, str2);
		System.out.println(result);
	}

	private static String checkAnnagram(String str1, String str2) {
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);

		if (Arrays.equals(str1Array, str2Array)) {
			return "Given Strings are Annagram..";
		} else {
			return "Given Strings are not Annagram..";
		}

	}

}
