package Anudip;

public class Person {
	String name= "Meera Sharma";
	int age=20;
	int salary= 86900;
	
	public void displayDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Salary: "+ salary);
		
	}
	public static void main(String[] args) {
		Person p= new Person();
		p.displayDetails();
		System.out.println("Test Successful");
	}

}
