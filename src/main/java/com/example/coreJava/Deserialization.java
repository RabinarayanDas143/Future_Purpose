package com.example.coreJava;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) {
		try {
			String path = "C:/Users/HP/OneDrive/Desktop/Serialize/Serialize.txt";
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			StudentSeria student = (StudentSeria) ois.readObject();
			student.display();
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getAddress());
			fis.close();
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
