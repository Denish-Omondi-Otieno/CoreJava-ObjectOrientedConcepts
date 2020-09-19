package b_gettersandsetters;

public class B_RunCar {

	public static void main(String[] args) {
		
		// Customised data type
		B_Car2 b_car2 = new B_Car2();
		
		// We access the properties of the B_Car2 using getters and setters
		// We stated them private 
		// Using getters and setters we can access them
		b_car2.setDoors("closed");
		b_car2.setEngine("on");
		b_car2.setDriver("seated");
		b_car2.setSpeed(30);
		
		// Display if Car is running
		System.out.println(b_car2.run());
		
		

	}

}
