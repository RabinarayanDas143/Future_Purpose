package com.example.coreJava;


final class EmployeeImmutableTest implements Cloneable {
	private static EmployeeImmutableTest obj;
	private final int id;
	private final String name;

	public EmployeeImmutableTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return obj;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		  obj = new EmployeeImmutableTest(1, "Rabi");
		//System.out.println(obj.getId());
		//System.out.println(obj.getName());
		EmployeeImmutableTest cloneObj = (EmployeeImmutableTest) obj.clone();
		System.out.println(obj.hashCode());
		System.out.println(cloneObj.hashCode());
	}
}
