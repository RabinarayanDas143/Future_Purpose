package com.example.InterviewCoding8;

public class PrintNext5Char8 {

	public static void main(String[] args) {
		Character ch = 'b';
		for (int i = 1; i <= 5; i++) {
			Character c = (char) (ch + i);
			System.out.print(c + " ");
		}
	}

}
