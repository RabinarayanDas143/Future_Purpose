package com.example.coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class ImmutableEmployee {
	private final int id;
	private final String name;
	private final List<String> friendsList;

	public ImmutableEmployee(int id, String name, List<String> friendsList) {
		super();
		this.id = id;
		this.name = name;
		List<String> listCont = new ArrayList<>();
		for (String str : friendsList) {
			listCont.add(str);
		}
		this.friendsList = listCont;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getFriendsList() {
		List<String> listCont = new ArrayList<>();
		for (String str : this.friendsList) {
			listCont.add(str);
		}
		return listCont;
	}

	@Override
	public String toString() {
		return "ImmutableEmployee [id=" + id + ", name=" + name + ", friendsList=" + friendsList + "]";
	}
	
	

}

public class ImmutableExample {
	public static void main(String[] args) {
		List<String> friends =Arrays.asList("Ram","Shyam","Kolia");
		ImmutableEmployee obj =new ImmutableEmployee(1, "Rabi", friends);
		System.out.println(obj);
		obj = new ImmutableEmployee(2,"ankit",friends);
		System.out.println(obj);
		//friends.add("Amol");
		//System.out.println(obj);
	}
}
