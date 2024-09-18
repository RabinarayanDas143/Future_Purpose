package com.example.InterviewCoding6;

public class PrintRange6 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((i + j) - 1);
				if (j < n) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}

}
