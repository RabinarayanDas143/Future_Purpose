package com.example.InterviewCoding9;

public class ReverseStringWordBasis9 {

	public static void main(String[] args) {
        String str = "My Name is Rabi";
        String result = getreverseString(str);
        System.out.println(result);
	}

	private static String getreverseString(String str) {
		StringBuilder sb = new StringBuilder();
		String[] array = str.split(" ");
		for(int i=0;i<array.length;i++) {
			sb.append(new StringBuilder(array[i]).reverse().append(" "));
		}
		String result = sb.toString();
		return result;
	}

}
