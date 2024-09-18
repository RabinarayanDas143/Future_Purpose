package com.example.InterviewCoding6;

public class PalindromString6 {

	public static void main(String[] args) {
		String str = "level";
		String result = checkPalindrom(str);
		System.out.println(result);
	}

	private static String checkPalindrom(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		if (str.equalsIgnoreCase(sb.toString()))
			return "Given String is palindrom..";
		else
			return "Given String is not palindrom..";
	}

}
