package com.example.coreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Testing  {
	  String name;
	  String address;

	public Testing(String name, String address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Testing other = (Testing) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name);
	}

	

}

public class HasmMapExample {
	public static void main(String[] args) {
		Testing tes1 = new Testing("Rabi", "Odisha");
		Testing tes2 = new Testing("Rabi", "Odisha");
		
		Map<Object, String> map = new HashMap<>();
		map.put(tes1, "Anything");
		map.put(tes2, "Else");
		
		System.out.println(map.size());
	}
}
