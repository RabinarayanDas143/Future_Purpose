package com.example.coreJava;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HassetPractice {
	public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        
        System.out.println("Max num is :"+ Collections.max(set));
        System.out.println("Min num is :"+ Collections.min(set));
	}
}
