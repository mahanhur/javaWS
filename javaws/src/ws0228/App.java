package ws0228;

public class App {
	public static void main(String[] args) {
		// Manager App
		Manager manarr[] = new Manager[5];
		Manager manager1 = new Manager("001", "Alex", 2500000, 100000);
		Manager manager2 = new Manager("002", "Bob", 3000000, 200000);
		Manager manager3 = new Manager("003", "Cyndra", 3500000, 300000);
		Manager manager4 = new Manager("004", "Dale", 4000000, 400000);
		Manager manager5 = new Manager("005", "Emily", 4500000, 500000);
		manarr[0] = manager1;
		manarr[1] = manager2;
		manarr[2] = manager3;
		manarr[3] = manager4;
		manarr[4] = manager5;
		int sum = 0;
		for (Manager m : manarr) {
			System.out.println(m.toString());
			System.out.printf("AnnSalary = %d, Tax = %f\n", m.getAnnSalary(), m.getTax());
			sum += m.getAnnSalary();
		}
		System.out.printf("manager AnnSalary sum =%d\n\n", sum);
        //Employ App
		Employee empArr[] = new Employee[5];
		empArr[0] = new Employee("0001", "David", 1000);
		empArr[1] = new Employee("0002", "Tom", 2000);
		empArr[2] = new Employee("0003", "Jenny", 3000);
		empArr[3] = new Employee("0004", "Rose", 4000);
		empArr[4] = new Employee("0005", "Clara", 5000);
		for (Employee k : empArr) {
			System.out.println(k);
			System.out.printf("연봉은 %d, 세금은 %4.2f \n", k.getAnnSalary(), k.getTax());
			System.out.println("---------");
		}
	}
}

