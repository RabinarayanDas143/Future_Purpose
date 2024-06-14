package com.example.InterviewCoding3;

public class RemoveWhiteSpaceFromString3 {
	public static void main(String[] args) {
       String str = "I am a Java Developer";
       String result  = removeWhiteSpace(str);
       System.out.println(result);
	}

	private static String removeWhiteSpace(String str) {
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!Character.isWhitespace(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
}
