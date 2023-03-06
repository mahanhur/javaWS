package ws0228;

public class Manager {
	public String id;
	public String name;
	public int salary;
	public int bonus;
	
	public Manager () {
	}
	
	public Manager (String id, String name, int salary, int bonus) {
		this.id = id;
		this.name = name;
	    if(salary <0 && bonus < 0) {
	    	this.salary = 0;
	    	this.bonus = 0;
	    }else {
	    	this.salary = salary;
	    	this.bonus = bonus;
	    }
	}
	
	public int getAnnSalary() {
		return (this.salary * 12) + this.bonus;
	}
	
	public double getTax() {
		return getAnnSalary() * 0.175;
	}
	
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	
}
