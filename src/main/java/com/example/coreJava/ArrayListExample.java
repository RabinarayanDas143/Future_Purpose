package com.example.coreJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
 
public class ArrayListExample {
	
	static String name;
	static String address;
	
	public ArrayListExample(String name , String adress) {
		this.name=name;
		this.address=adress;
	}
	
	public static void main(String[] args) {
        int n=10;
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int i=1;i<=n;i++) {
        	arraylist.add(i);
        	
        }
        //System.out.print(arraylist + " ");
        
        ArrayList<String> araylist1 = new ArrayList<>();
        araylist1.add("a");
        araylist1.add("c");
        araylist1.add("d");
        araylist1.add("e");
        araylist1.add("f");
        //System.out.println(araylist1);
        araylist1.add(1, "b");
        //System.out.println(araylist1);
//        System.out.println(araylist1.remove(4));
//        System.out.println(araylist1);
//        System.out.println(araylist1.set(4, "e"));
//        System.out.println(araylist1);
        //araylist1.forEach(System.out::print);
         
        ArrayList<String> al = new ArrayList<>();
        al.add("c");
        al.add("e");
        al.add("b");
        al.add("d");
        al.add("a");
        //al.forEach(System.out::print);
        Collections.sort(al);
       // System.out.print(al);
        
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(5);
        integer.add(3);
        integer.add(2);
        integer.add(4);
        integer.add(1);
        Collections.sort(integer);
       // System.out.print(integer);
        
        ArrayListExample s1 = new ArrayListExample("Sonoo","address");
        
        ArrayList array = new ArrayList<>();
        array.add(1);
        array.add("a");
        array.add(1.1);
        System.out.println(array);
	}
}
