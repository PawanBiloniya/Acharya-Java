package Collage;

public class Employee {
	int id;
	String name;
	double basic_salary;
	double hra;
	double Ilt;
	double da;
	double pf;
	double tax;
	static String compayname ="Renu Enterprises";
	
	public Employee() {
		
	}

	public Employee(int id, String name, double basic_salary, double hra, double ilt, double da, double pf,
			double tax) {
		super();
		this.id = id;
		this.name = name;
		this.basic_salary = basic_salary;
		this.hra = hra;
		Ilt = ilt;
		this.da = da;
		this.pf = pf;
		this.tax = tax;
	}
	public void computerSalary() {
		double netSalary= basic_salary+hra+Ilt+da+pf-tax;
		System.out.println("The net salary of  "+id+"Who Name Is "+netSalary);
		
	}

	public void computeSalary() {
		// TODO Auto-generated method stub
		
	}
}
