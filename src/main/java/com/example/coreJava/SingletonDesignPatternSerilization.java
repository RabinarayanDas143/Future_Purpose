package com.example.coreJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonDesignPatternSerilization implements Serializable {
	private static SingletonDesignPatternSerilization singletonDesignPatternSerilization;
	
	public Object readResolve() {
		return singletonDesignPatternSerilization;
	}
     public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    	 singletonDesignPatternSerilization = new SingletonDesignPatternSerilization();
    	 System.out.println(singletonDesignPatternSerilization.hashCode());
    	 
    	 ObjectOutputStream ops1 = new ObjectOutputStream(new FileOutputStream("abc.text"));
    	 ops1.writeObject(singletonDesignPatternSerilization);
    	 ops1.close();
    	 
    	 ObjectInputStream ops2 = new ObjectInputStream(new FileInputStream("abc.text"));
    	 SingletonDesignPatternSerilization obj1 =(SingletonDesignPatternSerilization) ops2.readObject();
    	 ops2.close();
    	  System.out.println(obj1.hashCode());
	}
     
}
