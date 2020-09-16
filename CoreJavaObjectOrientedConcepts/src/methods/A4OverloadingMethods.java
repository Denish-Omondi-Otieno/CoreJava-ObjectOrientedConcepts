package methods;

public class A4OverloadingMethods {

	public static void main(String[] args) {
		System.out.println("Area of rectangle: " + area(12.4, 34.5));
		System.out.println("Area of square: " + area(12, 12));
	}

	// Parameters should at-least not have the same name when overloading a method
	// The name of the method can be the same but the parameters should not
	public static double area(double length, double width) {
		return (length * width);
	}

	public static double area(double side) {
		return (side * side);
	}

	public static int area(int side) {
		return (side * side);

	}
}
