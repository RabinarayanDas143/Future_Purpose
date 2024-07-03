package com.example.java8CodingQuestion3.IMP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.example.Model.Employee;

public class FindAverageSalaryEmp {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Rabi", 20000.00, "IT", "M", LocalDate.of(2020, 1, 15)));
		list.add(new Employee(2, "kolia", 15000.00, "CS", "M", LocalDate.of(2019, 6, 20)));
		list.add(new Employee(3, "Priyanka", 40000.00, "NETWORK", "F", LocalDate.of(2020, 3, 10)));
		list.add(new Employee(4, "Sandesh", 100000.00, "MOBILE", "M", LocalDate.of(2020, 1, 15)));
		list.add(new Employee(5, "Laxmi", 50000.00, "DATABASE", "M", LocalDate.of(2020, 3, 10)));
		list.add(new Employee(6, "Himansu", 60000.00, "IT", "M", LocalDate.of(2019, 6, 20)));
		list.add(new Employee(7, "Amol", 40000.00, "NETWORK", "M", LocalDate.of(2020, 1, 15)));
		list.add(new Employee(8, "Radha", 65000.00, "MOBILE", "F", LocalDate.of(2020, 3, 10)));
		list.add(new Employee(9, "Annat", 45000.00, "MOBILE", "M", LocalDate.of(2019, 6, 20)));
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
