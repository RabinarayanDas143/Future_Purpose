package com.example.java8CodingQuestion5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import ch.qos.logback.core.model.Model;

class ModelClass {
	private int id;
	private String name;
	private int age;
	private long salary;
	private String gender;
	private String deptName;
	private String city;
	private int yearOfJoining;

	public ModelClass(int id, String name, int age, long salary, String gender, String deptName, String city,
			int yearOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.deptName = deptName;
		this.city = city;
		this.yearOfJoining = yearOfJoining;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	@Override
	public String toString() {
		return "ModelClass [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender
				+ ", deptName=" + deptName + ", city=" + city + ", yearOfJoining=" + yearOfJoining + "]";
	}

}

public class OperationUsingModelClass {
	public static void main(String[] args) {
		List<ModelClass> empList = new ArrayList<>();
		empList.add(new ModelClass(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new ModelClass(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new ModelClass(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new ModelClass(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new ModelClass(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new ModelClass(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new ModelClass(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new ModelClass(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new ModelClass(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

		// Group employees by city
		Map<String, Long> map1 = empList.stream()
				.collect(Collectors.groupingBy(ModelClass::getCity, Collectors.counting()));
		// System.out.println(map1);

		// Group Employees by age
		Map<Integer, Long> map2 = empList.stream()
				.collect(Collectors.groupingBy(ModelClass::getAge, Collectors.counting()));
		// System.out.println(map2);

		// Find the count of male and female employees present in the organization
		Map<String, Long> map3 = empList.stream()
				.collect(Collectors.groupingBy(ModelClass::getGender, Collectors.counting()));
		// System.out.println(map3);

		// Print the names of all departments in the organization
		List<String> map4 = empList.stream().map(e -> e.getDeptName()).distinct().collect(Collectors.toList());
		// System.out.println(map4);

		// print employee details whose age is greater than 28
		List<ModelClass> map5 = empList.stream().filter(e -> e.getAge() > 28).collect(Collectors.toList());
		// System.out.println(map5);

		// find maximum age of employee
		ModelClass map6 = empList.stream().sorted((a, b) -> b.getAge() - a.getAge()).findFirst().get();
		// System.out.println(map6);
		ModelClass map7 = empList.stream().sorted(Comparator.comparingInt(ModelClass::getAge).reversed()).findFirst()
				.get();
		// System.out.println(map7);

		// Print Average age of Male and Female Employees
		Map<String, Double> map8 = empList.stream()
				.collect(Collectors.groupingBy(ModelClass::getGender, Collectors.averagingLong(ModelClass::getAge)));
		// System.out.println(map8);

		// Print the number of employees in each department.
		Map<String, Long> map9 = empList.stream()
				.collect(Collectors.groupingBy(ModelClass::getDeptName, Collectors.counting()));
		// System.out.println(map9);

		// Find oldest employee
		ModelClass map10 = empList.stream().sorted((a, b) -> a.getYearOfJoining() - b.getYearOfJoining()).findFirst()
				.get();
		// System.out.println(map10);

		// Find youngest female employee
		ModelClass map11 = empList.stream().filter(e -> e.getGender().equalsIgnoreCase("F"))
				.sorted((a, b) -> a.getAge() - b.getAge()).findFirst().get();
		// System.out.println(map11);

		// Find employees whose age is greater than 30 and less than 30
		List<ModelClass> map12_garter30 = empList.stream().filter(e -> e.getAge() > 30).collect(Collectors.toList());
		// System.out.println(map12_garter30);
		List<ModelClass> map13_lesse30 = empList.stream().filter(e -> e.getAge() < 30).collect(Collectors.toList());
		// System.out.println(map13_lesse30);

		// Find the department name which has the highest number of employees
		Entry<String, Long> map14 = empList.stream()
				.collect(Collectors.groupingBy(ModelClass::getDeptName, Collectors.counting())).entrySet().stream()
				.sorted((a, b) -> b.getValue().compareTo(a.getValue())).findFirst().get();
		// System.out.println(map14);

		// Find if there any employees from HR Department
		ModelClass map15 = empList.stream().filter(e -> e.getDeptName().equalsIgnoreCase("HR")).findAny().get();
		// System.out.println(map15);

		// Find the department names where the number of employees in the department is
		// over 3
		List<Entry<String, Long>> map16 = empList.stream()
				.collect(Collectors.groupingBy(ModelClass::getDeptName, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 3).collect(Collectors.toList());
		// System.out.println(map16);

		// Find distinct department names that employees work for.
		List<String> map17 = empList.stream().map(e -> e.getDeptName()).distinct().collect(Collectors.toList());
		// System.out.println(map17);

		// Find all employees who lives in ‘Blore’ city, sort them by their name and
		// print the names of employees.
		List<String> map18 = empList.stream().filter(e -> e.getCity().equalsIgnoreCase("Blore")).map(e -> e.getName())
				.collect(Collectors.toList());
		// System.out.println(map18);

		// No of employees in the organisation
		Long map19 = empList.stream().count();
		// System.out.println(map19);

		// Find employee count in every department
		Map<String, Long> map20 = empList.stream()
				.collect(Collectors.groupingBy(ModelClass::getDeptName, Collectors.counting()));
		// System.out.println(map20);

		// Find the department which has the highest number of employees.
		Entry<String, Long> map21 = empList.stream()
				.collect(Collectors.groupingBy(ModelClass::getDeptName, Collectors.counting())).entrySet().stream()
				.sorted((a, b) -> b.getValue().compareTo(a.getValue())).findFirst().get();
		// System.out.println(map21);

		// Sorting a Stream by age and name fields
		List<ModelClass> map22 = empList.stream().sorted((a, b) -> a.getName().compareTo(b.getName()))
				.sorted((a, b) -> a.getAge() - b.getAge()).collect(Collectors.toList());
		// map22.forEach(System.out::println);
		Comparator<ModelClass> name = (a, b) -> a.getName().compareTo(b.getName());
		Comparator<ModelClass> age = (a, b) -> a.getAge() - b.getAge();
		List<ModelClass> map23 = empList.stream().sorted(name.thenComparing(age)).collect(Collectors.toList());
		// map23.forEach(System.out::println);

		// Highest experienced employees in the organization
		ModelClass map24 = empList.stream().sorted((a, b) -> a.getYearOfJoining() - b.getYearOfJoining()).findFirst()
				.get();
		//System.out.println(map24);
		
		// Print average and total salary of the organization.
		long map25_totalSalary = empList.stream().collect(Collectors.summingLong(e->e.getSalary()));
		//System.out.println(map25_totalSalary);
		Double map26_averageSalary = empList.stream().collect(Collectors.averagingLong(e->e.getSalary()));
		//System.out.println(map26_averageSalary);
	}
}
