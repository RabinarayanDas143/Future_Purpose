package com.example.InterviewCoding8;

public class PrintRange8 {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print((i + j) - 1);
				if (j < num) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}

}
