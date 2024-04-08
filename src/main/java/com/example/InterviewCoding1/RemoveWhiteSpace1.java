package com.example.InterviewCoding1;

public class RemoveWhiteSpace1 {
	
	public static String removeWhiteSpace(String str) {
		char[] charArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(char c:charArray) {
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
          String removeWhiteSpace = removeWhiteSpace("I am a java Developer");
          System.out.println(removeWhiteSpace);
	}
}
