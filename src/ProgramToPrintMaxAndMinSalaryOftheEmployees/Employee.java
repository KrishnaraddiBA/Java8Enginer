package ProgramToPrintMaxAndMinSalaryOftheEmployees;

public class Employee {
	private int id;
	private String name;
	private String company;
	private int salary;
	private String city;
	public Employee(int id, String name, String company, int salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.salary = salary;
		this.city = city;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary + ", city="
				+ city + "]";
	}
	
	

}
