package com.example.InterviewCoding;

public class RemoveWhiteSpaceFromString {

	public static String removeWhiteSpace(String str) {
		char[] charArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (char c : charArray) {
			if (!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		String removeWhiteSpace = removeWhiteSpace(str);
		System.out.println(removeWhiteSpace);
	}
}
