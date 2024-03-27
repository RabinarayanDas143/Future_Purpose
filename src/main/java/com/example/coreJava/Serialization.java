package com.example.coreJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentSeria implements Serializable{
	private int id;
	private String name;
	transient private String Address;

	public StudentSeria(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	public void display() {
		System.out.println("hii my name is Rabi");
	}

}

public class Serialization {
	public static void main(String[] args) {
        try {
        	StudentSeria obj = new StudentSeria(10, "Rabi", "Odisha");
        	String path ="C:/Users/HP/OneDrive/Desktop/Serialize/Serialize.txt";
        	FileOutputStream fos = new FileOutputStream(path);
        	ObjectOutputStream oos = new ObjectOutputStream(fos);
        	oos.writeObject(obj);
        	oos.close();
        	fos.close();
        	 
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
