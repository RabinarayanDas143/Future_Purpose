package com.example.InterviewCoding1;

public class PalindromString {

	public static String checkPalindromString(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		String reverse = sb.toString();
		if (str.toUpperCase().equals(reverse.toUpperCase())) {
			return "Given string are palindrom";
		} else
			return "Given string are not palindrom";
	}

	public static void main(String[] args) {
		String palindrom = checkPalindromString("level");
		System.out.println(palindrom);
	}
}
