package com.example.coreJava;
@FunctionalInterface
interface printable{
	public void print();
	public static String method1(){
		return "Rabii";
	}
}
@FunctionalInterface
interface display{
	public void print();
	public static String method1(){
		return "Aakash";
	}
};
public class MultipleInterface implements printable,display{

	 
	
	public static void main(String[] args) {
		MultipleInterface obj = new MultipleInterface();
		 
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	display.super.method1();
 

}
