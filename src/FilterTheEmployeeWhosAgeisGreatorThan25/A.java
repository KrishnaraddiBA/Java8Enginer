package FilterTheEmployeeWhosAgeisGreatorThan25;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		List<Employee> li=new ArrayList<Employee>();
		
		createEmployee(li);
		
		//to filter the employee whoose age is greator than 25

		List<Employee> collect = li.stream().filter(s->s.getAge()>29).collect(Collectors.toList());
	
	collect.forEach(System.out::println);	
		
	
	//now to print only name of the employee
	List<String> collect2 = li.stream().map(Employee::getName).collect(Collectors.toList());
	
	collect2.forEach(System.out::println);
	
	}

	private static void createEmployee(List<Employee> li) {
		Employee e1=new Employee(1, "krishna", "toce", 27);
		Employee e2=new Employee(2, "jyothi", "hoce", 32);
		Employee e3=new Employee(3, "anoosha", "hmce", 26);
		Employee e4=new Employee(4, "suraj", "mhce", 28);
		Employee e5=new Employee(1, "shabhaz", "aoce", 27);
		Employee e6=new Employee(1, "raksesh", "woce", 29);
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		li.add(e5);
		li.add(e6);
	}
}
