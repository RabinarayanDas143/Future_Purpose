package com.example.coreJava;

import java.util.Vector;

public class VectorPractice {
	public static void main(String[] args) {
        Vector v= new Vector<>();
        v.addElement("Rabi");
        v.addElement("Aman");
        v.addElement("Gupta");
        v.addElement("Nilesh");
        
        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v);
        System.out.println(v.lastElement());
        System.out.println(v.removeElement("Gupta"));
        System.out.println(v.capacity());
	}
}
