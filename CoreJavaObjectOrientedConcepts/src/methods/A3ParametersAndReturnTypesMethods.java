package methods;

public class A3ParametersAndReturnTypesMethods {
	public static void main(String[] args) {

		System.out.println("The are of a rectangle with length 3.4 and width 2.6 is: ");
		areaRectangle(3.4, 2.6);
		
		// We are not calling the method directly from the sysout.
		// The areRectangle is simply displaying the value from the method 
		// we can't display the information directly from a sysout unless its
		// returning a type
		
		System.out.println("The perimetr of a rectangle with length 3.4 and width 2.6 is: " + perimeterRectangle(3.4, 2.6));
		
		// we are calling the method directly from the sysout because we are returning a type
		// Return type for perimeterRectangle is a double

	}

	public static void areaRectangle(double length, double width) {
		System.out.println(length * width);
	}
	
	public static double perimeterRectangle(double length, double width) {
		return (length + width);
	}
}
