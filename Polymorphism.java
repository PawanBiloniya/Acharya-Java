
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism poly= new Polymorphism();
		System.out.println("Circle area "+poly.area(1.00));
		System.out.println("Rectangle area "+poly.area(6.00));
		System.out.println("Square area "+poly.area(3));
	}
	public int area(int side) {
		int area = side*side;
		return area;
	}
	public double area(double radius){
		double area = 3.14 * radius * radius;
		return area;
		
	}
}
