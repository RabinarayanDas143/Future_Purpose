package com.example.java8CodingQuestion3.IMP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee1 implements Cloneable {

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

		// Find oldest employee
//		OptionalInt employee1 = empList.stream().mapToInt(e->e.getAge()).max();
//		System.out.println(employee1);
//		Employee1 employee1 = empList.stream().sorted((a,b)->b.getAge()-a.getAge()).findFirst().get();
//		System.out.println(employee1);

		// Find youngest female employee
//		Employee1 youngFemale = empList.stream().filter(e->e.getGender()=="F").sorted((a,b)->a.getAge()-b.getAge()).findFirst().get();
//		System.out.println(youngFemale);

		// Find employees whose age is greater than 30 and less than 30
//		List<Employee1> lessThan30 = empList.stream().filter(e->e.getAge()<30).collect(Collectors.toList());
//		System.out.println(lessThan30);
//		List<Employee1> greaterThan30  = empList.stream().filter(e->e.getAge()>30).collect(Collectors.toList());
//		System.out.println(greaterThan30);

		// Find the department name which has the highest number of employees
//		Entry<String, Long> map = empList.stream()
//				.collect(Collectors.groupingBy((e) -> e.getDeptName(), Collectors.counting())).entrySet().stream()
//				.max(Comparator.comparingDouble(e -> e.getValue())).get();
//		System.out.println(map);

		// Find if there any employees from HR Department
		// can use anyMatch also
//		Optional<Employee1> employee1 = empList.stream().filter(e -> e.getDeptName().equalsIgnoreCase("HR")).findAny();
//		employee1.ifPresent(e -> System.out.println("Employee is :" + e));

		// Find the department names that these employees work for, where the number of
		// employees in the department is over 3
//		List<Entry<String, Long>> map = empList.stream()
//				.collect(Collectors.groupingBy((e) -> e.getDeptName(), Collectors.counting())).entrySet().stream()
//				.filter(e -> e.getValue() > 3).collect(Collectors.toList());
//		System.out.println(map);

		// Find distinct department names that employees work for.
//		List<String> emp = empList.stream().map(e->e.getDeptName()).distinct().collect(Collectors.toList());
//        System.out.println(emp);

		// Find all employees who lives in ‘Blore’ city, sort them by their name and
		// print the names of employees.
		List<String> nameList = empList.stream().filter(e -> e.getCity().equalsIgnoreCase("Blore"))
				.sorted((a, b) -> a.getName().compareTo(b.getName())).map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println(nameList);

		// No of employees in the organisation
//		long count = empList.stream().count();
//		System.out.println(count);

		// Find employee count in every department
//		Map<String, Long> map = empList.stream().collect(Collectors.groupingBy((e)->e.getDeptName(),Collectors.counting()));
//		System.out.println(map);

		// Find the department which has the highest number of employees.
//		Optional<Entry<String, Long>> map = empList.stream().collect(Collectors.groupingBy((e)->e.getDeptName(),Collectors.counting()))
//				                .entrySet().stream().max(Comparator.comparingDouble((e)->e.getValue()));
//		System.out.println(map);

		// Sorting a Stream by age and name fields
//		List<Employee1> list = empList.stream().sorted((a,b)->a.getAge()-b.getAge())
//				.sorted((a,b)->a.getName().compareTo(b.getName())).collect(Collectors.toList());
		// list.stream().forEach(System.out::println);
//		Comparator<Employee1> comparator1 = Comparator.comparing(Employee1::getName);
//        Comparator<Employee1> comparator2 = Comparator.comparingInt(Employee1::getAge);
//
//        empList.stream().sorted(comparator1.thenComparing(comparator2)).forEach(System.out::println);

		// Highest experienced employees in the organization
//		Employee1 employee = empList.stream().sorted((a, b) -> a.getYearOfJoining() - b.getYearOfJoining()).findFirst()
//				.get();
//		System.out.println(employee);

		// Print average and total salary of the organization.
//		DoubleSummaryStatistics salary = empList.stream().collect(Collectors.summarizingDouble((e) -> e.getSalary()));
//		System.out.println("The average Salary is :" + salary.getAverage());
//		System.out.println("The total Salary is :" + salary.getSum());

		// Print Average salary of each department
//		Map<String, Double> map = empList.stream().collect(
//				Collectors.groupingBy(Employee1::getDeptName, Collectors.averagingDouble(Employee1::getSalary)));
//		System.out.println(map);

		// Find Highest salary in the organisation
		// Optional<Employee1> employee1 =
		// empList.stream().max(Comparator.comparingDouble((e) -> e.getSalary()));
		// System.out.println(employee1);
//		Employee1 employee1 = empList.stream()
//				.sorted((e1, e2) -> ((Long)e2.getSalary()).compareTo(e1.getSalary())).findFirst().get();
//		System.out.println(employee1);

		// Find Second Highest salary in the organisation
//		Employee1 employee1 = empList.stream().sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary())).skip(1)
//				.findFirst().get();
		// System.out.println(employee1);

		// Nth Highest salary
//		int Nth = 2;
//		Employee1 employee1 = empList.stream().sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary())).skip(Nth-1)
//				.findFirst().get();
//		 System.out.println(employee1);

		// Find highest paid salary in the organisation based on gender
//		Map<String, Optional<Employee1>> map = empList.stream().collect(Collectors.groupingBy(Employee1::getGender,
//				Collectors.maxBy((a, b) -> (int) (a.getSalary() - b.getSalary()))));
//		System.out.println(map);

		// Find lowest paid salary in the organisation based in the organisation
//		Map<String, Optional<Employee1>> map = empList.stream().collect(Collectors.groupingBy(Employee1::getGender,
//				Collectors.minBy((a, b) -> (int) (a.getSalary() - b.getSalary()))));
//		System.out.println(map);

		// sort the employees salary in the organisation in ascending order
//		List<Employee1> list = empList.stream().sorted((a, b) -> (int) (a.getSalary() - b.getSalary()))
//				.collect(Collectors.toList());
//		System.out.println(list);

		// sort the employees salary in the organisation in descending order
//		List<Employee1> list = empList.stream().sorted((a, b) -> (int) (b.getSalary() - a.getSalary()))
//				.collect(Collectors.toList());
//		System.out.println(list);

		// Highest salary based on department
//		Map<String, Optional<Employee1>> map = empList.stream().collect(Collectors.groupingBy(Employee1::getDeptName,
//				Collectors.maxBy(Comparator.comparingLong(Employee1::getSalary))));
//		System.out.println(map);

		// Print list of employee's second highest record based on department
//		Map<String, Employee1> map = empList.stream()
//				.collect(Collectors.groupingBy(Employee1::getDeptName,
//						Collectors.collectingAndThen(Collectors.toList(),
//								e -> e.stream().sorted(Comparator.comparingDouble(Employee1::getSalary).reversed())
//										.skip(1).findFirst().get())));
//		System.out.println(map);

		// sort the employees salary in each department in ascending order
//		Map<String, Stream<Employee1>> map = empList.stream()
//				.collect(Collectors.groupingBy(Employee1::getDeptName, Collectors.collectingAndThen(Collectors.toList(),
//						e -> e.stream().sorted(Comparator.comparingDouble(Employee1::getSalary)))));
//		System.out.println(map);
		
		 
	}

}
