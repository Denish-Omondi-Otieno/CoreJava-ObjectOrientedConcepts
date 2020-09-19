package c_constructors;

public class B_Run_Car2 {

	public static void main(String[] args) {
		
		// Calling a parameterised constructor
		B_Car2 car2 = new B_Car2("closed", "on", "seated",10);
		
		// Calling the run method
		System.out.println(car2.run());

	}

}
