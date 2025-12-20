package Anudip;

public class Employee {
	protected int id;
	protected int age;
	protected String name;
	protected boolean isPermanent;
	
	public void displayDetails() {
		System.out.println("Employee ID: "+ id);
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee Age: "+ age);
		System.out.println("Is Permanent: "+ isPermanent);
	}
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.id= 1001;
		emp.name= "Meera";
		emp.age= (int) 20;
		emp.isPermanent= true;
		emp.displayDetails();
		System.out.println("Successfully Started");
	}

}
