package com.example.coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		//return this.id-o.id;
		return this.name.compareTo(o.name);
	}
	
}
public class ComparebleOperator {
   public static void main(String[] args) {
	 List<Emp> list =new ArrayList<Emp>();
	 list.add(new Emp(10, "Rabi"));
	 list.add(new Emp(5, "Aman"));
	 list.add(new Emp(9, "Ankit"));
	 list.add(new Emp(11, "Rakesh"));
	 list.add(new Emp(3, "Bikash"));
	 Collections.sort(list);
	 list.forEach((e)->{
		 System.out.println(e);
	 });
}
}
