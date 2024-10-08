package com.example.java8CodingQuestion3.IMP;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.Model.Employee;
import com.example.coreJava.Deserialization;

public class FindAverageSalaryEmp {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Rabi", 20000.00, "IT", "M", LocalDate.of(2020, 1, 15)));
		list.add(new Employee(2, "kolia", 15000.00, "CS", "M", LocalDate.of(2019, 6, 21)));
		list.add(new Employee(3, "Priyanka", 40000.00, "NETWORK", "F", LocalDate.of(2020, 3, 10)));
		list.add(new Employee(4, "Sandesh", 100000.00, "MOBILE", "M", LocalDate.of(2020, 1, 15)));
		list.add(new Employee(5, "Laxmi", 50000.00, "DATABASE", "M", LocalDate.of(2020, 3, 10)));
		list.add(new Employee(6, "Himansu", 60000.00, "IT", "M", LocalDate.of(2019, 6, 20)));
		list.add(new Employee(7, "Amol", 40000.00, "NETWORK", "M", LocalDate.of(2020, 1, 15)));
		list.add(new Employee(8, "Radha", 65000.00, "MOBILE", "F", LocalDate.of(2020, 3, 10)));
		list.add(new Employee(9, "Annat", 45000.00, "MOBILE", "M", LocalDate.of(2019, 6, 22)));
		list.add(new Employee(10, "Rupali", 70000.00, "CS", "F", LocalDate.of(2020, 1, 15)));

		// OptionalDouble averageSalary = getAverageSalary(list); // This Method use for
		// find average salary
		// System.out.println("The average salary of employee is :" + averageSalary);

		// Find the average salary of Male and Female Employee
		// Map<String, Double> genderSalaryAvg = getAverageSalaryofMaleFemal(list);
		// System.out.println(genderSalaryAvg);

		// Find the employee who joined in a specific year
		// int year = 2020;
		// List<Employee> employeesJoinedInYear = getemployeesJoinedInYear(list, year);
		// System.out.println(employeesJoinedInYear);

		// Find the highest salary of Employee
		// Optional<Employee> emp = getHighestSalaryOfEmp(list);
		// System.out.println(emp);

		// Find the second highest salary of Employee
		// Optional<Employee> employee = getSecondHighestSalary(list);
		// System.out.println(employee);

		// How many employee are there in a department
		// Map<String, Long> map = getEmployeeInEachDepartment(list);
		// System.out.println(map);

		// How many Male and Female employee are in there
		// Map<String, Long> map = getMaleAndFemaleEmployeeCount(list);
		// System.out.println(map);

		// How many Females are in Mobile Department
		// String depatment = "MOBILE", gender = "F";
		// Map<String, Long> map = getFemaleEmployeeInSpecificDepartment(list,
		// depatment, gender);
		// System.out.println(map);

		// Increment the salary of employee in the IT Department by 10 percent
		// String dept = "IT";
		// List<Employee> employe = incrementSalaryByDeptIn10Percent(list, dept);
		// employe.forEach(System.out::println);

		// Find the n th highest salary of employee
		// int Nth = 1;
		// Employee employee = getNthhighestSalary(list, Nth);
		// System.out.println(employee);

		// Find the oldest employee who joining first in company
		// Employee employee = getOldestEmployee(list);
		// System.out.println(employee);

		// compress a String using the Stream API
		// String compressString = getCompressString("aaaabbc");
		// System.out.println(compressString);

		// Find the minimum and maximum salary of employee
		// Map<String, Employee> maxMin = getMaxMinSalaryEmployee(list);
		// System.out.println(maxMin);

		// print only those Employee whose salary is grater than 20k,
		// print only employee name also print only two employee

		List<String> employeeName = getOnlyTwoEmpName(list);
		System.out.println(employeeName);
	}

	private static List<String> getOnlyTwoEmpName(List<Employee> list) {
		List<String> name = list.stream().filter(e -> e.getSalary() > 20000).map(e -> e.getName()).limit(2)
				.collect(Collectors.toList());
		//Stream.iterate(1, n->n+1).limit(10).forEach(System.out::println);
		return name;
	}

	private static Map<String, Employee> getMaxMinSalaryEmployee(List<Employee> list) {
		Employee maxEmp = list.stream().max(Comparator.comparingDouble(e -> e.getSalary())).get();
		Employee minEmp = list.stream().min(Comparator.comparingDouble(e -> e.getSalary())).get();
		Map<String, Employee> map = new HashMap<>();
		map.put("Max", maxEmp);
		map.put("Min", minEmp);
		return map;
	}

	// compress a String using the Stream API
	private static String getCompressString(String string) {
		String str = string.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().map(e -> "" + e.getKey() + e.getValue()).collect(Collectors.joining());
		return str;
	}

	// Find the oldest employee who joining first in company
	private static Employee getOldestEmployee(List<Employee> list) {
		Employee emp = list.stream().sorted((a, b) -> a.getJoiningDate().compareTo(b.getJoiningDate())).findFirst()
				.get();
		return emp;
	}

	// Find the n th highest salary of employee
	private static Employee getNthhighestSalary(List<Employee> list, int nth) {
		Employee emp = list.stream().sorted(Comparator.comparingDouble((e) -> ((Employee) e).getSalary()).reversed())
				.skip(nth - 1).findFirst().get();
		Employee empq = list.stream().sorted((a, b) -> b.getName().compareTo(a.getName())).skip(nth - 1).findFirst()
				.get();
		return emp;
	}

	// Increment the salary of employee in the IT Department by 10 percent
	private static List<Employee> incrementSalaryByDeptIn10Percent(List<Employee> list, String dept) {

		list.stream().filter(e -> e.getDepartment() == dept).forEach((e) -> e.setSalary(e.getSalary() * 1.10));
		List<Employee> emp = list.stream().filter(e -> e.getDepartment() == dept).collect(Collectors.toList());
		return emp;
	}

	// How many Females are in Mobile Department
	private static Map<String, Long> getFemaleEmployeeInSpecificDepartment(List<Employee> list, String depatment,
			String gender) {
		Predicate p = (e) -> ((Employee) e).getDepartment() == "MOBILE";
		Predicate p1 = (e) -> ((Employee) e).getDepartment() == "CS";
		Predicate p2 = (e) -> ((Employee) e).getGender() == gender;
		Map<String, Long> map = (Map<String, Long>) list.stream().filter(p.or(p1).and(p2))
				.collect(Collectors.groupingBy((e) -> ((Employee) e).getGender(), Collectors.counting()));
		return map;
	}

	private static Map<String, Long> getMaleAndFemaleEmployeeCount(List<Employee> list) {
		Map<String, Long> maleFemaleCount = list.stream()
				.collect(Collectors.groupingBy((e) -> e.getGender(), Collectors.counting()));
		return maleFemaleCount;
	}

	// How many employee are there in a department
	private static Map<String, Long> getEmployeeInEachDepartment(List<Employee> list) {
		String str = "CS";
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		return map;
	}

	// Find the second highest salary of Employee
	private static Optional<Employee> getSecondHighestSalary(List<Employee> list) {
		Optional<Employee> employee = list.stream()
				.sorted(Comparator.comparingDouble((e) -> ((Employee) e).getSalary()).reversed()).skip(1).findFirst();
		return employee;
	}

	// Find the highest salary of Employee
	private static Optional<Employee> getHighestSalaryOfEmp(List<Employee> list) {
		Optional<Employee> emp = list.stream().max(Comparator.comparingDouble((e) -> e.getSalary()));
		return emp;
	}

	// Find the employee who joined in a specific year
	private static List<Employee> getemployeesJoinedInYear(List<Employee> list, int year) {
		List<Employee> listEmployee = list.stream().filter(e -> e.getJoiningDate().getYear() == year)
				.collect(Collectors.toList());
		return listEmployee;
	}

	// Find the average salary of Male and Female Employee
	private static Map<String, Double> getAverageSalaryofMaleFemal(List<Employee> list) {
		Map<String, Double> map = list.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingDouble(e -> e.getSalary())));
		return map;
	}

	// This Method use for find average salary
	private static OptionalDouble getAverageSalary(List<Employee> list) {
		OptionalDouble salary = list.stream().mapToDouble(e -> e.getSalary()).average();
		return salary;
	}
}
