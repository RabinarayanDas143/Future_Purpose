package com.example.java8CodingQuestion4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class MultipleEmployee {
	private int id;
	private String name;
	private int age;
	private long salary;
	private String gender;
	private String deptName;
	private String city;
	private int yearOfJoining;

	public MultipleEmployee(int id, String name, int age, long salary, String gender, String deptName, String city,
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
		return "MultipleEmployee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender="
				+ gender + ", deptName=" + deptName + ", city=" + city + ", yearOfJoining=" + yearOfJoining + "]";
	}

}

public class MultipleOperationUsingModelClass {

	public static void main(String[] args) {

		List<MultipleEmployee> empList = new ArrayList<>();
		empList.add(new MultipleEmployee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new MultipleEmployee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new MultipleEmployee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new MultipleEmployee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new MultipleEmployee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new MultipleEmployee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new MultipleEmployee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new MultipleEmployee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new MultipleEmployee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

		// Group employees by city
		// Map<String, List<MultipleEmployee>> map =
		empList.stream().collect(Collectors.groupingBy(MultipleEmployee::getCity));
		// System.out.println(map);

		// Group Employees by age
		Map<Integer, Long> map = empList.stream().map(MultipleEmployee::getAge)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		for (Map.Entry<Integer, Long> mp : map.entrySet()) {
			// System.out.println(mp.getKey() + " : " + mp.getValue());
		}

		// Find the count of male and female employees present in the organization
		Map<String, Long> map1 = empList.stream().map(MultipleEmployee::getGender)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// map1.forEach((k, v) -> System.out.println(k + ":" + v));

		// Print the names of all departments in the organization
		List<String> map2 = empList.stream().map(MultipleEmployee::getDeptName).collect(Collectors.toList());
		// map2.forEach(System.out::println);

		// print employee details whose age is greater than 28
		List<MultipleEmployee> list = empList.stream().filter(e -> e.getAge() > 28).collect(Collectors.toList());
		// list.forEach(System.out::println);

		// find maximum age of employee
		MultipleEmployee map3 = empList.stream().sorted((a, b) -> b.getAge() - a.getAge()).findFirst().get();
		// System.out.println(map3);
		MultipleEmployee map4 = empList.stream().sorted(Comparator.comparingInt(MultipleEmployee::getAge).reversed())
				.findFirst().get();
		// System.out.println(map4);

		// Print Average age of Male and Female Employees
		Map<String, Double> map5 = empList.stream().collect(
				Collectors.groupingBy(MultipleEmployee::getGender, Collectors.averagingLong(MultipleEmployee::getAge)));
		// map5.forEach((k, v) -> System.out.println(k + ":" + v));

		// Print the number of employees in each department.
		Map<String, Long> map6 = empList.stream().map(e -> e.getDeptName())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// map6.forEach((k, v) -> System.out.println(k + ":" + v));

		// Find oldest employee
		MultipleEmployee map7 = empList.stream().sorted((a, b) -> a.getYearOfJoining() - b.getYearOfJoining())
				.findFirst().get();
		// System.out.println(map7);

		// Find youngest female employee
		MultipleEmployee map8 = empList.stream().filter(e -> e.getGender().equalsIgnoreCase("F"))
				.sorted((a, b) -> a.getAge() - b.getAge()).findFirst().get();
		// System.out.println(map8);

		// Find employees whose age is greater than 30 and less than 30
		List<MultipleEmployee> graterthan30map9 = empList.stream().filter(e -> e.getAge() > 30)
				.collect(Collectors.toList());
		// graterthan30map9.forEach(System.out::println);
		List<MultipleEmployee> lessthan30map9 = empList.stream().filter(e -> e.getAge() < 30)
				.collect(Collectors.toList());
		// essthan30map9.forEach(System.out::println);

		// Find the department name which has the highest number of employees
		Entry<String, Long> map10 = empList.stream()
				.collect(Collectors.groupingBy(MultipleEmployee::getDeptName, Collectors.counting())).entrySet()
				.stream().max(Comparator.comparingLong(e -> e.getValue())).get();
		// System.out.println(map10);

		// Find if there any employees from HR Department
		MultipleEmployee map11 = empList.stream().filter(e -> e.getDeptName().equalsIgnoreCase("HR")).findAny().get();
		// System.out.println(map11);

		// Find the department names where the number of employees in the department is
		// over 3
		List<Entry<String, Long>> map12 = empList.stream()
				.collect(Collectors.groupingBy(MultipleEmployee::getDeptName, Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() > 3).collect(Collectors.toList());
		// System.out.println(map12);

		// Find distinct department names that employees work for.
		List<String> map13 = empList.stream().map(e -> e.getDeptName()).distinct().collect(Collectors.toList());
		// System.out.println(map13);

		// Find all employees who lives in ‘Blore’ city, sort them by their name and
		// print the names of employees.
		List<String> map14 = empList.stream().filter(e -> e.getCity().equalsIgnoreCase("Blore")).map(e -> e.getName())
				.sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		// map14.forEach(System.out::println);

		// No of employees in the organisation
		Long count = empList.stream().count();
		// System.out.println(count);

		// Find employee count in every department
		Map<String, Long> map15 = empList.stream()
				.collect(Collectors.groupingBy(MultipleEmployee::getDeptName, Collectors.counting()));
		// System.out.println(map15);

		// Find the department which has the highest number of employees.
		Optional<Entry<String, Long>> map16 = empList.stream()
				.collect(Collectors.groupingBy(MultipleEmployee::getDeptName, Collectors.counting())).entrySet()
				.stream().max(Comparator.comparingDouble(e -> e.getValue()));
		// System.out.println(map16);

		// Sorting a Stream by age and name fields
		List<MultipleEmployee> map17 = empList.stream().sorted((a, b) -> a.getAge() - b.getAge())
				.sorted((a, b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
		//map17.forEach(System.out::println);
		Comparator<MultipleEmployee> name_compare = (a,b)->a.getName().compareTo(b.getName());
		Comparator<MultipleEmployee> age_compare = (a,b)->a.getAge()-b.getAge();
		List<MultipleEmployee> map18 = empList.stream().sorted(name_compare.thenComparing(age_compare)).collect(Collectors.toList());
		//map18.forEach(System.out::println);
				
		
	}

}
