package com.example.InterviewCoding5;

public class PrintNext5Char {

	public static void main(String[] args) {
		 
		char inputChar = 'b';
		
		for (int i = 1; i <= 5; i++) {
            char nextChar = (char) (inputChar + i);
            System.out.print(nextChar);
            System.out.print(' ');
        }

	}

}
