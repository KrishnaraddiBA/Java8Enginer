package SortEmployeeUsingComparator;

public class Employee {

	private int id;
	private String name;
	private String college;
	private String city;
	private int salary;
	public Employee(int id, String name, String college, String city, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.city = city;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", college=" + college + ", city=" + city + ", salary="
				+ salary + "]";
	}
	
	
	
}
