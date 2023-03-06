package ws0228;

public class Employee {

	public String id;
	public String name;
	public int salary;

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		if (salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
	}

	public int getAnnSalary() {
		return this.salary * 12;
	}

	public double getTax() {
		return this.salary * 0.175;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
