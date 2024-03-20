package com.example.java8Features;

import java.util.Collections;

interface shape {
	void draw();

	default void defultMethod() {
		System.out.println("Default method called of draw interface");
	}

	static void staticMethod() {
		System.out.println("static method called of draw interface");
	}
	
	static void staticMethodInInterface() {
		System.out.println("staticMethodInInterface method inside intrface");
	}
}

class Rectangle implements shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Here is the draw method in Rectange class");
	}
	 
}

class Tringle implements shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw method in Triangle class");
	}
	
	static void staticMethod() {
		System.out.println("static method called of Tringle class");
	}

}

public class DefultStaticMethodInInterface {
	public static void main(String[] args) {
		Tringle tringle = new Tringle();
		tringle.defultMethod();
		Tringle.staticMethod();
		shape.staticMethodInInterface();
	 
	}

}
