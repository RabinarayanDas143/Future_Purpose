package com.example.coreJava;

import java.lang.reflect.Constructor;

public class SingletonDesignPattern {

	private static SingletonDesignPattern singletonDesignPattern;

	private SingletonDesignPattern() {
           if(singletonDesignPattern!=null) {
        	    throw new RuntimeException ("You are trying to break singleton design pattern");
           }
	}

	public static SingletonDesignPattern getSingletonObj() {
		if (singletonDesignPattern == null) {
			synchronized (SingletonDesignPattern.class) {
				if (singletonDesignPattern == null) {
					singletonDesignPattern = new SingletonDesignPattern();
				}
			}
		}
		return singletonDesignPattern;
	}
	
	public static void main(String [] ram) throws Exception {
		System.out.println(getSingletonObj().hashCode());
		
		// Reflection API to break Singleton Design pattern.
		Constructor<SingletonDesignPattern> construnctor=SingletonDesignPattern.class.getDeclaredConstructor();
		SingletonDesignPattern obj =construnctor.newInstance();
		System.out.println(obj.hashCode());
		
		// To overcome Reflection API   1 .we use enum inted of class ;
		//                              2. if object is present then throws Exception inside constructor;
	}
	
}
