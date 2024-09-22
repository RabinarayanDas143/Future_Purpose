package com.example.InterviewCoding7;

public class PalindromString7 {

	public static void main(String[] args) {
         String str1 = "Level";
         
         String result = checkPalindromString(str1);
         System.out.println(result);
	}

	private static String checkPalindromString(String str1) {
		StringBuilder sb = new StringBuilder();
		String str = str1.toLowerCase();
		for(int i =str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		if(str.equals(sb.toString())) {
			return "Given Stirng is a Palindrom String..";
		}else {
			return "Given Stirng is not a Palindrom String..";
		}
		 
	}

}
