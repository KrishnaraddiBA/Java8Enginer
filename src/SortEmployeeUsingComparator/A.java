package SortEmployeeUsingComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A {

	
	//this is sorting the values accorsding to the name
	
	public static void main(String[] args) {
		
		List<Employee> li=new ArrayList<Employee>();
		
		createEmployee(li);
	li.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
	li.forEach(System.out::println);
	}

	private static void createEmployee(List<Employee> li) {
		Employee e1=new Employee(1, "krishna", "TOCE", "Bangalore", 116000);
		Employee e2=new Employee(2, "spurthi", "PES", "Bangalore", 15000);
		Employee e3=new Employee(3, "deepika", "TOCE", "Bangalore", 11600);
		Employee e4=new Employee(4, "jyoti", "TOCE", "Hyderabad", 11000);
		Employee e5=new Employee(5, "anoosha", "TOCE", "Hydearbad", 116500);
		Employee e6=new Employee(6, "suraj", "MECI", "Maharashtra", 116900);
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		li.add(e5);
		li.add(e6);
	}
}
