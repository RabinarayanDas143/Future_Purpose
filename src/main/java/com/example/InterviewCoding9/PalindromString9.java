package com.example.InterviewCoding9;

public class PalindromString9 {

	public static void main(String[] args) {
		String str = "Level";
		String result = checkPalindrom(str);
		System.out.println(result);
	}

	private static String checkPalindrom(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.toLowerCase().length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		if (str.equalsIgnoreCase(sb.toString())) {
			return "Given Stirng is a palindrom string..";
		} else {
			return "Given Stirng is not a palindrom string..";
		}
	}

}
