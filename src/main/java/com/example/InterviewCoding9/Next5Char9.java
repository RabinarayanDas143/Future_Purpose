package com.example.InterviewCoding9;

public class Next5Char9 {

	public static void main(String[] args) {
		char ch = 'b';
		for (int i = 1; i <= 5; i++) {
			char c = (char) (ch + i);
			System.out.print(c+" ");
		}
	}

}
