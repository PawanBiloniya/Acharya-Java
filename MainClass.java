package Collage;
import Collage.Employee;
import Collage.Manger;

public class MainClass {

	public static void main(String[] args) {
		Manger managerOne = new Manger(24, "Pawan", 264000.00,
				2500.00, 1200.00, 1000.00, 1000.00, 1100.00, 
				20000.00, true);
		
		managerOne.computeSalary();
		System.out.println("*************************");
		
		Employee employeeOne = new Employee();
		employeeOne.computeSalary();
		// TODO Auto-generated method stub

	}

}
