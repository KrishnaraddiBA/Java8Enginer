package ProgramToPrintMaxAndMinSalaryOftheEmployees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		//to print a max and min salry of the employees
		List<Employee> li=new ArrayList<Employee>();
		createEmployees(li);
		
//		Optional<Employee> collect = li.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		
		//now to print the min salary of the employees
		
//		System.out.println("the max of the salary is "+collect.get());
//		Optional<Employee> collect2 = li.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
//		System.out.println("the min of the salary is "+collect2.get());
		
		//now to print the max salary of an employee in each company
		
//		Map<String, Optional<Employee>> collect = li.stream().collect(Collectors.groupingBy(Employee::getCompany,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
//	
//		
//		collect.forEach((k,v)->System.out.println(k+" "+v.get()));
		
		//now to print the lowest salary of each company
		
//		Map<String, Optional<Employee>> collect = li.stream().collect(Collectors.groupingBy(Employee::getCompany,Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(Employee::getSalary)))));
//	
//	collect.forEach((k,v)->System.out.println(k+" "+v.get()));
		
		//print how many employees working in each company
		
//		Map<String, Long> collect = li.stream().collect(Collectors.groupingBy(Employee::getCompany,Collectors.counting()));
//		collect.forEach((k,v)->System.out.println(k+" "+v));
		
		//print the list of the employees in the company
		
		Map<String, List<Employee>> collect = li.stream().collect(Collectors.groupingBy(Employee::getCompany));
	
	collect.forEach((k,v)->System.out.println(k+" "+v));
	
	}

	private static void createEmployees(List<Employee> li) {

		Employee e1=new Employee(1, "krishnaraddi", "Adecco India Private Limited", 42000, "Hyderabad");
		Employee e2=new Employee(2, "jyothi", "IBM India Private Limited", 95000, "Hyderabad");
		Employee e3=new Employee(3, "ayush sharma", "IBM India Private Limited", 30000, "Hyderabad");
		Employee e4=new Employee(4, "deepali", "IBM India Private Limited", 30000, "Hyderabad");
		Employee e5=new Employee(5, "shabhaz", "Net Connect Global India Private Limited", 45000, "Hyderabad");
		Employee e6=new Employee(6, "mrudula", "IBM India Private Limited", 30000, "Hyderabad");
		Employee e7=new Employee(7, "devaraju", "Net Connect Global India Private Limited", 60000, "Hyderabad");
		Employee e8=new Employee(8, "suraj", "IBM India Private Limited", 61000, "Hyderabad");
		Employee e9=new Employee(1, "rakesh", "IBM India Private Limited", 70000, "Hyderabad");
		
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		li.add(e5);
		li.add(e6);
		li.add(e7);
		li.add(e8);
		li.add(e9);
		
		
	}
}
