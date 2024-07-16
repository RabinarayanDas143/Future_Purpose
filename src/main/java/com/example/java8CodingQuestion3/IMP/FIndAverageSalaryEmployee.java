package com.example.java8CodingQuestion3.IMP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

class Employee1 {
	private int id;
	private String name;
	private int age;
	private long salary;
	private String gender;
	private String deptName;
	private String city;
	private int yearOfJoining;

	public Employee1(int id, String name, int age, long salary, String gender, String deptName, String city,
			int yearOfJoining) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.deptName = deptName;
		this.city = city;
		this.yearOfJoining = yearOfJoining;
	}

	@Override
	public String toString() {
		return "Employee1{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", salary=" + salary
				+ ", gender='" + gender + '\'' + ", deptName='" + deptName + '\'' + ", city='" + city + '\''
				+ ", yearOfJoining='" + yearOfJoining + '\'' + '}';
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
}

public class FIndAverageSalaryEmployee {
	public static void main(String[] args) {
		// i/p list of employee
		List<Employee1> empList = new ArrayList<>();
		empList.add(new Employee1(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee1(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee1(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee1(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee1(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee1(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee1(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee1(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee1(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

		// Group employees by city
//		Map<String, List<Employee1>> map = empList.stream().collect(Collectors.groupingBy(e -> e.getCity()));
//		for (Map.Entry<String, List<Employee1>> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}

		// Group Employees by age
//		Map<Integer, List<Employee1>> map = empList.stream().collect(Collectors.groupingBy(e -> e.getAge()));
//		for (Entry<Integer, List<Employee1>> emp : map.entrySet()) {
//			System.out.println(emp.getKey() + " : " + emp.getValue());
//		}

		// Find the count of male and female employees present in the organization
//		Map<String, Long> map = empList.stream()
//				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
//		for (Entry<String, Long> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}

		// Print the names of all departments in the organization
//		List<String> list = empList.stream().map(e -> e.getDeptName()).distinct().collect(Collectors.toList());
//		System.out.println(list);

		// print employee details whose age is greater than 28
//		List<Employee1> list = empList.stream().filter(e -> e.getAge() > 28).collect(Collectors.toList());
//		System.out.println(list);

		// find maximum age of employee
		// Optional<Employee1> employee1 =
		// empList.stream().max((a,b)->a.getAge()-b.getAge());
//		Optional<Employee1> employee1 = empList.stream().max(Comparator.comparingInt(e->e.getAge()));
//		System.out.println(employee1);

		// Print Average age of Male and Female Employees
//		Map<String, Double> map = empList.stream()
//				.collect(Collectors.groupingBy((e) -> e.getGender(), Collectors.averagingDouble(e -> e.getAge())));
//		for (Entry<String, Double> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}

		// Print the number of employees in each department.
//		Map<String, Long> map = empList.stream()
//				.collect(Collectors.groupingBy((e) -> e.getDeptName(), Collectors.counting()));
//		System.out.println(map);
		
		
		//Find oldest employee
//		OptionalInt employee1 = empList.stream().mapToInt(e->e.getAge()).max();
//		System.out.println(employee1);
//		Employee1 employee1 = empList.stream().sorted((a,b)->b.getAge()-a.getAge()).findFirst().get();
//		System.out.println(employee1);
		
		// Find youngest  female employee
//		Employee1 youngFemale = empList.stream().filter(e->e.getGender()=="F").sorted((a,b)->a.getAge()-b.getAge()).findFirst().get();
//		System.out.println(youngFemale);
		
		// Find employees whose age is greater than 30 and less than 30
//		List<Employee1> lessThan30 = empList.stream().filter(e->e.getAge()<30).collect(Collectors.toList());
//		System.out.println(lessThan30);
//		List<Employee1> greaterThan30  = empList.stream().filter(e->e.getAge()>30).collect(Collectors.toList());
//		System.out.println(greaterThan30);
	}
	
	  
}
