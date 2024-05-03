package com.example.InterviewCoding2;

public class RemoveWhiteSpace2 {

	public static String removeWhiteSpace(String str) {
		StringBuilder sb = new StringBuilder();
		char[] array = str.toCharArray();
		for (char c : array) {
			if (!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "Idbi intech ltd";
		String result = removeWhiteSpace(str);
		System.out.println(result);
	}
}
