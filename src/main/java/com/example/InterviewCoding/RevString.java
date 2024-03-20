package com.example.InterviewCoding;

public class RevString {
	public static void main(String[] args) {
		String str = "Hello world";
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		String result = sb.toString();
		System.out.println(result);
	}
}
