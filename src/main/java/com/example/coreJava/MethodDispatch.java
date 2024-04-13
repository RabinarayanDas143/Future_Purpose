package com.example.coreJava;

class ParentA {
	void show() {
		System.out.println("Parent A show");
	}
}

class ChildA extends ParentA{
	void show() {
		System.out.println("ChileA show");
	}
}

class SubChildA extends ParentA{
	void show() {
		System.out.println("SubChildA show");
	}
}

public class MethodDispatch {
	public static void main(String[] args) {
         ParentA obj = new ParentA();
         obj.show();
         
         obj = new ChildA();
         obj.show();
         
         obj = new SubChildA();
         obj.show();
	}
}
