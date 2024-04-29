package com.example.coreJava;

interface aa{
	public void ab();
	public void bc();
	public void cd();
	public static void de() {
		System.out.println("jkdhck");
	}
	public default void dd() {
		System.out.println("snKCu");
	}
}
 
public class Interface1 implements aa{

	@Override
	public void ab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cd() {
		// TODO Auto-generated method stub
		
	}
	
	public  void dd() {
		System.out.println("snKCu");
	}
	public static void main(String[] args) {
		aa.de();
	}

}
