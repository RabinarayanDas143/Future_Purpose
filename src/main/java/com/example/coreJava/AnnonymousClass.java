package com.example.coreJava;

interface Annonymous {
	public void print();
}

public class AnnonymousClass {
	public static void main(String[] args) {
		Annonymous an = new Annonymous() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Heyy i am calling ....");
			}
		};
		an.print();
	}
}
