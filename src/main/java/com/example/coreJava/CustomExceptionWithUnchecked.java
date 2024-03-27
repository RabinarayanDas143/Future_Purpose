package com.example.coreJava;

class UncheckedException extends RuntimeException {
	public UncheckedException(String str) {
		super(str);
	}
}

public class CustomExceptionWithUnchecked {
	public static void main(String[] args) {
         throw new UncheckedException("Unchecked Exception");
	}
}
