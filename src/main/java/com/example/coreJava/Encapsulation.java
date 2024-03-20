package com.example.coreJava;

  class Employee {
	
	private String name;
	private double salary;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
  
  public class Encapsulation{
	  public static void main(String[] args) {
		  Employee obj =  new Employee();
		  obj.setName("Rabi");
		  obj.setSalary(21000.00);
		  obj.setAddress("ODISHA");
		  
		  System.out.println("Name is :"+obj.getName());
		  System.out.println("Salary is :"+obj.getSalary());
		  System.out.println("Address is :"+obj.getAddress());
	  }
  }
