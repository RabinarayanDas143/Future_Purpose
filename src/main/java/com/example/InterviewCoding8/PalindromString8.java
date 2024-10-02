package com.example.InterviewCoding8;

public class PalindromString8 {

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
		if (str.toLowerCase().equalsIgnoreCase(sb.toString())) {
			return "Given String is a Annagram....";
		} else {
			return "Given String is not a Annagram....";
		}
	}

}
