package ws0228;

public class App {

	public static void main(String[] args) {
Employee empArr[] = new Employee[5];
		
		empArr[0] = new Employee("0001","David",1000);
		empArr[1] = new Employee("0002","Tom",2000);
		empArr[2] = new Employee("0003","Jenny",3000);
		empArr[3] = new Employee("0004","Rose",4000);
		empArr[4] = new Employee("0005","Clara",5000);
		
		
		for(Employee k : empArr){
			System.out.println(k);
			System.out.printf("연봉은 %d, 세금은 %4.2f \n", k.getAnnSalary() , k.getTax());
			System.out.println("---------");
		}
		
	
	}
		

	}


