package FilterTheEmployeeWhosAgeisGreatorThan25;

public class Employee {
	private int id;
	private String name;
	private String college;
	private int age;
	public Employee(int id, String name, String college, int age) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.age = age;
	}
	public Employee() {
		super();
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", college=" + college + ", age=" + age + "]";
	}
}
