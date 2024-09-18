package com.example.InterviewCoding6;

public class Printnext5Char6 {

	public static void main(String[] args) {
		 char ch = 'z';
		 for(int i=1;i<=5;i++) {
			 char nextChar = (char) (ch+i);
			 System.out.print(nextChar);
			 System.out.print(" ");
		 }
	}

}
