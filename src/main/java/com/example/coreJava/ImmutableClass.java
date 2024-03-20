package com.example.coreJava;
final class Emloyee{
	private final int id;
	private final String name;
	public Emloyee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Emloyee [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class ImmutableClass {
 public static void main(String[] args) {
	 Emloyee obj = new Emloyee(10,"Rabinarayan Das");
	 System.out.println(obj.toString());
	 
	// Emloyee.name="Harish";
}
}
