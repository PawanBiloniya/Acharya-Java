package Anudip;

public class Rectangle {
	double width;
	double height;
	enum Color{
		RED,
		GREEN,
		BLUE
	}
	Color boxColor;
	public double calculateArea() {
		return width * height;
	}
	public static void main(String[] args) {
		Rectangle rec= new Rectangle();
		rec.width=10.5;
		rec.height=5.0;
		rec.boxColor= Color.BLUE;
		
		System.out.println("Width: "+ rec.width);
		System.out.println("Height: "+ rec.height);
		System.out.println("Area: "+ rec.calculateArea());
		System.out.println("Box Color: "+ Color.BLUE);
	}
}
