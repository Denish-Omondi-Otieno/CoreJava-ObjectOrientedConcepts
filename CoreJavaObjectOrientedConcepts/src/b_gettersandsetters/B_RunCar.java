package b_gettersandsetters;

public class B_RunCar {

	public static void main(String[] args) {
		
		// Customized data type
		B_Car2 B_Car2 = new B_Car2();
		
		// We access the properties of the B_Car2 using getters and setters
		// We declared them private 
		// Using getters and setters we can access them
		B_Car2.setDoors("closed");
		B_Car2.setEngine("on");
		B_Car2.setDriver("seated");
		B_Car2.setSpeed(30);
		
		// Display if Car is running
		System.out.println(B_Car2.run());
		
		

	}

}
