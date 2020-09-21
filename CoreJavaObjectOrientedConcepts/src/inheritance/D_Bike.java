package inheritance;

public class D_Bike extends D_Vehicle {
	  private String handle;

	  	public D_Bike() {
		super();
		this.handle = "short";
		}

	  	// Passing the values to the parametrised constructor
	  	// We pass the values to the super method 
	  	// The super method passes the value to the parametrised parent constructor
	  	// we are making a call to the parent parameterised constructor
	  	// where possible we override the original value
	public D_Bike(String handle,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats,fuelTank, lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

		  
	   

}
