package com.example.coreJava;

import java.util.Set;

public class TreeSet {
public static void main(String[] args) {
	Set<Integer> set = new java.util.TreeSet<>((a,b)->b-a);
	
	set.add(2);
	set.add(4);
	set.add(5);
	set.add(7);
	set.add(2);
	set.add(9);
	set.add(10);
	System.out.println(set);
	
	Set<String> strset = new java.util.TreeSet<>((a,b)->b.compareTo(a));
	strset.add("Rabi");
	strset.add("Aman");
	strset.add("vinod");
	strset.add("Ramesh");
	strset.add("Himesh");
	strset.add("Ankit");
	
	System.out.println(strset);
}
}
