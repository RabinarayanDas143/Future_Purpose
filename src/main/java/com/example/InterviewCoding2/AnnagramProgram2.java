package com.example.InterviewCoding2;

import java.util.Arrays;

public class AnnagramProgram2 {

	public static String checkAnnagram(String str1, String str2) {
		char[] strChar1 = str1.toCharArray();
		char[] strchar2 = str2.toCharArray();
		Arrays.sort(strChar1);
		Arrays.sort(strchar2);
		String result = null;
		if (Arrays.equals(strChar1, strchar2)) {
			result = "Two string are annagram .";
		} else {
			result = "Two string are not annagram .";
		}
		return result;
	}

	public static void main(String[] args) {
		String result = checkAnnagram("abcd", "bcda");
		System.out.println(result);
	}
}
