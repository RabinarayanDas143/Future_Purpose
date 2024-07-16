package com.example.InterviewCoding4;

import java.util.Arrays;

public class AnnagramProgram4 {
	public static void main(String[] args) {
		String str1 = "abcd", str2 = "cdbaw";
		String result = checkStringAnnagram(str1, str2);
		System.out.println(result);
	}

	private static String checkStringAnnagram(String str1, String str2) {
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray1, charArray2)) {
			return "Two Strings are annagram";
		} else {
			return "Two Strings are not annagram";
		}
	}
}
