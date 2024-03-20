package com.example.InterviewCoding;

import java.lang.reflect.Constructor;
import java.util.Arrays;

import com.example.coreJava.SingletonDesignPattern;

public class SecondLargest {

	public static void main(String[] args) throws Exception{
		// using logic 
		int temp, size;
		int array[] = { 10, 20, 25, 63, 96, 57 };
		size = array.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]>array[j]) {
					array[i]=array[i]+array[j];
					array[j]=array[i]-array[j];
					array[i]=array[i]-array[j];
				}
			}
		}
		// System.out.println("Second largest number is :"+array[size-2]);
		
//		SingletonDesignPattern s1=SingletonDesignPattern.getSingletonObj();
//		System.out.println(s1.hashCode());
//		
//		Constructor<SingletonDesignPattern> construnctor=SingletonDesignPattern.class.getDeclaredConstructor();
//		construnctor.setAccessible(true);
//		SingletonDesignPattern obj =construnctor.newInstance();
//		System.out.println(obj.hashCode());
		
		
    // using sort method
//		int size1 = array.length;
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//		System.out.println(array[size1 - 2]);
	}
}
