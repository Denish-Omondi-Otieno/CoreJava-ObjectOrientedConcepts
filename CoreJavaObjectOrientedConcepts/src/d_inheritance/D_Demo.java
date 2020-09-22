package d_inheritance;

public class D_Demo {
	public static void main(String [] args) {
		
		// The value we set for the parametrised constructor 
		// We pass the same values using super method to the parents parametrised constructor
		// we then display the values
		// By setting the value we can be able to override the original value from the parents paramerised constructor.
		D_Bike d_bike = new D_Bike("long", "Deisel", 4, 4, 40, "LED");
		
		System.out.println("Handle: " +d_bike.getHandle());
		System.out.println("Engine type: " +d_bike.getEngine());
		System.out.println("Number of seats: " +d_bike.getSeats());
		System.out.println("Fuel tank capacity: " +d_bike.getFuelTank());
		System.out.println("Head lamp type: " +d_bike.getLights());
		System.out.println("Number of wheels: " +d_bike.getWheels());
			}

}
