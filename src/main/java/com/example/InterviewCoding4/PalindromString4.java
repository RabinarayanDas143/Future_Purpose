package com.example.InterviewCoding4;

public class PalindromString4 {
	public static void main(String[] args) {
		String str = "LEVEL";
		String result = checkStringPalindrom(str);
		System.out.println(result);
	}

	private static String checkStringPalindrom(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
		}
		if(str.equals(sb.toString())) {
			return "Given string is palindrom";
		}else {
			return "Given string is not palindrom";
		}
	}
}
