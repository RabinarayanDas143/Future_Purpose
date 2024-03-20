package com.example.coreJava;

import java.lang.reflect.Constructor;

public enum SingletonPatternEnum {
	INSTANCE;
	
	public void print() {
		System.out.println("print method");
	}
	
	public static void main(String[] args) throws Exception {
		SingletonPatternEnum obj = SingletonPatternEnum.INSTANCE;
		System.out.println(obj.hashCode());
		obj.print();
		
		Constructor<SingletonPatternEnum> construnctor=SingletonPatternEnum.class.getDeclaredConstructor();
		SingletonPatternEnum obj1 =construnctor.newInstance();
		System.out.println(obj1.hashCode());
	}
}
