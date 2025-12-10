import java.security.PublicKey;

public class Employee {
		
		int id;
		String name;
		double salary;
		public Employee(int id, String name, double salary) {
			this.id = id;
			this.name= name;
			this.salary= salary;
		}
		
		public void getSalary() {
			System.out.println("The salary is : "+salary);}
		public void getName() {
			System.out.println("The name is :"+ name);
			
		}
		public static void main(String[] args) {
			Employee emp= new Employee(05, "Pawan", 83500.00);
			System.out.println("Employee Id is :"+emp.id);
			emp.getName();
			Employee emp1 = new Employee(14, "Lokesh", 145000.00);
			System.out.println("Employee id is :"+emp1.id);
			emp1.getName();
			
		}
	}

