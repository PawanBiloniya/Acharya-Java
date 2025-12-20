package Anudip;
public class Student{
	
	private String studentName;
	private String collegeName;
	private int studentID;
	public void setStudentName(String name) {
		this.studentName= name;
	}
	public void setCollegeName(String college) {
		this.collegeName= college;
	}
	public void setStudentId(int ID) {
		this.studentID= ID;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public int getStudentID() {
		return studentID;
	}
	public void displayDetails() {
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Name: " + studentName);
		System.out.println("College Name: " + collegeName);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Pawan Biloniya");
		s1.setCollegeName("Anudip Foundation");
		s1.displayDetails();
		System.out.println("Successful");
		
		
	}
}