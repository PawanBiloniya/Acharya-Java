
public class Student {
	int id;
	String firstname;
	String lastname;
	double fees;
	public Student(int id, String firstname, String lastname, double fees) {
		this.id= id;
		this.firstname= firstname;
		this.lastname= lastname;
		this.fees= fees;
	}
	public void getString() {
		System.out.println("This name is :"+ firstname + "" + lastname);
		
	}
	public void getfees() {
		System.out.println("This fees is :"+ fees);
	}
	public static void main(String[] args) {
		Student stu= new Student(31, "Pawan","Biloniya" ,52500);
		System.out.println("Student Id is :"+stu.id);
		stu.getString();
		stu.getfees();
		
		Student stu1= new Student(52, "Lokesh","Biloniya" ,32000);
		System.out.println("Student Id is :"+stu1.id);
		stu1.getString();
		stu1.getfees();
		
		Student stu2= new Student(66, "Golu","Jonlia" ,64000);
		System.out.println("Student Id is :"+stu2.id);
		stu2.getString();
		stu2.getfees();

		
	}
}
