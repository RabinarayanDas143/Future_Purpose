package com.example.InterviewCoding5;

public class PalindromString5 {

	public static void main(String[] args) {
		String str1 = "LEVEL";
		String result = checkPalindrom(str1);
		System.out.println(result);
	}

	private static String checkPalindrom(String str1) {
		StringBuffer sb = new StringBuffer();
		for (int i = str1.length() - 1; i >= 0; i--) {
			sb.append(str1.charAt(i));
		}
		if (sb.toString().equals(str1)) {
			return "Given String is palindrom string..";
		} else {
			return "Given String is not palindrom string..";
		}
	}

}
