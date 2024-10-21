package com.example.InterviewCoding9;

public class TrimaString9 {

	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		String result = str.substring(0, 4).concat("...").trim();
		System.out.println(result);
	}

}
