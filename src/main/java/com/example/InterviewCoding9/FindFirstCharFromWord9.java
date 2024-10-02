package com.example.InterviewCoding9;

public class FindFirstCharFromWord9 {

	public static void main(String[] args) {
		String str = "My name is Abd";
		String result = getFirstCharFromWord(str);
		System.out.println(result);
	}

	private static String getFirstCharFromWord(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				if (i == 0 || str.charAt(i - 1) == ' ') {
					sb.append(str.charAt(i)+" ");
				}
			}
		}
		return sb.toString();
	}

}
