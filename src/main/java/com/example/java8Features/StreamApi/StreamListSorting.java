package com.example.java8Features.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamListSorting {
	public static void main(String[] rags) {
		List<String> list = new ArrayList<>();
		list.add("mango");
		list.add("apple");
		list.add("banna");
		list.add("fruits");
		list.add("orange");
		 
		// this one ascending order
		List<String> str = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		List<String> strlambda = list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		// str.forEach(System.out::println);
		// strlambda.forEach(System.out::println);

		// this one for descending order
		List<String> str1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		List<String> str1lambda = list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		// str1.forEach(System.out::println);
		// str1lambda.forEach(System.out::println);

		// sort employeee by salary basis .
		List<EmploeeModel> employee_List = new ArrayList<>();
		employee_List.add(new EmploeeModel(01, "Rabi", 26, 21000));
		employee_List.add(new EmploeeModel(02, "Saurabh", 22, 14000));
		employee_List.add(new EmploeeModel(03, "Himansu", 23, 69000));
		employee_List.add(new EmploeeModel(04, "S.Newgen", 24, 45000));
		employee_List.add(new EmploeeModel(05, "Ankit", 25, 107000));
		employee_List.add(new EmploeeModel(06, "Zain", 26, 360));
		employee_List.add(new EmploeeModel(07, "Ram", 20, 200000));

		List<EmploeeModel> sortEmp = employee_List.stream().sorted(new Comparator<EmploeeModel>() {

			@Override
			public int compare(EmploeeModel o1, EmploeeModel o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getSalary() - o2.getSalary());
			}
		}).collect(Collectors.toList());
		// System.out.println(sortEmp);
		// sortEmp.forEach(System.out::println);

		// using lambda expression
		List<EmploeeModel> sortLambda = employee_List.stream()
				.sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
		// sortLambda.forEach(System.out::println);
		List<EmploeeModel> sortLambdaDesc = employee_List.stream()
				.sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
		// sortLambdaDesc.forEach(System.out::println);

		List<EmploeeModel> ageSortByAsce = employee_List.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge())
				.collect(Collectors.toList());
		// ageSortByAsce.forEach(System.out::println);

		List<EmploeeModel> ageSortByDsce = employee_List.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge())
				.collect(Collectors.toList());
		// ageSortByDsce.forEach(System.out::println);

		List<EmploeeModel> nameSortByAsce = employee_List.stream().sorted(Comparator.comparing(EmploeeModel::getName))
				.collect(Collectors.toList());
		// nameSortByAsce.forEach(System.out::println);
		List<EmploeeModel> nameSortByDesc = employee_List.stream()
				.sorted(Comparator.comparing(EmploeeModel::getName).reversed()).collect(Collectors.toList());
		nameSortByDesc.forEach(System.out::println);
	}
}
