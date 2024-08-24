package com.example.InterviewCoding5;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		String str = "Rabi Narayan Das";
		String result = removeWhiteSpace(str);
		System.out.println(result);
	}

	private static String removeWhiteSpace(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

}
