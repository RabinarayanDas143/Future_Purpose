package com.example.InterviewCoding;

public class ExcepHand {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 20;
			int c=a+b;
			System.out.println(c);
			//System.exit(0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getMessage();
		}
		finally {
			System.out.println("Final block");
		}
	}
}
