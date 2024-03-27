package com.example.coreJava;

class CheckedException extends Exception {
	public CheckedException(String str) {
		super(str);
	}
}

public class CustomExceptionWithChecked {
	public static void main(String[] args) {
		try {
			throw new CheckedException("Checked exception occoured");
		} catch (CheckedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
