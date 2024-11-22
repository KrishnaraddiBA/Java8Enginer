package GroupByCityByUsingStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}
public class A {
	public static void main(String[] args) {
		List<Employee> li=new ArrayList<Employee>();
	createEmployee(li);
	
	Map<String, List<Employee>> collect = li.stream().collect(Collectors.groupingBy(Employee::getCity));
	
	collect.forEach((k,v)->System.out.println(k+" "+v));
	
	}

	private static void createEmployee(List<Employee> li) {
		Employee e1=new Employee(1, "krishna", "Gadag");
		Employee e2=new Employee(2, "Spurthi", "Bangalore");
		Employee e3=new Employee(3, "Devika", "Davangere");
		Employee e4=new Employee(4, "Tejaswini", "Bangalore");
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
	}
}
