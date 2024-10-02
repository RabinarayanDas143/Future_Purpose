package com.example.InterviewCoding8;

public class ReverseStringWordBasis8 {

	public static void main(String[] args) {
		String str = "My Name is Rabi";
		String result = getReverseStringinWord(str);
		System.out.println(result);
	}

	private static String getReverseStringinWord(String str) {
		StringBuilder sb = new StringBuilder();
		String result = null;
		String[] strArray = str.split(" ");
		for (String input : strArray) {
			for (int i = input.length() - 1; i >= 0; i--) {
				sb.append(input.charAt(i));
			}
			result = sb.append(" ").toString();
		}
		return result;
	}

}
