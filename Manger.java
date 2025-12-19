package Collage;

public class Manger extends Employee {
	double project_bonus;
	boolean project_on_time;
	
	public Manger(int id, String name, double basic_salary, double hra, double ilt, double da, double pf, double tax,
			double project_bonus, boolean project_on_time) {
		super(id, name, basic_salary, hra, ilt, da, pf, tax);
		this.project_bonus = project_bonus;
		this.project_on_time = project_on_time;
	}

	@Override //annotation, which checks if this method is present in super class or not
	public void computeSalary() {
		// TODO Auto-generated method stub
		double netsalary;
		if(project_on_time) {
			 netsalary = basic_salary + hra + da + Ilt - pf - tax + project_bonus;
		}
		else {
			netsalary = basic_salary + hra + da + Ilt - pf - tax;
		}
		System.out.println("The manager net salary of "+id+" whose name is "+name+" is "+ netsalary);
	}

}