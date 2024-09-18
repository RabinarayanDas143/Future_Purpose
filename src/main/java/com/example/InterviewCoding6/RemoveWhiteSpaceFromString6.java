package com.example.InterviewCoding6;

public class RemoveWhiteSpaceFromString6 {

	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}
