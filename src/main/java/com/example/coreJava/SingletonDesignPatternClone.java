package com.example.coreJava;

public class SingletonDesignPatternClone implements Cloneable{
	 private static SingletonDesignPatternClone singletonDesignPatternClone;
	 
	public Object clone() throws CloneNotSupportedException{
		 
		return singletonDesignPatternClone;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		singletonDesignPatternClone =new SingletonDesignPatternClone();
		System.out.println(singletonDesignPatternClone.hashCode());
		
		
		
		SingletonDesignPatternClone obj1=(SingletonDesignPatternClone) singletonDesignPatternClone.clone();
		System.out.println(obj1.hashCode());
	}
}
