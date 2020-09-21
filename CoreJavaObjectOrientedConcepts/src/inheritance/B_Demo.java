package inheritance;

public class B_Demo {
	public static void main(String [] args) {
		
		// Create an Object Bike
		// We are calling the default constructor
		B_Bike b_bike = new B_Bike();
		
		// Returns a string with the kind of handle the bike has
		// We are calling the getHandle() from the B_Bike Class
		b_bike.getHandle();		
		System.out.println(b_bike.getHandle());
		
		// B_Bike Inheriting from the parent class
		// Using getters to access the value from the parent class
		// We are calling the getEngine() from the B_Vehicle Class
		b_bike.getEngine();
		System.out.println(b_bike.getEngine());
		
			}

}
