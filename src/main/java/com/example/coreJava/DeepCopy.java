package com.example.coreJava;

import java.util.ArrayList;
import java.util.List;

class Deep implements Cloneable {
	private int id;
	private String Name;
	private List<String> course;

	public Deep(int id, String name, List<String> course) {
		super();
		this.id = id;
		Name = name;
		this.course = new ArrayList<>(course);
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

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Deep [id=" + id + ", Name=" + Name + ", course=" + course + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Deep deep = (Deep) super.clone();
		deep.course = new ArrayList<>(this.course);
		return deep;
	}
}

public class DeepCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> courses = new ArrayList<>();
		courses.add("Math");
		courses.add("Science");

		Deep d1 = new Deep(1, "John", courses);
		Deep d2 = (Deep) d1.clone(); // Perform deep copy

		System.out.println("Before modification:");
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);

		// Modifying the course list of d2
		d2.getCourse().set(0, "History");

		System.out.println("After modification:");
		System.out.println("d1: " + d1); // d1's course list remains unchanged
		System.out.println("d2: " + d2); // d2 has the modified course list
	}
}
