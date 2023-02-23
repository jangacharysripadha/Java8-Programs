package com.core.java.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(10, "chary", 25, 10000));
		list.add(new Employee(9, "vivek", 35, 100000));
		list.add(new Employee(5, "praveen", 23, 30000));
		list.add(new Employee(15, "ramana", 27, 50000));
		list.add(new Employee(3, "shekher", 28, 80000));
		list.add(new Employee(15, "ramana", 27, 50000));
		list.add(new Employee(3, "shekher", 28, 80000));
		list.add(new Employee(15, "ramana", 27, 50000));
		list.add(new Employee(3, "shekher", 28, 80000));

		// list of all employees
		list.forEach(n -> System.out.println(n));
		System.out.println("+++++++++++++++++++++++++++");
		// sorting for employee names
		list.sort((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
		list.forEach(n -> System.out.println(n));
		System.out.println("=============================");

		list.sort((Employee e1, Employee e2) -> e1.getAge() - e2.getAge());
		list.forEach(n -> System.out.println(n));
		System.out.println("-------------------------------------------");
		// employee age greater than 26 to print
		List<Employee> age = list.stream().filter(e -> e.getAge() < 26).collect(Collectors.toList());
		age.forEach(n -> System.out.println(n));
        System.out.println("==============================================");
        list.sort((Employee e1,Employee e2)-> e1.getSalary()-e2.getSalary());
        list.forEach(n->System.out.println(n));
		
		
	}

}
