package entitiesEmployee;

public class employee {
	
	private Integer id;
	private String name;
	private Double Salary;

	public employee() {
	}
	
	public employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	public void increaseSalary(double percentage) {
		Salary += Salary * percentage / 100.0;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
}
