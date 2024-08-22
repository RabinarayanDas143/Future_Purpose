package com.example.InterviewCoding5;

public class PrintRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((i + j) - 1);
				if (j < n) { // Print a comma if it's not the last element in the row
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}

}
