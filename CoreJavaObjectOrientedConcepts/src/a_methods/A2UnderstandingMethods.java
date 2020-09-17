package a_methods;

public class A2UnderstandingMethods {
	
	public static void main (String [] args) {
		//Calling the method
		loop(1,10);
		System.out.println("*****************");
		loop(20,40);
		System.out.println("*****************");
	}
	
	// A method
	// Modifier: Public
	// Return Type: Void
	// Method Name: Loop
	// Parameter List: int step, int finalValue
	// Method body: While loop
	public static void loop (int step, int finalValue) {
		while (step<=finalValue) {
			System.out.println(step);
			step++;
		}
	}

}
