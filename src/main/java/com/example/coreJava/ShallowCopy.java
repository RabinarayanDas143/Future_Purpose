package com.example.coreJava;

import java.util.Arrays;
import java.util.List;

class Shallow implements Cloneable{
	private int id;
	private String name;
	private List<String> course;
	
	
	
	public Shallow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shallow(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Shallow(int id, String name, List<String> course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Shallow [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	 
	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
}

public class ShallowCopy extends Shallow {

	 
	public static void main(String[] args) throws CloneNotSupportedException {
		 List<String> course = Arrays.asList("A", "B", "C");
	        Shallow s1 = new Shallow(1, "Java", course);
	        Shallow s2 = (Shallow) s1.clone(); // Shallow copy

	        System.out.println("Before modification:");
	        System.out.println("s1: " + s1);
	        System.out.println("s2: " + s2);

	        // Modifying the course list of s2
	        s2.getCourse().set(0, "D");

	        System.out.println("After modification:");
	        System.out.println("s1: " + s1); // The course list in s1 remains the same
	        System.out.println("s2: " + s2); // s2 has a new course list
	        
	         Integer i1 = new Integer(100);
	         Integer i2 = new Integer(100);
	         System.out.println(i1.hashCode());
	         System.out.println(i2.hashCode());
	         System.out.println(i1.equals(i2));
	}

}
