package com.example.coreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.management.RuntimeErrorException;

class Student1 implements Cloneable{
	private int id;
	private String Name;
	public Student1(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
//	  @Override
//	protected Object clone() throws CloneNotSupportedException {
//		   throw new CloneNotSupportedException();
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(Name, id);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student1 other = (Student1) obj;
//		return Objects.equals(Name, other.Name) && id == other.id;
//	}
	
}


public class SingletonDesignPatternClone {
	 private static SingletonDesignPatternClone singletonDesignPatternClone;
	 
	public Object clone() throws CloneNotSupportedException{
		 
		return singletonDesignPatternClone;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException   {
		singletonDesignPatternClone =new SingletonDesignPatternClone();
		//System.out.println(singletonDesignPatternClone.hashCode());
		
		
		
		SingletonDesignPatternClone obj1=(SingletonDesignPatternClone) singletonDesignPatternClone.clone();
		//System.out.println(obj1.hashCode());
		
		Student1 s = new Student1(1, "Rabi");
		System.out.println(s.hashCode());
		
		//Student1 s1 = (Student1) s.clone();
		//System.out.println(s1.hashCode());
		
		Student1 s2 = new Student1(1, "Rabi");
		System.out.println(s2.hashCode());
		
		Map<Student1, String> map = new HashMap<>();
		map.put(s, "A");
		map.put(s2, "B");
		s=new Student1(1, "C");
		map.put(s, "c");
		System.out.println(map.get(s)); //1
		
		Map<String, Student1> map1 = new HashMap<>();
		map1.put("jhasvgy", s);
		map1.put("ahsjcvj", s2);
		
		System.out.println(map1.size()); //2
	}
}
