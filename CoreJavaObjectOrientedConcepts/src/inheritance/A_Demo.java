package inheritance;

public class A_Demo {
	public static void main(String [] args) {
		
		// Create an Object Bike
		A_Bike a_bike = new A_Bike();
		
		// We are accessing the contents of the bike class
		a_bike.handle = "short";
		
		// We are accessing the extended vehicle properties
		a_bike.engine = "Petrol";
		
		System.out.println(a_bike.handle);
		System.out.println(a_bike.engine);
		
		// Will give a null out put because lights is not initialised
		System.out.println(a_bike.lights);
		
	}

}
