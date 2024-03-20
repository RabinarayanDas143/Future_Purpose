package com.example.java8Features.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product {
	private int id;
	private String name;
	private float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;

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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class StreamFilterExample {

	public static void main(String[] args) {
		// traditional way
		for (Product product : getProduct()) {
			if (product.getPrice() >= 25000) {
				//System.out.println(product);
			}
		}
		// using Stream API
		List<Product> product = getProduct().stream().filter((str) -> str.getPrice() >= 25000)
				.collect(Collectors.toList());
		//product.forEach(System.out::println);
		// other way 
		getProduct().stream().filter((str) -> str.getPrice() >= 25000).forEach(System.out::println);
	}

	private static List<Product> getProduct() {
		List<Product> list = new ArrayList<>();
		list.add(new Product(101, "Lenovo", 20000));
		list.add(new Product(102, "Samsung", 25000));
		list.add(new Product(103, "Hp", 30000));
		list.add(new Product(104, "Ashus", 22000));
		list.add(new Product(105, "Ipad", 100000));
		return list;
	}

}
