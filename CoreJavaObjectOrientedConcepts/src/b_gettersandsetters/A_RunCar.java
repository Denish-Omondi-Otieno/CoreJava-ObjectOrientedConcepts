package b_gettersandsetters;

public class A_RunCar {
 
	public static void main(String[] args) {
		
	// An object is simply a customs data type
	// How do we create a variable 
	// we declare the data type then give it a name and initialise it 
	// in here we declare the custom data type (object) Car 
	// name it car and initialise it to new then call the constructor Car()
	A_Car car = new A_Car();
	
	// calling the set method and passing a parameter value into it
	car.setSpeed (10);
	
	// return a value from the get method
	System.out.println(car.getSpeed());

	}

}
