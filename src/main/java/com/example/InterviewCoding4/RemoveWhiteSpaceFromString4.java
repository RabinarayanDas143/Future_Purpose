package com.example.InterviewCoding4;

public class RemoveWhiteSpaceFromString4 {
	public static void main(String[] args) {
		String str = "I am a java developer";
		String result = removeWhiteSpace(str);
		System.out.println(result);
	}

	private static String removeWhiteSpace(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)!=' ') {
				 sb.append(str.charAt(i));
			 }
		}
		return sb.toString();
	}
}
