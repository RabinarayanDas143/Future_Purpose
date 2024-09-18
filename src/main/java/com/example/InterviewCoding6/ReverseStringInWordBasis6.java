package com.example.InterviewCoding6;

public class ReverseStringInWordBasis6 {

	public static void main(String[] args) {

		String str = "My Name is Rabi.";
		String result = getreverse(str);
		System.out.println(result);
		
		String result1 = getreverse1(str);
		System.out.println(result1);
	}

	private static String getreverse1(String str) {
		String reverse = null;
		StringBuilder sb = new StringBuilder();
		String[] strArray = str.split(" ");
		for(String st : strArray) {
			reverse = new StringBuilder(st).reverse().toString();
			sb.append(reverse).append(" ");
		}
		return sb.toString();
	}

	private static String getreverse(String str) {
		StringBuilder sb = new StringBuilder();
		String reverse = null;
		String[] strarray = str.split(" ");
		for (String input : strarray) {
			for (int i = input.length() - 1; i >= 0; i--) {
				sb.append(input.charAt(i));
			}
			reverse=sb.append(" ").toString();
		}
		return reverse.toString();
	}

}
