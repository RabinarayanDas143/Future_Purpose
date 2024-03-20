package com.example.coreJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class EmployeeClone {
	private final int id;
	private final String name;
	private final List<String> friendsList;

	public EmployeeClone(int id, String name, List<String> friendsList) {
		this.id = id;
		this.name = name;
		this.friendsList = Collections.unmodifiableList(friendsList);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getFriendsList() {
		return Collections.unmodifiableList(friendsList);
	}

	@Override
	public String toString() {
		return "EmployeeClone [id=" + id + ", name=" + name + ", friendsList=" + friendsList + "]";
	}
	
	
}

public class ImmutableExampleUseClone {
public static void main(String[] args) {
	List<String> friendsList = Arrays.asList("Ram","Shyam","Kolia");
	EmployeeClone obj = new EmployeeClone(0, "Rabi",friendsList );
	System.out.println(obj);
	friendsList.add("Amol");
	System.out.println(obj);
}
}
