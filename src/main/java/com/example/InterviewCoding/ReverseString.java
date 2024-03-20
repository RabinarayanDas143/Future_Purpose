package com.example.InterviewCoding;

public class ReverseString {
	public static String doReverse(String str) {
		StringBuffer sbr = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			sbr = sbr.append(str.charAt(i));
		}
		String result = sbr.toString();
		return result;
	}

	public static void main(String[] ram) {
		ReverseString obj = new ReverseString();
		//String result = obj.doReverse("Rabinarayan Das");
		//System.out.println(doReverse("RAbinarayan Das"));
		//System.out.println(result);
	}
}
